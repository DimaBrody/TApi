package inc.brody.tapi.utils.responses

import android.content.Context
import android.view.View
import org.drinkless.td.libcore.telegram.TdApi

abstract class ErrorResponse {
    abstract fun debugError(error: TdApi.Error)
}