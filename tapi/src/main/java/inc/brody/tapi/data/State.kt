package inc.brody.tapi.data

import inc.brody.tapi.utils.responses.TelegramErrorResponse

class State {
    var listener: ChangeListener? = null
    var value: Int = 0
    var error: TelegramErrorResponse? = null

    inline fun setOnChangeListener(crossinline callback:(Int)->Unit){
        listener = object : ChangeListener {
            override fun onChange() {
                callback(value)
            }
        }
    }

    interface ChangeListener {
        fun onChange()
    }
}