# TApi

[![](https://jitpack.io/v/DimaBrody/TApi.svg?style=flat-square)](https://jitpack.io/#DimaBrody/TApi/1.0.3)

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Telegram_logo.svg/1024px-Telegram_logo.svg.png" alt="Drawing" width="200" height="200"/> 

This library allows you to use both official telegram API (libtd) and helper functions and extensions of it. You can write a code for Telegram request in a single row. See the short documentation below to get into the spirit of things.

## Fair use 
Do NOT use this to spam anyone at all.

Do NOT use this for any illegal activities.

## Installation

Add the following to your root ```build.gradle``` file:
```Gradle
allprojects {
    repositories {
	...
	maven { url 'https://jitpack.io' }
    }
}
```

Then add the following to your app level ```build.gradle``` file, use the version number of the latest release:
```Gradle
dependencies {
    implementation 'com.github.DimaBrody:TApi:$VERSION'
}
```
You can find the current version of library higher, under the name of it. There is a (JitPack | 1.#.#)

## Instructions
All the examples below are written in Kotlin, but you can use Java, though.

### Initialization  
```Kotlin
val telegramApi = TApi.init(applicationContext)
```
You should pass an applicationContext of your app here.

### Authentication listener

For auth processing, you can use our listener. When TApi is instantiated, you will immediately get AUTH_WAIT_PHONE constant and here you should use 'sendPhone' for getting either AUTH_WAIT_CODE or AUTH_WAIT_PASSWORD and then after receiving AUTH_OK, you are allowed to do whatever you want!

```Kotlin
telegramApi.authState.setOnChangeListener {
    when (it) {
        TConstants.AUTH_WAIT_PHONE -> {
            telegramApi.sendPhone("...")
        }
        TConstants.AUTH_WAIT_PASS->{
            telegramApi.loginWithPassword("password")
        }
        TConstants.AUTH_WAIT_CODE -> {
            telegramApi.loginWithReceivedCode("code")
        }
        TConstants.AUTH_OK -> {
            /*Do whatever you want after it.
            For example, you have AppVariables class and created 
            an 'isAllowToUseTelegramRequests', so after 'AUTH_OK' you
            should have a posibility to inform your app 
            whether authentication is successful and you can use all the
            TApi requests safely or you will get an error.*/
            AppVariables.isAllowToUseTelegramRequests = true
        }
        TConstants.AUTH_ERROR->{
            Log.d(TAG,telegramApi.authState.error.toString())
        }
    }
}
```

### Get user

Fetching an info about user:

```Kotlin
TGetMe { user->
    if(user is TdApi.User){
        //Instantiate your 'user'...
    }
}
```
As you can see, it's quite an easy to do using TApi.


### Handling errors
For example, let's use GetChats request:

```Kotlin
 TGetChats(
    onError = { errorResponse->
        Log.d(TAG,errorResponse.error.toString())
    },
    onSuccess = {
        ...
    }
)
 ```
 
 In this way you can control all possible errors of every request.
 
 ### Other functions
 TApi has almost all common Official Telegram Api functions. 
 You can find all of them here https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_function.html
 
 Just add 'T' symbol before the name of any function like "TSendMessage" followed form "sendMessage"
 
 ## LibTD
 TApi also includes an official Telegram Api for android, so you can use it easily like this:
 ```Kotlin
 TdApi.User.CONSTRUCTOR
 ```
 etc...
 
 ## Other
 I would sincerely appreciate your suppost, so please inform me about everything.
 If you cannot find any function from Telegram official api, write me and I will add it immediately.
 ###### Good Luck :)
