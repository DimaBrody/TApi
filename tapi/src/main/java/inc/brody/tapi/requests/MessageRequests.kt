package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TViewMessages (
    chatId: Long,
    messageIds: LongArray,
    forceRead: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ViewMessages>(
    TdApi.ViewMessages(chatId,messageIds,forceRead),error,callback)

class TUploadStickerFile (
    userId: Int,
    pngSticker: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ViewTrendingStickerSets>(
    TdApi.UploadStickerFile(userId,pngSticker),error,callback)


class TAddLocalMessage(
    chatId: Long,
    senderUserId: Int,
    replyToMessageId: Long,
    disableNotifications: Boolean,
    inputMessageContent: TdApi.InputMessageContent,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddLocalMessage>(
    TdApi.AddLocalMessage(chatId,senderUserId,replyToMessageId,disableNotifications,inputMessageContent),error,callback)

class TAddLogMessage (
    verbosityLevel: Int,
    text: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddLogMessage>(
    TdApi.AddLogMessage(verbosityLevel,text),error,callback)

class TToggleSupergroupSignMessages (
    supergroupId: Int,
    signMessages: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleSupergroupSignMessages>(
    TdApi.ToggleSupergroupSignMessages(supergroupId,signMessages),error,callback)


class TToggleChatIsPinned (
    chatId: Long,
    isPinned: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleChatIsPinned>(
    TdApi.ToggleChatIsPinned(chatId,isPinned),error,callback)


class TDeleteChatMessagesFromUser (
    chatId: Long,
    userId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteChatMessagesFromUser>(
    TdApi.DeleteChatMessagesFromUser(chatId,userId),error,callback)


class TDeleteMessages (
    chatId: Long,
    messageIds: LongArray,
    revoke: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteMessages>(
    TdApi.DeleteMessages(chatId,messageIds,revoke),error,callback)


class TEditInlineMessageCaption (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    caption: TdApi.FormattedText,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageCaption>(
    TdApi.EditInlineMessageCaption(inlineMessageId,replyMarkup,caption),error,callback)


class TEditInlineMessageLiveLocation (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    location: TdApi.Location,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageLiveLocation>(
    TdApi.EditInlineMessageLiveLocation(inlineMessageId,replyMarkup,location),error,callback)

class TEditInlineMessageMedia (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageMedia>(
    TdApi.EditInlineMessageMedia(inlineMessageId,replyMarkup,inputMessageContent),error,callback)


class TEditInlineMessageReplyMarkup (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageReplyMarkup>(
    TdApi.EditInlineMessageReplyMarkup(inlineMessageId,replyMarkup),error,callback)


class TEditInlineMessageText (
    inlineMessageId: String,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditInlineMessageText>(
    TdApi.EditInlineMessageText(inlineMessageId,replyMarkup,inputMessageContent),error,callback)


class TEditMessageCaption (
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    caption: TdApi.FormattedText,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageCaption>(
    TdApi.EditMessageCaption(chatId,messageId,replyMarkup,caption),error,callback)


class TEditMessageLiveLocation (
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    location: TdApi.Location,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageLiveLocation>(
    TdApi.EditMessageLiveLocation(chatId,messageId,replyMarkup,location),error,callback)


class TEditMessageMedia (
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageMedia>(
    TdApi.EditMessageMedia(chatId,messageId,replyMarkup,inputMessageContent),error,callback)


class TEditMessageReplyMarkup(
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageReplyMarkup>(
    TdApi.EditMessageReplyMarkup(chatId,messageId,replyMarkup),error,callback)

class TEditMessageText (
    chatId: Long,
    messageId: Long,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditMessageText>(
    TdApi.EditMessageText(chatId,messageId,replyMarkup,inputMessageContent),error,callback)

class TForwardMessages (
    chatId: Long,
    fromChatId: Long,
    messageIds: LongArray,
    disableNotifications: Boolean,
    fromBackground: Boolean,
    asAlbum: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ForwardMessages>(
    TdApi.ForwardMessages(chatId,fromChatId,messageIds,disableNotifications,fromBackground,asAlbum),error,callback)

class TGetActiveLiveLocationMessages (
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetActiveLiveLocationMessages>(
    TdApi.GetActiveLiveLocationMessages(),error,callback)

class TGetMessage (
    chatId: Long,
    messageId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMessage>(
    TdApi.GetMessage(chatId,messageId),error,callback)

class TGetMessageLink (
    chatId: Long,
    messageId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMessageLink>(
    TdApi.GetMessageLink(chatId,messageId),error,callback)

class TGetMessageLocally (
    chatId: Long,
    messageId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMessageLocally>(
    TdApi.GetMessageLocally(chatId,messageId),error,callback)

class TGetMessages (
    chatId: Long,
    messageIds: LongArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMessages>(
    TdApi.GetMessages(chatId,messageIds),error,callback)

class TGetPublicMessageLink (
    chatId: Long,
    messageId: Long,
    forAlbum: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetPublicMessageLink>(
    TdApi.GetPublicMessageLink(chatId,messageId,forAlbum),error,callback)

class TGetRepliedMessage (
    chatId: Long,
    messageId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetRepliedMessage>(
    TdApi.GetRepliedMessage(chatId,messageId),error,callback)

class TOpenMessageContent (
    chatId: Long,
    messageId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.OpenMessageContent>(
    TdApi.OpenMessageContent(chatId,messageId),error,callback)


class TPinChatMessage (
    chatId: Long,
    messageId: Long,
    disableNotifications: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.PinChatMessage>(
    TdApi.PinChatMessage(chatId,messageId,disableNotifications),error,callback)

class TSearchCallMessages (
    fromMessageId: Long,
    limit: Int,
    onlyMissed: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchCallMessages>(
    TdApi.SearchCallMessages(fromMessageId,limit,onlyMissed),error,callback)

class TSearchMessages (
    query: String,
    offsetDate: Int,
    offsetChatId: Long,
    offsetMessageId: Long,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchMessages>(
    TdApi.SearchMessages(query,offsetDate,offsetChatId,offsetMessageId,limit),error,callback)

class TSearchSecretMessages (
    chatId: Long,
    query: String,
    fromSearchId: Long,
    limit: Int,
    filter: TdApi.SearchMessagesFilter,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchSecretMessages>(
    TdApi.SearchSecretMessages(chatId,query,fromSearchId,limit,filter),error,callback)

class TSendBotStartMessage (
    botUserId: Int,
    chatId: Long,
    parameter: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendBotStartMessage>(
    TdApi.SendBotStartMessage(botUserId,chatId,parameter),error,callback)

class TSendInlineQueryResultMessage (
    chatId: Long,
    replyToMessageId: Long,
    disableNotification: Boolean,
    fromBackground: Boolean,
    queryId: Long,
    resultId: String,
    hideViaBot: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendInlineQueryResultMessage>(
    TdApi.SendInlineQueryResultMessage(chatId,replyToMessageId,disableNotification,
        fromBackground,queryId,resultId,hideViaBot),error,callback)

class TSendMessage (
    chatId: Long,
    replyToMessageId: Long,
    disableNotification: Boolean,
    fromBackground: Boolean,
    replyMarkup: TdApi.ReplyMarkup,
    inputMessageContent: TdApi.InputMessageContent,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendMessage>(
    TdApi.SendMessage(chatId,replyToMessageId,disableNotification,fromBackground,
        replyMarkup,inputMessageContent),error,callback)

class TSendMessageAlbum (
    chatId: Long,
    replyToMessageId: Long,
    disableNotification: Boolean,
    fromBackground: Boolean,
    inputMessageContent: Array<TdApi.InputMessageContent>,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendMessageAlbum>(
    TdApi.SendMessageAlbum(chatId,replyToMessageId,disableNotification,fromBackground,
        inputMessageContent),error,callback)



