package inc.brody.tapi.requests

import inc.brody.tapi.utils.Session
import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAcceptCall(
    callId: Int,
    protocol: TdApi.CallProtocol,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AcceptCall>(
    TdApi.AcceptCall(callId,protocol),error,callback)