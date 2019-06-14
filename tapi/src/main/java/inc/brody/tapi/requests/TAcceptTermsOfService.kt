package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAcceptTermsOfService(
    termsOfService: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AcceptTermsOfService>(
    TdApi.AcceptTermsOfService(termsOfService),error,callback)