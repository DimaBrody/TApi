package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddChatMember (
    chatId: Long,
    userId: Int,
    forwardLimit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddChatMember>(
    TdApi.AddChatMember(chatId,userId,forwardLimit),onError,onSuccess)

class TAddChatMembers (
    chatId: Long,
    userIds: IntArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddChatMembers>(
    TdApi.AddChatMembers(chatId,userIds),onError,onSuccess)

class TAddRecentlyFoundChat (
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddRecentlyFoundChat>(
    TdApi.AddRecentlyFoundChat(chatId),onError,onSuccess)

class TGetChat(
    chatId: Long = 0L,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) :  TRequest<TdApi.GetChat>(TdApi.GetChat(chatId),onError,onSuccess)

class TGetChats(
    offsetOrder: Long = Long.MAX_VALUE,
    offsetChatId: Long = Long.MAX_VALUE,
    limit: Int = 30,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChats>(TdApi.GetChats(offsetOrder,offsetChatId,limit),onError,onSuccess)

class TCheckChatInviteLink(
    inviteLink: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckChatInviteLink>(TdApi.CheckChatInviteLink(inviteLink),onError,onSuccess)

class TCheckChatUsername(
    chatId: Long,
    username: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckChatUsername>(TdApi.CheckChatUsername(chatId,username),onError,onSuccess)

class TClearAllDraftMessages(
    excludeSecretChats: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ClearAllDraftMessages>(TdApi.ClearAllDraftMessages(excludeSecretChats),onError,onSuccess)


class TCloseSecretChat(
    secretChatId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CloseSecretChat>(TdApi.CloseSecretChat(secretChatId),onError,onSuccess)

class TCreateBasicGroupChat(
    basicGroupId: Int,
    force: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateBasicGroupChat>(TdApi.CreateBasicGroupChat(basicGroupId,force),onError,onSuccess)

class TCreateNewBasicGroupChat(
    userIds: IntArray,
    title: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateNewBasicGroupChat>(TdApi.CreateNewBasicGroupChat(userIds,title),onError,onSuccess)

class TCreateNewSecretChat(
    userId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateNewSecretChat>(TdApi.CreateNewSecretChat(userId),onError,onSuccess)

class TCreateNewSupergroupChat(
    title: String,
    isChannel: Boolean,
    description: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateNewSupergroupChat>(TdApi.CreateNewSupergroupChat(title,isChannel,description),onError,onSuccess)

class TCreateSecretChat(
    secretChatId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateSecretChat>(TdApi.CreateSecretChat(secretChatId),onError,onSuccess)

class TCreateSupergroupChat(
    supergroupId: Int,
    force: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateSupergroupChat>(TdApi.CreateSupergroupChat(supergroupId,force),onError,onSuccess)


class TDeleteChatHistory(
    chatId: Long,
    removeFromChatList: Boolean,
    revoke: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteChatHistory>(TdApi.DeleteChatHistory(chatId,removeFromChatList,revoke),onError,onSuccess)


class TCloseChat(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CloseChat>(TdApi.CloseChat(chatId),onError,onSuccess)

class TDeleteSupergroup(
    supergroupId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteSupergroup>(TdApi.DeleteSupergroup(supergroupId),onError,onSuccess)


class TGenerateChatInviteLink(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GenerateChatInviteLink>(TdApi.GenerateChatInviteLink(chatId),onError,onSuccess)


class TGetChatAdministrators(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatAdministrators>(TdApi.GetChatAdministrators(chatId),onError,onSuccess)


class TGetChatEventLog(
    chatId: Long,
    query: String,
    fromEventId: Long,
    limit: Int,
    filters: TdApi.ChatEventLogFilters,
    userIds: IntArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatEventLog>(TdApi.GetChatEventLog(chatId,query,fromEventId,limit,filters,userIds),onError,onSuccess)

class TGetChatHistory(
    chatId: Long,
    fromMessageId: Long,
    offset: Int,
    limit: Int,
    onlyLocal: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatHistory>(TdApi.GetChatHistory(chatId,fromMessageId,offset,limit,onlyLocal),onError,onSuccess)


class TGetChatMember(
    chatId: Long,
    userId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatMember>(TdApi.GetChatMember(chatId,userId),onError,onSuccess)


class TGetChatNotificationSettingsExceptions(
    scope: TdApi.NotificationSettingsScope,
    compareSound: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatNotificationSettingsExceptions>(TdApi.GetChatNotificationSettingsExceptions(scope,compareSound),onError,onSuccess)

class TGetChatPinnedMessage(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatPinnedMessage>(TdApi.GetChatPinnedMessage(chatId),onError,onSuccess)

class TGetChatReportSpamState(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatReportSpamState>(TdApi.GetChatReportSpamState(chatId),onError,onSuccess)

class TGetChatStatisticsUrl(
    chatId: Long,
    parameters: String,
    isDark: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatStatisticsUrl>(TdApi.GetChatStatisticsUrl(chatId,parameters,isDark),onError,onSuccess)

class TGetCreatedPublicChats(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetCreatedPublicChats>(TdApi.GetCreatedPublicChats(),onError,onSuccess)

class TGetChatMessageCount(
    userId: Int,
    force: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreatePrivateChat>(TdApi.CreatePrivateChat(userId,force),onError,onSuccess)



class TUpgradeBasicGroupChatToSupergroupChat(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.UpgradeBasicGroupChatToSupergroupChat>(TdApi.UpgradeBasicGroupChatToSupergroupChat(
    chatId),onError,onSuccess)

class TUnpinChatMessage(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.UnpinChatMessage>(TdApi.UnpinChatMessage(chatId),onError,onSuccess)

class TToggleChatIsMarkedAsUnread(
    chatId: Long,
    isMarkedAsUnread: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleChatIsMarkedAsUnread>(
    TdApi.ToggleChatIsMarkedAsUnread(chatId,isMarkedAsUnread),onError,onSuccess)

class TToggleChatDefaultDisableNotification(
    chatId: Long,
    defaultDisableNotification: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleChatDefaultDisableNotification>(TdApi.ToggleChatDefaultDisableNotification
    (chatId,defaultDisableNotification),onError,onSuccess)

class TSetPinnedChats(
    chatIds: LongArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetPinnedChats>(TdApi.SetPinnedChats(chatIds),onError,onSuccess)

class TSetChatTitle(
    chatId: Long,
    title: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatTitle>(TdApi.SetChatTitle(chatId,title),onError,onSuccess)



class TSetChatNotificationSettings(
    chatId: Long,
    notificationSettings: TdApi.ChatNotificationSettings,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatNotificationSettings>(
    TdApi.SetChatNotificationSettings(chatId,notificationSettings),onError,onSuccess)

class TSetChatMemberStatus(
    chatId: Long,
    userId: Int,
    status: TdApi.ChatMemberStatus,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatMemberStatus>(TdApi.SetChatMemberStatus(chatId,userId,status),onError,onSuccess)

class TSetChatDraftMessage(
    chatId: Long,
    draftMessage: TdApi.DraftMessage,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatDraftMessage>(TdApi.SetChatDraftMessage(chatId,draftMessage),onError,onSuccess)


class TSetChatClientData(
    chatId: Long,
    clientData: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatClientData>(TdApi.SetChatClientData(chatId,clientData),onError,onSuccess)



class TSendChatSetTtlMessage(
    chatId: Long,
    ttl: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendChatSetTtlMessage>(TdApi.SendChatSetTtlMessage(
    chatId,ttl),onError,onSuccess)



class TSendChatScreenshotTakenNotification(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendChatScreenshotTakenNotification>(
    TdApi.SendChatScreenshotTakenNotification(chatId),onError,onSuccess)



class TSendChatAction(
    chatId: Long,
    action: TdApi.ChatAction,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendChatAction>(TdApi.SendChatAction(chatId,action),onError,onSuccess)



class TSearchPublicChats(
    query: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchPublicChats>(TdApi.SearchPublicChats(query),onError,onSuccess)


class TSearchPublicChat(
    username: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchPublicChat>(TdApi.SearchPublicChat(username),onError,onSuccess)


class TSearchChatsOnServer(
    query: String,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChatsOnServer>(TdApi.SearchChatsOnServer(query,limit),onError,onSuccess)


class TSearchChats(
    query: String,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChats>(TdApi.SearchChats(query,limit),onError,onSuccess)


class TSearchChatRecentLocationMessages(
    chatId: Long,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChatRecentLocationMessages>(TdApi.
    SearchChatRecentLocationMessages(chatId,limit),onError,onSuccess)

class TSearchChatMessages(
    chatId: Long,
    query: String,
    senderUserId: Int,
    fromMessageId: Long,
    offset: Int,
    limit: Int,
    filter: TdApi.SearchMessagesFilter,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChatMessages>(TdApi.SearchChatMessages
    (chatId,query,senderUserId,fromMessageId,offset,limit,filter),onError,onSuccess)

class TSearchChatMembers(
    chatId: Long,
    query: String,
    limit: Int,
    filter: TdApi.ChatMembersFilter,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChatMembers>(TdApi.SearchChatMembers(chatId,query,limit,filter),onError,onSuccess)

class TReportSupergroupSpam(
    supergroupId: Int,
    userId: Int,
    messageIds: LongArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ReportSupergroupSpam>(TdApi.ReportSupergroupSpam(supergroupId,userId,messageIds),onError,onSuccess)

class TReportChat(
    chatId: Long,
    reason: TdApi.ChatReportReason,
    messageIds: LongArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ReportChat>(TdApi.ReportChat(chatId,reason,messageIds),onError,onSuccess)

class TRemoveRecentlyFoundChat(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveRecentlyFoundChat>(TdApi.RemoveRecentlyFoundChat
    (chatId),onError,onSuccess)

class TOpenChat(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.OpenChat>(TdApi.OpenChat(chatId),onError,onSuccess)

class TLeaveChat(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.LeaveChat>(TdApi.LeaveChat(chatId),onError,onSuccess)

class TJoinChatByInviteLink(
    inviteLink: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.JoinChatByInviteLink>
    (TdApi.JoinChatByInviteLink(inviteLink),onError,onSuccess)


class TJoinChat(
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.JoinChat>(TdApi.JoinChat(chatId),onError,onSuccess)


class TGetTopChats(
    category: TdApi.TopChatCategory,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetTopChats>(TdApi.GetTopChats(category,limit),onError,onSuccess)


class TGetSupergroupMembers(
    supergroupId: Int,
    filter: TdApi.SupergroupMembersFilter,
    offset: Int,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetSupergroupMembers>(TdApi.GetSupergroupMembers(supergroupId,filter,offset,limit),onError,onSuccess)


class TGetSupergroupFullInfo(
    supergroupId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetSupergroupFullInfo>(TdApi.GetSupergroupFullInfo(supergroupId),onError,onSuccess)


class TGetSupergroup(
    supergroupId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetSupergroup>(TdApi.GetSupergroup(supergroupId),onError,onSuccess)


class TGetSecretChat(
    secretChatId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetSecretChat>(TdApi.GetSecretChat(secretChatId),onError,onSuccess)


class TGetBasicGroup(
    basicGroupId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetBasicGroup>
    (TdApi.GetBasicGroup(basicGroupId),onError,onSuccess)

class TGetBasicGroupFullInfo(
    basicGroupId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetBasicGroupFullInfo>
    (TdApi.GetBasicGroupFullInfo(basicGroupId),onError,onSuccess)

class TGetGroupsInCommon(
    userId: Int,
    offsetChatId: Long,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetGroupsInCommon>
    (TdApi.GetGroupsInCommon(userId,offsetChatId,limit),onError,onSuccess)

class TRemoveNotificationGroup(
    notificationGroupId: Int,
    maxNotificationId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveNotificationGroup>
    (TdApi.RemoveNotificationGroup(notificationGroupId,maxNotificationId),onError,onSuccess)

class TSetSupergroupDescription(
    supergroupId: Int,
    description: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetSupergroupDescription>
    (TdApi.SetSupergroupDescription(supergroupId,description),onError,onSuccess)

class TSetSupergroupUsername(
    supergroupId: Int,
    username: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetSupergroupUsername>
    (TdApi.SetSupergroupUsername(supergroupId,username),onError,onSuccess)

class TToggleBasicGroupAdministrators(
    basicGroupId: Int,
    everyoneIsAdministrator : Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleBasicGroupAdministrators>
    (TdApi.ToggleBasicGroupAdministrators(basicGroupId,everyoneIsAdministrator),onError,onSuccess)

class TToggleSupergroupInvites(
    supergroupId: Int,
    anyoneCanInvite: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleSupergroupInvites>
    (TdApi.ToggleSupergroupInvites(supergroupId,anyoneCanInvite),onError,onSuccess)

class TToggleSupergroupIsAllHistoryAvailable(
    supergroupId: Int,
    isAllHistoryAvailable: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleSupergroupIsAllHistoryAvailable>
    (TdApi.ToggleSupergroupIsAllHistoryAvailable(supergroupId,isAllHistoryAvailable),onError,onSuccess)

class TSetChatPhoto(
    chatId: Long,
    photo: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatPhoto>(TdApi.SetChatPhoto(chatId,photo),onError,onSuccess)












