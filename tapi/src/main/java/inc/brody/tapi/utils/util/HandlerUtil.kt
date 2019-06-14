package inc.brody.tapi.utils.util

import org.drinkless.td.libcore.telegram.Client

object HandlerUtil {
    @Volatile private var dir: String = "sdd"
    @Volatile private var filesDir: String = ""
    @Volatile private var instance: Client? = null
    @Volatile private var updatesHandler: Client.ResultHandler? = null

    fun setUpdatesHandler(updatesHandler: Client.ResultHandler) = synchronized(this){
        this.updatesHandler = updatesHandler
        instance?.setUpdatesHandler(this.updatesHandler)
    }

    fun setDir(dir: String) = synchronized(this){
        this.dir = dir
    }

    fun setFilesDir(dir: String) = synchronized(this){
        this.filesDir = dir
    }

    fun stopClient() = synchronized(this){
        instance = null
        updatesHandler = null
    }

    fun getClientInstance() : Client? {
        return instance?: synchronized(this){
            val local = Client.create(updatesHandler,null,null)
            instance = local
            instance
        }
    }
}