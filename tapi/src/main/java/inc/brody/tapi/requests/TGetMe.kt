package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TGetMe(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess:((TdApi.Object?)->Unit)? = null
): TRequest<TdApi.GetMe>(
    TdApi.GetMe(),onError,onSuccess)