package inc.brody.tapi.utils.requests

import android.os.Handler
import android.os.Looper
import android.util.Log
import inc.brody.tapi.utils.TelegramAPIController
import inc.brody.tapi.utils.callbacks.Callback
import inc.brody.tapi.utils.callbacks.SimpleCallback
import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.Client
import org.drinkless.td.libcore.telegram.TdApi

@Suppress("UNCHECKED_CAST")
open class TelegramApiRequest<F>(
    val function: TdApi.Function
) : ApiRequest(),Client.ResultHandler {

    val mainHandler = Handler(Looper.getMainLooper())
    var callback: Callback? = null
    private var canceled = false

    fun exec() : TelegramApiRequest<F> {
        TelegramAPIController.addHandler(this)
        TelegramAPIController.execute(this as TelegramApiRequest<Any?>)
        return this
    }

    fun execSync() : F = TelegramAPIController.executeSync(function) as F

    override fun onResult(`object`: TdApi.Object?) {
        if(callback != null && !canceled)
            mainHandler.post {
                if(`object` is TdApi.Error){
                    callback?.onError(TelegramErrorResponse(`object`))
                }

                else {
                    callback?.onSuccess(`object`)
                }

            }
    }

    override fun cancel(){
        canceled = true
    }

    fun setCallbackDef(callback: Callback) : TelegramApiRequest<F>{
        this.callback = callback
        return this
    }

    inline fun setCallback(
        crossinline error: (ErrorResponse) -> Unit,
        crossinline callback: (TdApi.Object?) -> Unit
    ) : TelegramApiRequest<F> {
        this.callback = object : SimpleCallback(){

            override fun onError(errorResponse: ErrorResponse) {
                error(errorResponse)
            }

            override fun onSuccess(`object`: TdApi.Object?) {
                callback(`object`)
            }

        }
        return this
    }

    fun parse(`object`: TdApi.Object?) : F = `object` as F
}