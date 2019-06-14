package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TBlockUser (
    userId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.BlockUser>(
    TdApi.BlockUser(userId),error,callback)