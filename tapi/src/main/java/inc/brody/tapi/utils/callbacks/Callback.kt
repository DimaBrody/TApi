package inc.brody.tapi.utils.callbacks

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

interface Callback {
    fun onError(errorResponse: ErrorResponse)

    fun onSuccess(`object`: TdApi.Object?)
}