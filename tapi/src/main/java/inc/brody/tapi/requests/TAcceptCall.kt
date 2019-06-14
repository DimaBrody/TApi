package inc.brody.tapi.requests

import inc.brody.tapi.utils.Session
import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAcceptCall(
    callId: Int,
    protocol: TdApi.CallProtocol,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AcceptCall>(
    TdApi.AcceptCall(callId,protocol),onError,onSuccess)