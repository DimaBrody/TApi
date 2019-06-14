package inc.brody.tapi.utils.callbacks

import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

interface Callback {
    fun onError(errorResponse: TelegramErrorResponse)

    fun onSuccess(`object`: TdApi.Object?)
}