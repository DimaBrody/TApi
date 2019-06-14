package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddCustomServerLanguagePack (
    languagePackId: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddCustomServerLanguagePack>(
    TdApi.AddCustomServerLanguagePack(languagePackId),error,callback)