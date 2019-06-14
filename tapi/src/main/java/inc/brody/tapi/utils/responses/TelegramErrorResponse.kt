package inc.brody.tapi.utils.responses

import android.content.Context
import android.util.Log
import android.view.View
import org.drinkless.td.libcore.telegram.TdApi

class TelegramErrorResponse(
    val error: TdApi.Error
) : ErrorResponse() {
    init {
        Log.d("TApiError",error.toString())
    }

    override fun debugError(error: TdApi.Error) {
        Log.d("TApiError",error.toString())
    }

}