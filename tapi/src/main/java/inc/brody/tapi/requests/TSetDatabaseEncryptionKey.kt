package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TSetDatabaseEncryptionKey(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) :   TRequest<TdApi.SetDatabaseEncryptionKey>(TdApi
    .SetDatabaseEncryptionKey("encryption key".toByteArray()),error,callback)