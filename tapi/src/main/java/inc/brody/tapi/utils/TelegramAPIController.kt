package inc.brody.tapi.utils

import android.util.Log
import inc.brody.tapi.utils.requests.TelegramApiRequest
import inc.brody.tapi.utils.util.HandlerUtil
import org.drinkless.td.libcore.telegram.Client
import org.drinkless.td.libcore.telegram.TdApi

import java.lang.Exception
import java.lang.IllegalArgumentException
import java.util.concurrent.CyclicBarrier

object TelegramAPIController {

    private var client: Client? = null
    private var clientRunning = false
    private var pendingRequests = mutableListOf<TelegramApiRequest<Any?>>()
    private val resultHandlers = HashSet<Client.ResultHandler>()

    private class UpdateHandler : Client.ResultHandler {
        override fun onResult(`object`: TdApi.Object?) {
            //Log.d("TApiu", `object`.toString())
            //onUpdate(`object`)
            onUpdateHandlers(`object`)
        }
    }

    fun onUpdateHandlers(`object`: TdApi.Object?) {
        resultHandlers.forEach {
            it.onResult(`object`)
        }
    }

    fun addHandler(handler: Client.ResultHandler) {
        resultHandlers.add(handler)
    }

    fun execute(req: TelegramApiRequest<Any?>) {
        if (!clientRunning) {
            pendingRequests.add(req)
            Log.d("TApi", "$req Done")
        } else {
            client?.send(req.function, req)
            Log.d("TApi", req.toString() + "SENT")
        }

    }

    fun init() {
        HandlerUtil.setUpdatesHandler(UpdateHandler())
        client = HandlerUtil.getClientInstance()
        //Thread(client).start()
        clientRunning = true
        while (pendingRequests.size > 0)
            execute(pendingRequests.removeAt(0))
    }

    fun stop() {
        HandlerUtil.stopClient()
        clientRunning = false
        client = null
    }

    fun mapClassToConstants(classes: Array<Class<Any?>>, constants: Array<Int>, `object`: TdApi.Object?): Int {
        if (classes.size != constants.size)
            throw IllegalArgumentException()
        for (i in 0 until classes.size)
            if (classes[i].isInstance(`object`))
                return constants[i]
        return -1
    }

    fun executeSync(req: TdApi.Function): TdApi.Object? {
        while (!clientRunning)
            Thread.yield()
        val result = arrayOfNulls<TdApi.Object?>(1)
        val barrier = CyclicBarrier(2)
        client?.send(req) {
            result[0] = it
            try {
                barrier.await()
            } catch (e: Exception) {
            }
        }
        try {
            barrier.await()
        } catch (e: Exception) {
        }
        return result[0]
    }

    fun onUpdate(`object`: TdApi.Object?) {
        when (`object`) {
            is TdApi.UpdateOption -> {
                if (`object`.name == "my_id")
                    Session.myId = safeGetOptInt(`object`.value)
            }
            is TdApi.UpdateFile -> {
                val file = `object`
                return
            }
            is TdApi.UpdateUser -> {
                if (`object`.user.id == Session.myId)
                    Session.setMyProfile(`object`.user)
            }
        }
    }

    private fun safeGetOptInt(value: TdApi.OptionValue): Int {
        if (value is TdApi.OptionValueEmpty)
            return 0
        return (value as TdApi.OptionValueInteger).value
    }

}