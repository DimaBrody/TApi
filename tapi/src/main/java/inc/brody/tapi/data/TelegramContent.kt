package inc.brody.tapi.data

import inc.brody.tapi.data.entity.TChat
import org.drinkless.td.libcore.telegram.TdApi

object TelegramContent {
    var currentUser: TdApi.User? = null
    var currentChatMap = mutableMapOf<String,Long>()
    var currentChatList = mutableListOf<TChat>()

    var chatsSize = 0
}