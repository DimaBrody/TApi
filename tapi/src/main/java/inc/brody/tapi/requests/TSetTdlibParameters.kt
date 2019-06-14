package inc.brody.tapi.requests

import android.content.Context
import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TSetTdlibParameters(
    context: Context,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetTdlibParameters>(TdApi.SetTdlibParameters(createParameters(context)),error,callback){
    companion object {
        private fun createParameters(context: Context): TdApi.TdlibParameters {
            val tdlibParameters = TdApi.TdlibParameters()
            tdlibParameters.databaseDirectory = context.filesDir.absolutePath
            tdlibParameters.useMessageDatabase = true
            tdlibParameters.useChatInfoDatabase = true
            tdlibParameters.useTestDc = false
            tdlibParameters.useSecretChats = false
            tdlibParameters.apiId = 751956
            tdlibParameters.apiHash = "68dc63550a48a9070db06deba8c3728c"
            tdlibParameters.systemLanguageCode = "ru"
            tdlibParameters.deviceModel = "Android"
            tdlibParameters.systemVersion = "Unknown"
            tdlibParameters.applicationVersion = "1.0"
            tdlibParameters.enableStorageOptimizer = true
            tdlibParameters.useFileDatabase = true
            return tdlibParameters
        }
    }
}