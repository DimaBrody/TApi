package inc.brody.telegramaudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import inc.brody.tapi.TApi
import inc.brody.tapi.data.appdata.TConstants
import inc.brody.tapi.requests.TAddChatMember
import inc.brody.tapi.requests.TGetChats
import inc.brody.tapi.utils.Session
import kotlinx.android.synthetic.main.activity_main.*
import org.drinkless.td.libcore.telegram.TdApi

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val telegramApi = TApi.init(this.applicationContext)

        telegramApi.authState.setOnChangeListener {
            Log.d("TApiMain", it.toString())
            when (it) {
                TConstants.AUTH_WAIT_PHONE -> {
                    telegramApi.sendCodeOnPhone("380997236201")
                }
                TConstants.AUTH_WAIT_CODE -> {
                    btnLogin.setOnClickListener {
                        telegramApi.loginWithReceivedCode(editText.text.toString())
                    }
                }
                TConstants.AUTH_OK -> {
                    Log.d("TApiMain", Session.user.username + "!!!")

                    TGetChats {chats->
                        if(chats is TdApi.Chats){
                            Log.d("TApiMain",chats.chatIds.size.toString())
                        }
                    }
                }
            }
        }


        telegramApi.signedState.setOnChangeListener {
            when (it) {
                TConstants.UPDATE_USER -> {
                    Log.d("TApiMain", Session.user.username)

                }
            }
        }

    }

}
