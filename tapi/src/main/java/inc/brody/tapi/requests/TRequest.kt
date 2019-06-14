package inc.brody.tapi.requests

import android.util.Log
import inc.brody.tapi.utils.requests.TelegramApiRequest
import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi
import kotlin.reflect.KClass


open class TRequest<T>(
    function: TdApi.Function,
    var error: ((ErrorResponse) -> Unit)? = null,
    var callbackL: ((TdApi.Object?) -> Unit)? = null
) : TelegramApiRequest<T>(function) {
    init {
        if(error == null)
           error = { Log.d("TApi", "$it Error") }

        if(callbackL == null)
            callbackL = {Log.d("TApi", it.toString() + "Ok")}

        super.setCallback(error!!,callbackL!!)
        super.exec()
    }
}