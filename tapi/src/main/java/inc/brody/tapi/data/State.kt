package inc.brody.tapi.data

class State {
    var listener: ChangeListener? = null
    var value: Int = 0

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