package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddSavedAnimation (
    animation: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddSavedAnimation>(
    TdApi.AddSavedAnimation(animation),error,callback)