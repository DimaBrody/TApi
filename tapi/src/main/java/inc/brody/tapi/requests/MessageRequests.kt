package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TViewMessages (
    chatId: Long,
    messageIds: LongArray,
    forceRead: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ViewMessages>(
    TdApi.ViewMessages(chatId,messageIds,forceRead),onError,onSuccess)

class TUploadStickerFile (
    userId: Int,
    pngSticker: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ViewTrendingStickerSets>(
    TdApi.UploadStickerFile(userId,pngSticker),onError,onSuccess)


class TAddLocalMessage(
    chatId: Long,
    senderUserId: Int,
    replyToMessageId: Long,
    disableNotifications: Boolean,
    inputMessageContent: TdApi.InputMessageContent,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddLocalMessage>(
    TdApi.AddLocalMessage(chatId,senderUserId,replyToMessageId,disableNotifications,inputMessageContent),onError,onSuccess)

class TAddLogMessage (
    verbosityLevel: Int,
    text: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddLogMessage>(
    TdApi.AddLogMessage(verbosityLevel,text),onError,onSuccess)

class TToggleSupergroupSignMessages (
    supergroupId: Int,
    signMessages: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleSupergroupSignMessages>(
    TdApi.ToggleSupergroupSignMessages(supergroupId,signMessages),onError,onSuccess)


class TToggleChatIsPinned (
    chatId: Long,
    isPinned: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleChatIsPinned>(
    TdApi.ToggleChatIsPinned(chatId,isPinned),onError,onSuccess)


class TDeleteChatMessagesFromUser (
    chatId: Long,
    userId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteChatMessagesFromUser>(
    TdApi.DeleteChatMessagesFromUser(chatId,userId),onError,onSuccess)


class TDeleteMessages (
    chatId: Long,
    messageIds: LongArray,
    revoke: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteMessages>(
    TdApi.DeleteMessages(chatId,messageIds,revoke),onError,onSuccess)


class TEditInlineMessageCaption (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    caption: TdApi.FormattedText,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageCaption>(
    TdApi.EditInlineMessageCaption(inlineMessageId,replyMarkup,caption),onError,onSuccess)


class TEditInlineMessageLiveLocation (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    location: TdApi.Location,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageLiveLocation>(
    TdApi.EditInlineMessageLiveLocation(inlineMessageId,replyMarkup,location),onError,onSuccess)

class TEditInlineMessageMedia (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageMedia>(
    TdApi.EditInlineMessageMedia(inlineMessageId,replyMarkup,inputMessageContent),onError,onSuccess)


class TEditInlineMessageReplyMarkup (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageReplyMarkup>(
    TdApi.EditInlineMessageReplyMarkup(inlineMessageId,replyMarkup),onError,onSuccess)


class TEditInlineMessageText (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageText>(
    TdApi.EditInlineMessageText(inlineMessageId,replyMarkup,inputMessageContent),onError,onSuccess)


class TEditMessageCaption (
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    caption: TdApi.FormattedText,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageCaption>(
    TdApi.EditMessageCaption(chatId,messageId,replyMarkup,caption),onError,onSuccess)


class TEditMessageLiveLocation (
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    location: TdApi.Location,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageLiveLocation>(
    TdApi.EditMessageLiveLocation(chatId,messageId,replyMarkup,location),onError,onSuccess)


class TEditMessageMedia (
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageMedia>(
    TdApi.EditMessageMedia(chatId,messageId,replyMarkup,inputMessageContent),onError,onSuccess)


class TEditMessageReplyMarkup(
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageReplyMarkup>(
    TdApi.EditMessageReplyMarkup(chatId,messageId,replyMarkup),onError,onSuccess)

class TEditMessageText (
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageText>(
    TdApi.EditMessageText(chatId,messageId,replyMarkup,inputMessageContent),onError,onSuccess)

class TForwardMessages (
    chatId: Long,
    fromChatId: Long,
    messageIds: LongArray,
    disableNotifications: Boolean,
    fromBackground: Boolean,
    asAlbum: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ForwardMessages>(
    TdApi.ForwardMessages(chatId,fromChatId,messageIds,disableNotifications,fromBackground,asAlbum),onError,onSuccess)

class TGetActiveLiveLocationMessages (
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetActiveLiveLocationMessages>(
    TdApi.GetActiveLiveLocationMessages(),onError,onSuccess)

class TGetMessage (
    chatId: Long,
    messageId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMessage>(
    TdApi.GetMessage(chatId,messageId),onError,onSuccess)

class TGetMessageLink (
    chatId: Long,
    messageId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMessageLink>(
    TdApi.GetMessageLink(chatId,messageId),onError,onSuccess)

class TGetMessageLocally (
    chatId: Long,
    messageId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMessageLocally>(
    TdApi.GetMessageLocally(chatId,messageId),onError,onSuccess)

class TGetMessages (
    chatId: Long,
    messageIds: LongArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMessages>(
    TdApi.GetMessages(chatId,messageIds),onError,onSuccess)

class TGetPublicMessageLink (
    chatId: Long,
    messageId: Long,
    forAlbum: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetPublicMessageLink>(
    TdApi.GetPublicMessageLink(chatId,messageId,forAlbum),onError,onSuccess)

class TGetRepliedMessage (
    chatId: Long,
    messageId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetRepliedMessage>(
    TdApi.GetRepliedMessage(chatId,messageId),onError,onSuccess)

class TOpenMessageContent (
    chatId: Long,
    messageId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.OpenMessageContent>(
    TdApi.OpenMessageContent(chatId,messageId),onError,onSuccess)


class TPinChatMessage (
    chatId: Long,
    messageId: Long,
    disableNotifications: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.PinChatMessage>(
    TdApi.PinChatMessage(chatId,messageId,disableNotifications),onError,onSuccess)

class TSearchCallMessages (
    fromMessageId: Long,
    limit: Int,
    onlyMissed: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchCallMessages>(
    TdApi.SearchCallMessages(fromMessageId,limit,onlyMissed),onError,onSuccess)

class TSearchMessages (
    query: String,
    offsetDate: Int,
    offsetChatId: Long,
    offsetMessageId: Long,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchMessages>(
    TdApi.SearchMessages(query,offsetDate,offsetChatId,offsetMessageId,limit),onError,onSuccess)

class TSearchSecretMessages (
    chatId: Long,
    query: String,
    fromSearchId: Long,
    limit: Int,
    filter: TdApi.SearchMessagesFilter,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchSecretMessages>(
    TdApi.SearchSecretMessages(chatId,query,fromSearchId,limit,filter),onError,onSuccess)

class TSendBotStartMessage (
    botUserId: Int,
    chatId: Long,
    parameter: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendBotStartMessage>(
    TdApi.SendBotStartMessage(botUserId,chatId,parameter),onError,onSuccess)

class TSendInlineQueryResultMessage (
    chatId: Long,
    replyToMessageId: Long,
    disableNotification: Boolean,
    fromBackground: Boolean,
    queryId: Long,
    resultId: String,
    hideViaBot: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendInlineQueryResultMessage>(
    TdApi.SendInlineQueryResultMessage(chatId,replyToMessageId,disableNotification,
        fromBackground,queryId,resultId,hideViaBot),onError,onSuccess)

class TSendMessage (
    chatId: Long,
    replyToMessageId: Long,
    disableNotification: Boolean,
    fromBackground: Boolean,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendMessage>(
    TdApi.SendMessage(chatId,replyToMessageId,disableNotification,fromBackground,
        replyMarkup,inputMessageContent),onError,onSuccess)

class TSendMessageAlbum (
    chatId: Long,
    replyToMessageId: Long,
    disableNotification: Boolean,
    fromBackground: Boolean,
    inputMessageContent: Array<TdApi.InputMessageContent>,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendMessageAlbum>(
    TdApi.SendMessageAlbum(chatId,replyToMessageId,disableNotification,fromBackground,
        inputMessageContent),onError,onSuccess)



