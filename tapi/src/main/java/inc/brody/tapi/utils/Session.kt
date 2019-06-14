package inc.brody.tapi.utils

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import inc.brody.tapi.data.appdata.TConstants
import inc.brody.tapi.data.entity.TUser
import inc.brody.tapi.requests.TGetMe
import inc.brody.tapi.requests.TLogOut
import inc.brody.tapi.requests.TSetDatabaseEncryptionKey
import inc.brody.tapi.requests.TSetTdlibParameters
import org.drinkless.td.libcore.telegram.TdApi

@SuppressLint("StaticFieldLeak")
object Session {
    private val TAG = "TApi_session"
    private var mContext: Context? = null

    var myPhone: String = ""
    var myCode: String = ""
    var myPassword: String = ""
    var myId: Int = -1

    private var tdlibUser: TdApi.User? = null
    private val _user: TUser = TUser()

    val user : TUser
        get(){
            _user.firstName = tdlibUser?.firstName?:""
            _user.lastName = tdlibUser?.lastName?:""
            _user.username = tdlibUser?.username?:""
            return _user
        }

    fun setMyProfile(user: TdApi.User) =
        apply {
            this.tdlibUser = user
        }

    /*fun getChats(){
        TGetChats {
            if(it is TdApi.Chats){
                TelegramContent.chatsSize = it.chatIds.size
                for(long in it.chatIds){
                    TGetChat(long){ chatL->
                        if(chatL is TdApi.Chat){
                            Log.d(TAG+"QQQ",chatL.title)
                            TelegramContent.currentChatList.add(TChat(
                                chatL.id,
                                chatL.title,
                                chatL.photo?.small,
                                chatL.photo?.big,
                                chatL.lastMessage?.content.toString(),
                                chatL.order,
                                chatL.isPinned,
                                chatL.isMarkedAsUnread,
                                chatL.canBeDeletedOnlyForSelf,
                                chatL.canBeDeletedForAllUsers,
                                chatL.isSponsored,
                                chatL.canBeReported,
                                chatL.defaultDisableNotification,
                                chatL.unreadCount,
                                chatL.lastReadInboxMessageId,
                                chatL.lastReadOutboxMessageId,
                                chatL.unreadMentionCount,
                                chatL.pinnedMessageId,
                                chatL.replyMarkupMessageId,
                                chatL.clientData
                            ))
                        }
                    }
                }
            }
        }
    }*/

    fun init(context: Context) {
        mContext = context
    }

    fun confirmLogout() = TLogOut { Log.d(TAG, it.toString()) }

    fun checkAuthState(state: TdApi.UpdateAuthorizationState): Int {
        when (state.authorizationState.constructor) {
            TdApi.AuthorizationStateClosed.CONSTRUCTOR -> {
                return TConstants.AUTH_CLOSED
            }
            TdApi.AuthorizationStateWaitEncryptionKey.CONSTRUCTOR -> {
                TSetDatabaseEncryptionKey { key ->
                    Log.d(TAG, key.toString() + "Done")
                }
                return TConstants.AUTH_PREPARATION
            }
            TdApi.AuthorizationStateWaitPhoneNumber.CONSTRUCTOR -> {
                return TConstants.AUTH_WAIT_PHONE
            }
            TdApi.AuthorizationStateWaitCode.CONSTRUCTOR -> {
                return TConstants.AUTH_WAIT_CODE
            }
            TdApi.AuthorizationStateWaitPassword.CONSTRUCTOR -> {
                return TConstants.AUTH_WAIT_PASS
            }
            TdApi.AuthorizationStateLoggingOut.CONSTRUCTOR -> {
                return TConstants.AUTH_LOGGING_OUT
            }
            TdApi.AuthorizationStateReady.CONSTRUCTOR -> {
                Log.d(TAG, "Auth is OK!")
                TGetMe {
                    if(it is TdApi.User){
                        Log.d(TAG + "DDD",it.toString())
                        setMyProfile(it)
                    }

                }
                //TGetMe { setMyProfile((it as TdApi.UpdateConnectionState)) }
                return TConstants.AUTH_OK
            }
            TdApi.AuthorizationStateWaitTdlibParameters.CONSTRUCTOR -> {
                TSetTdlibParameters(
                    mContext ?: throw NullPointerException("Passed context is null")
                )
                return TConstants.AUTH_PREPARATION
            }
            else ->
                return TConstants.AUTH_UNKNOWN
        }
    }
}