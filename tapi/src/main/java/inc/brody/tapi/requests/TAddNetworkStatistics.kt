package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddNetworkStatistics (
    verbosityLevel: Int,
    text: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddLogMessage>(
    TdApi.AddLogMessage(verbosityLevel,text),error,callback)