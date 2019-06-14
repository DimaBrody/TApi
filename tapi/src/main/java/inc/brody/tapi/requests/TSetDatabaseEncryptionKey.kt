package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TSetDatabaseEncryptionKey(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) :   TRequest<TdApi.SetDatabaseEncryptionKey>(TdApi
    .SetDatabaseEncryptionKey("encryption key".toByteArray()),onError,onSuccess)