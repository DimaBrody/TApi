package inc.brody.tapi.requests

import inc.brody.tapi.utils.Session
import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TChangePhoneNumber (
    phoneNumber: String,
    allowFlashCall: Boolean,
    isCurrentPhoneNumber: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ChangePhoneNumber>(
    TdApi.ChangePhoneNumber(phoneNumber,allowFlashCall,isCurrentPhoneNumber),onError,onSuccess)

class TCreateTemporaryPassword(
    password: String,
    validFor: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateTemporaryPassword>
    (TdApi.CreateTemporaryPassword(password,validFor),onError,onSuccess)

class TGetPasswordState(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetPasswordState>
    (TdApi.GetPasswordState(),onError,onSuccess)

class TGetTemporaryPasswordState(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetTemporaryPasswordState>
    (TdApi.GetTemporaryPasswordState(),onError,onSuccess)

class TRecoverAuthenticationPassword(
    recoveryCode: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RecoverAuthenticationPassword>
    (TdApi.RecoverAuthenticationPassword(recoveryCode),onError,onSuccess)

class TRecoverPassword(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RequestAuthenticationPasswordRecovery>
    (TdApi.RequestAuthenticationPasswordRecovery(),onError,onSuccess)

class TRequestPasswordRecovery(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RequestPasswordRecovery>
    (TdApi.RequestPasswordRecovery(),onError,onSuccess)

class TSetPassword(
    oldPassword: String,
    newPassword: String,
    newHint: String,
    setRecoveryEmailAddress: Boolean,
    newRecoveryEmailAddress: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetPassword>
    (TdApi.SetPassword(oldPassword,newPassword,newHint,
    setRecoveryEmailAddress,newRecoveryEmailAddress),onError,onSuccess)

class TCheckChangePhoneNumberCode(
    code: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckChangePhoneNumberCode>
    (TdApi.CheckChangePhoneNumberCode(code),onError,onSuccess)


class TCheckPhoneNumberConfirmationCode(
    code: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckPhoneNumberConfirmationCode>
    (TdApi.CheckPhoneNumberConfirmationCode(code),onError,onSuccess)

class TCheckPhoneNumberVerificationCode(
    code: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckPhoneNumberVerificationCode>
    (TdApi.CheckPhoneNumberVerificationCode(code),onError,onSuccess)

class TResendChangePhoneNumberCode(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendChangePhoneNumberCode>
    (TdApi.ResendChangePhoneNumberCode(),onError,onSuccess)

class TResendPhoneNumberConfirmationCode(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendPhoneNumberConfirmationCode>
    (TdApi.ResendPhoneNumberConfirmationCode(),onError,onSuccess)

class TResendPhoneNumberVerificationCode(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendPhoneNumberVerificationCode>
    (TdApi.ResendPhoneNumberVerificationCode(),onError,onSuccess)

class TSendPhoneNumberConfirmationCode(
    hash: String,
    phoneNumber: String,
    allowFlashCall: Boolean,
    isCurrentPhoneNumber: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendPhoneNumberConfirmationCode>
    (TdApi.SendPhoneNumberConfirmationCode(hash,phoneNumber,allowFlashCall,
    isCurrentPhoneNumber),onError,onSuccess)

class TSendPhoneNumberVerificationCode(
    phoneNumber: String,
    allowFlashCall: Boolean,
    isCurrentPhoneNumber: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendPhoneNumberVerificationCode>
    (TdApi.SendPhoneNumberVerificationCode(phoneNumber,allowFlashCall,
    isCurrentPhoneNumber),onError,onSuccess)

class TAnswerCallbackQuery(
    callbackQueryId: Long,
    text: String,
    showAlert: Boolean,
    url: String,
    cacheTime: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AnswerCallbackQuery>
    (TdApi.AnswerCallbackQuery(callbackQueryId,text,
    showAlert,url,cacheTime),onError,onSuccess)

class TCreateCall(
    userId: Int,
    protocol: TdApi.CallProtocol,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateCall>
    (TdApi.CreateCall(userId,protocol),onError,onSuccess)

class TDiscardCall(
    callId: Int,
    isDisconnect: Boolean,
    duration: Int,
    connectionId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DiscardCall>
    (TdApi.DiscardCall(callId,isDisconnect,
    duration,connectionId),onError,onSuccess)

class TGetCallbackQueryAnswer(
    chatId: Long,
    messageId: Long,
    payload: TdApi.CallbackQueryPayload,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetCallbackQueryAnswer>
    (TdApi.GetCallbackQueryAnswer(chatId,messageId,payload),onError,onSuccess)

class TSendCallRating(
    callId: Int,
    rating: Int,
    comment: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendCallRating>
    (TdApi.SendCallRating(callId,rating,comment),onError,onSuccess)

class TTestCallBytes(
    x: ByteArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallBytes>
    (TdApi.TestCallBytes(x),onError,onSuccess)

class TTestCallEmpty(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallEmpty>
    (TdApi.TestCallEmpty(),onError,onSuccess)

class TTestCallString(
    x: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallString>
    (TdApi.TestCallString(x),onError,onSuccess)


class TTestCallVectorInt(
    x: IntArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallVectorInt>
    (TdApi.TestCallVectorInt(x),onError,onSuccess)


class TTestCallVectorIntObject(
    x: Array<TdApi.TestInt>,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallVectorIntObject>
    (TdApi.TestCallVectorIntObject(x),onError,onSuccess)


class TTestCallVectorString(
    x: Array<String>,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallVectorString>
    (TdApi.TestCallVectorString(x),onError,onSuccess)


class TestCallVectorStringObject(
    x: Array<TdApi.TestString>,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.TestCallVectorStringObject>
    (TdApi.TestCallVectorStringObject(x),onError,onSuccess)

class TCheckAuthenticationCode(
    code: String? = null,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) :  TRequest<TdApi.CheckAuthenticationCode>(
    TdApi
        .CheckAuthenticationCode(
            code?:Session.myCode,
            "",""),onError,onSuccess)

class TCheckAuthenticationPassword(
    password: String? = null,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) :  TRequest<TdApi.CheckAuthenticationPassword>(
    TdApi
        .CheckAuthenticationPassword(
            password?:Session.myPassword),onError,onSuccess)

class TLogOut(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.LogOut>(TdApi.LogOut(),onError,onSuccess)

class TSetAuthenticationPhoneNumber(
    phone: String? = null,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetAuthenticationPhoneNumber>(
    TdApi
        .SetAuthenticationPhoneNumber(
            phone?: Session.myPhone,
            false,true),onError,onSuccess)


class TCheckEmailAddressVerificationCode(
    code: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckEmailAddressVerificationCode>
    (TdApi.CheckEmailAddressVerificationCode(code),onError,onSuccess)

class TCheckRecoveryEmailAddressCode(
    code: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckRecoveryEmailAddressCode>
    (TdApi.CheckRecoveryEmailAddressCode(code),onError,onSuccess)

class TGetRecoveryEmailAddress(
    password: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetRecoveryEmailAddress>
    (TdApi.GetRecoveryEmailAddress(password),onError,onSuccess)

class TResendEmailAddressVerificationCode(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendEmailAddressVerificationCode>
    (TdApi.ResendEmailAddressVerificationCode(),onError,onSuccess)

class TResendRecoveryEmailAddressCode(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendRecoveryEmailAddressCode>
    (TdApi.ResendRecoveryEmailAddressCode(),onError,onSuccess)

class TSendEmailAddressVerificationCode(
    emailAddress: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendEmailAddressVerificationCode>
    (TdApi.SendEmailAddressVerificationCode(emailAddress),onError,onSuccess)

class TSetRecoveryEmailAddress(
    password: String,
    newRecoveryEmailAddress: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetRecoveryEmailAddress>
    (TdApi.SetRecoveryEmailAddress(password,newRecoveryEmailAddress),onError,onSuccess)

class TResendAuthenticationCode(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ResendAuthenticationCode>
    (TdApi.ResendAuthenticationCode(),onError,onSuccess)

class TGetCountryCode(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetCountryCode>
    (TdApi.GetCountryCode(),onError,onSuccess)

class TGetUserFullInfo(
    userId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetUserFullInfo>
    (TdApi.GetUserFullInfo(userId),onError,onSuccess)

class TSendPaymentForm(
    chatId: Long,
    messageId: Long,
    orderInfoId: String,
    shippingOptionId: String,
    credentials: TdApi.InputCredentials,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendPaymentForm>
    (TdApi.SendPaymentForm(chatId,messageId,orderInfoId,
    shippingOptionId,credentials),onError,onSuccess)

class TSetAlarm(
    seconds: Double,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetAlarm>
    (TdApi.SetAlarm(seconds),onError,onSuccess)


class TGetStorageStatisticsFast(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetStorageStatisticsFast>
    (TdApi.GetStorageStatisticsFast(),onError,onSuccess)


class TRegisterDevice(
    deviceToken: TdApi.DeviceToken,
    otherUserIds: IntArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RegisterDevice>
    (TdApi.RegisterDevice(deviceToken,otherUserIds),onError,onSuccess)
