package inc.brody.tapi.requests

import inc.brody.tapi.utils.Session
import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TChangePhoneNumber (
    phoneNumber: String,
    allowFlashCall: Boolean,
    isCurrentPhoneNumber: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ChangePhoneNumber>(
    TdApi.ChangePhoneNumber(phoneNumber,allowFlashCall,isCurrentPhoneNumber),error,callback)

class TCreateTemporaryPassword(
    password: String,
    validFor: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateTemporaryPassword>
    (TdApi.CreateTemporaryPassword(password,validFor),error,callback)

class TGetPasswordState(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetPasswordState>
    (TdApi.GetPasswordState(),error,callback)

class TGetTemporaryPasswordState(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetTemporaryPasswordState>
    (TdApi.GetTemporaryPasswordState(),error,callback)

class TRecoverAuthenticationPassword(
    recoveryCode: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RecoverAuthenticationPassword>
    (TdApi.RecoverAuthenticationPassword(recoveryCode),error,callback)

class TRecoverPassword(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RequestAuthenticationPasswordRecovery>
    (TdApi.RequestAuthenticationPasswordRecovery(),error,callback)

class TRequestPasswordRecovery(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RequestPasswordRecovery>
    (TdApi.RequestPasswordRecovery(),error,callback)

class TSetPassword(
    oldPassword: String,
    newPassword: String,
    newHint: String,
    setRecoveryEmailAddress: Boolean,
    newRecoveryEmailAddress: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetPassword>
    (TdApi.SetPassword(oldPassword,newPassword,newHint,
    setRecoveryEmailAddress,newRecoveryEmailAddress),error,callback)

class TCheckChangePhoneNumberCode(
    code: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckChangePhoneNumberCode>
    (TdApi.CheckChangePhoneNumberCode(code),error,callback)


class TCheckPhoneNumberConfirmationCode(
    code: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckPhoneNumberConfirmationCode>
    (TdApi.CheckPhoneNumberConfirmationCode(code),error,callback)

class TCheckPhoneNumberVerificationCode(
    code: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckPhoneNumberVerificationCode>
    (TdApi.CheckPhoneNumberVerificationCode(code),error,callback)

class TResendChangePhoneNumberCode(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendChangePhoneNumberCode>
    (TdApi.ResendChangePhoneNumberCode(),error,callback)

class TResendPhoneNumberConfirmationCode(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendPhoneNumberConfirmationCode>
    (TdApi.ResendPhoneNumberConfirmationCode(),error,callback)

class TResendPhoneNumberVerificationCode(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendPhoneNumberVerificationCode>
    (TdApi.ResendPhoneNumberVerificationCode(),error,callback)

class TSendPhoneNumberConfirmationCode(
    hash: String,
    phoneNumber: String,
    allowFlashCall: Boolean,
    isCurrentPhoneNumber: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendPhoneNumberConfirmationCode>
    (TdApi.SendPhoneNumberConfirmationCode(hash,phoneNumber,allowFlashCall,
    isCurrentPhoneNumber),error,callback)

class TSendPhoneNumberVerificationCode(
    phoneNumber: String,
    allowFlashCall: Boolean,
    isCurrentPhoneNumber: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendPhoneNumberVerificationCode>
    (TdApi.SendPhoneNumberVerificationCode(phoneNumber,allowFlashCall,
    isCurrentPhoneNumber),error,callback)

class TAnswerCallbackQuery(
    callbackQueryId: Long,
    text: String,
    showAlert: Boolean,
    url: String,
    cacheTime: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AnswerCallbackQuery>
    (TdApi.AnswerCallbackQuery(callbackQueryId,text,
    showAlert,url,cacheTime),error,callback)

class TCreateCall(
    userId: Int,
    protocol: TdApi.CallProtocol,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateCall>
    (TdApi.CreateCall(userId,protocol),error,callback)

class TDiscardCall(
    callId: Int,
    isDisconnect: Boolean,
    duration: Int,
    connectionId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DiscardCall>
    (TdApi.DiscardCall(callId,isDisconnect,
    duration,connectionId),error,callback)

class TGetCallbackQueryAnswer(
    chatId: Long,
    messageId: Long,
    payload: TdApi.CallbackQueryPayload,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetCallbackQueryAnswer>
    (TdApi.GetCallbackQueryAnswer(chatId,messageId,payload),error,callback)

class TSendCallRating(
    callId: Int,
    rating: Int,
    comment: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendCallRating>
    (TdApi.SendCallRating(callId,rating,comment),error,callback)

class TTestCallBytes(
    x: ByteArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallBytes>
    (TdApi.TestCallBytes(x),error,callback)

class TTestCallEmpty(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallEmpty>
    (TdApi.TestCallEmpty(),error,callback)

class TTestCallString(
    x: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallString>
    (TdApi.TestCallString(x),error,callback)


class TTestCallVectorInt(
    x: IntArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallVectorInt>
    (TdApi.TestCallVectorInt(x),error,callback)


class TTestCallVectorIntObject(
    x: Array<TdApi.TestInt>,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallVectorIntObject>
    (TdApi.TestCallVectorIntObject(x),error,callback)


class TTestCallVectorString(
    x: Array<String>,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallVectorString>
    (TdApi.TestCallVectorString(x),error,callback)


class TestCallVectorStringObject(
    x: Array<TdApi.TestString>,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallVectorStringObject>
    (TdApi.TestCallVectorStringObject(x),error,callback)

class TCheckAuthenticationCode(
    code: String? = null,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) :  TRequest<TdApi.CheckAuthenticationCode>(
    TdApi
        .CheckAuthenticationCode(
            code?:Session.myCode,
            "",""),error,callback)

class TCheckAuthenticationPassword(
    password: String? = null,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) :  TRequest<TdApi.CheckAuthenticationPassword>(
    TdApi
        .CheckAuthenticationPassword(
            password?:Session.myPassword),error,callback)

class TLogOut(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.LogOut>(TdApi.LogOut(),error,callback)

class TSetAuthenticationPhoneNumber(
    phone: String? = null,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetAuthenticationPhoneNumber>(
    TdApi
        .SetAuthenticationPhoneNumber(
            phone?: Session.myPhone,
            false,true),error,callback)


class TCheckEmailAddressVerificationCode(
    code: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckEmailAddressVerificationCode>
    (TdApi.CheckEmailAddressVerificationCode(code),error,callback)

class TCheckRecoveryEmailAddressCode(
    code: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckRecoveryEmailAddressCode>
    (TdApi.CheckRecoveryEmailAddressCode(code),error,callback)

class TGetRecoveryEmailAddress(
    password: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetRecoveryEmailAddress>
    (TdApi.GetRecoveryEmailAddress(password),error,callback)

class TResendEmailAddressVerificationCode(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendEmailAddressVerificationCode>
    (TdApi.ResendEmailAddressVerificationCode(),error,callback)

class TResendRecoveryEmailAddressCode(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendRecoveryEmailAddressCode>
    (TdApi.ResendRecoveryEmailAddressCode(),error,callback)

class TSendEmailAddressVerificationCode(
    emailAddress: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendEmailAddressVerificationCode>
    (TdApi.SendEmailAddressVerificationCode(emailAddress),error,callback)

class TSetRecoveryEmailAddress(
    password: String,
    newRecoveryEmailAddress: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetRecoveryEmailAddress>
    (TdApi.SetRecoveryEmailAddress(password,newRecoveryEmailAddress),error,callback)

class TResendAuthenticationCode(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendAuthenticationCode>
    (TdApi.ResendAuthenticationCode(),error,callback)

class TGetCountryCode(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetCountryCode>
    (TdApi.GetCountryCode(),error,callback)

class TGetUserFullInfo(
    userId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetUserFullInfo>
    (TdApi.GetUserFullInfo(userId),error,callback)

class TSendPaymentForm(
    chatId: Long,
    messageId: Long,
    orderInfoId: String,
    shippingOptionId: String,
    credentials: TdApi.InputCredentials,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendPaymentForm>
    (TdApi.SendPaymentForm(chatId,messageId,orderInfoId,
    shippingOptionId,credentials),error,callback)

class TSetAlarm(
    seconds: Double,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetAlarm>
    (TdApi.SetAlarm(seconds),error,callback)


class TGetStorageStatisticsFast(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetStorageStatisticsFast>
    (TdApi.GetStorageStatisticsFast(),error,callback)


class TRegisterDevice(
    deviceToken: TdApi.DeviceToken,
    otherUserIds: IntArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RegisterDevice>
    (TdApi.RegisterDevice(deviceToken,otherUserIds),error,callback)
