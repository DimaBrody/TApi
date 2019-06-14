package inc.brody.tapi.requests

import android.util.Log
import inc.brody.tapi.utils.requests.TelegramApiRequest
import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi
import kotlin.reflect.KClass


open class TRequest<T>(
    function: TdApi.Function,
    var onError: ((TelegramErrorResponse) -> Unit)? = null,
    var callbackL: ((TdApi.Object?) -> Unit)? = null
) : TelegramApiRequest<T>(function) {
    init {
        if(onError == null)
           onError = { Log.d("TApi", "$it Error") }

        if(callbackL == null)
            callbackL = {Log.d("TApi", it.toString() + "Ok")}

        super.setCallback(onError!!,callbackL!!)
        super.exec()
    }
}