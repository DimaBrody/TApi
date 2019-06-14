package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddNetworkStatistics (
    verbosityLevel: Int,
    text: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddLogMessage>(
    TdApi.AddLogMessage(verbosityLevel,text),onError,onSuccess)