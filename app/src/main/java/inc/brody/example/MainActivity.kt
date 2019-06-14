package inc.brody.example

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import inc.brody.tapi.TApi
import inc.brody.tapi.data.appdata.TConstants
import inc.brody.tapi.requests.TGetChats
import inc.brody.tapi.utils.Session
import kotlinx.android.synthetic.main.activity_main.*
import org.drinkless.td.libcore.telegram.TdApi

class MainActivity : AppCompatActivity() {

    private val TAG = "TApiMain"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Init telegram API here, we will probably need variable
        // 'telegramApi' later, so it'd be better to make it global.
        val telegramApi = TApi.init(this.applicationContext)

        telegramApi.authState.setOnChangeListener {
            when (it) {
                TConstants.AUTH_WAIT_PHONE -> {
                    telegramApi.sendCodeOnPhone("...")
                    //There is going to be the whore number with country code

                }
                TConstants.AUTH_WAIT_PASS->{
                    telegramApi.loginWithPassword("password")
                    //It also can require a Telegram password (Never faced it IRL)
                }
                TConstants.AUTH_WAIT_CODE -> {
                    btnLogin.setOnClickListener {
                        telegramApi.loginWithReceivedCode(editText.text.toString())
                        //Send a received code here
                    }
                }
                TConstants.AUTH_OK -> {
                    //If your auth is successful, you receive AUTH_OK and then you can
                    //fetch whatever you want.
                    //Here you can go to your App's main screen
                    Log.d(TAG, Session.user.username + "!!!")

                    TGetChats {chats->
                        if(chats is TdApi.Chats){
                            Log.d(TAG,chats.chatIds.size.toString())
                        }
                    }
                }
                TConstants.AUTH_ERROR->{
                    //We are going to log an error here
                    Log.d(TAG,telegramApi.authState.error.toString())
                }
            }
        }


    }
}
