package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddChatMember (
    chatId: Long,
    userId: Int,
    forwardLimit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddChatMember>(
    TdApi.AddChatMember(chatId,userId,forwardLimit),error,callback)

class TAddChatMembers (
    chatId: Long,
    userIds: IntArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddChatMembers>(
    TdApi.AddChatMembers(chatId,userIds),error,callback)

class TAddRecentlyFoundChat (
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddRecentlyFoundChat>(
    TdApi.AddRecentlyFoundChat(chatId),error,callback)

class TGetChat(
    chatId: Long = 0L,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) :  TRequest<TdApi.GetChat>(TdApi.GetChat(chatId),error,callback)

class TGetChats(
    offsetOrder: Long = Long.MAX_VALUE,
    offsetChatId: Long = Long.MAX_VALUE,
    limit: Int = 30,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChats>(TdApi.GetChats(offsetOrder,offsetChatId,limit),error,callback)

class TCheckChatInviteLink(
    inviteLink: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckChatInviteLink>(TdApi.CheckChatInviteLink(inviteLink),error,callback)

class TCheckChatUsername(
    chatId: Long,
    username: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CheckChatUsername>(TdApi.CheckChatUsername(chatId,username),error,callback)

class TClearAllDraftMessages(
    excludeSecretChats: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ClearAllDraftMessages>(TdApi.ClearAllDraftMessages(excludeSecretChats),error,callback)


class TCloseSecretChat(
    secretChatId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CloseSecretChat>(TdApi.CloseSecretChat(secretChatId),error,callback)

class TCreateBasicGroupChat(
    basicGroupId: Int,
    force: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateBasicGroupChat>(TdApi.CreateBasicGroupChat(basicGroupId,force),error,callback)

class TCreateNewBasicGroupChat(
    userIds: IntArray,
    title: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateNewBasicGroupChat>(TdApi.CreateNewBasicGroupChat(userIds,title),error,callback)

class TCreateNewSecretChat(
    userId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateNewSecretChat>(TdApi.CreateNewSecretChat(userId),error,callback)

class TCreateNewSupergroupChat(
    title: String,
    isChannel: Boolean,
    description: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateNewSupergroupChat>(TdApi.CreateNewSupergroupChat(title,isChannel,description),error,callback)

class TCreateSecretChat(
    secretChatId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateSecretChat>(TdApi.CreateSecretChat(secretChatId),error,callback)

class TCreateSupergroupChat(
    supergroupId: Int,
    force: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateSupergroupChat>(TdApi.CreateSupergroupChat(supergroupId,force),error,callback)


class TDeleteChatHistory(
    chatId: Long,
    removeFromChatList: Boolean,
    revoke: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteChatHistory>(TdApi.DeleteChatHistory(chatId,removeFromChatList,revoke),error,callback)


class TCloseChat(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CloseChat>(TdApi.CloseChat(chatId),error,callback)

class TDeleteSupergroup(
    supergroupId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteSupergroup>(TdApi.DeleteSupergroup(supergroupId),error,callback)


class TGenerateChatInviteLink(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GenerateChatInviteLink>(TdApi.GenerateChatInviteLink(chatId),error,callback)


class TGetChatAdministrators(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatAdministrators>(TdApi.GetChatAdministrators(chatId),error,callback)


class TGetChatEventLog(
    chatId: Long,
    query: String,
    fromEventId: Long,
    limit: Int,
    filters: TdApi.ChatEventLogFilters,
    userIds: IntArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatEventLog>(TdApi.GetChatEventLog(chatId,query,fromEventId,limit,filters,userIds),error,callback)

class TGetChatHistory(
    chatId: Long,
    fromMessageId: Long,
    offset: Int,
    limit: Int,
    onlyLocal: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatHistory>(TdApi.GetChatHistory(chatId,fromMessageId,offset,limit,onlyLocal),error,callback)


class TGetChatMember(
    chatId: Long,
    userId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatMember>(TdApi.GetChatMember(chatId,userId),error,callback)


class TGetChatNotificationSettingsExceptions(
    scope: TdApi.NotificationSettingsScope,
    compareSound: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatNotificationSettingsExceptions>(TdApi.GetChatNotificationSettingsExceptions(scope,compareSound),error,callback)

class TGetChatPinnedMessage(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatPinnedMessage>(TdApi.GetChatPinnedMessage(chatId),error,callback)

class TGetChatReportSpamState(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatReportSpamState>(TdApi.GetChatReportSpamState(chatId),error,callback)

class TGetChatStatisticsUrl(
    chatId: Long,
    parameters: String,
    isDark: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetChatStatisticsUrl>(TdApi.GetChatStatisticsUrl(chatId,parameters,isDark),error,callback)

class TGetCreatedPublicChats(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetCreatedPublicChats>(TdApi.GetCreatedPublicChats(),error,callback)

class TGetChatMessageCount(
    userId: Int,
    force: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreatePrivateChat>(TdApi.CreatePrivateChat(userId,force),error,callback)



class TUpgradeBasicGroupChatToSupergroupChat(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.UpgradeBasicGroupChatToSupergroupChat>(TdApi.UpgradeBasicGroupChatToSupergroupChat(
    chatId),error,callback)

class TUnpinChatMessage(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.UnpinChatMessage>(TdApi.UnpinChatMessage(chatId),error,callback)

class TToggleChatIsMarkedAsUnread(
    chatId: Long,
    isMarkedAsUnread: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleChatIsMarkedAsUnread>(
    TdApi.ToggleChatIsMarkedAsUnread(chatId,isMarkedAsUnread),error,callback)

class TToggleChatDefaultDisableNotification(
    chatId: Long,
    defaultDisableNotification: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleChatDefaultDisableNotification>(TdApi.ToggleChatDefaultDisableNotification
    (chatId,defaultDisableNotification),error,callback)

class TSetPinnedChats(
    chatIds: LongArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetPinnedChats>(TdApi.SetPinnedChats(chatIds),error,callback)

class TSetChatTitle(
    chatId: Long,
    title: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatTitle>(TdApi.SetChatTitle(chatId,title),error,callback)



class TSetChatNotificationSettings(
    chatId: Long,
    notificationSettings: TdApi.ChatNotificationSettings,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatNotificationSettings>(
    TdApi.SetChatNotificationSettings(chatId,notificationSettings),error,callback)

class TSetChatMemberStatus(
    chatId: Long,
    userId: Int,
    status: TdApi.ChatMemberStatus,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatMemberStatus>(TdApi.SetChatMemberStatus(chatId,userId,status),error,callback)

class TSetChatDraftMessage(
    chatId: Long,
    draftMessage: TdApi.DraftMessage,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatDraftMessage>(TdApi.SetChatDraftMessage(chatId,draftMessage),error,callback)


class TSetChatClientData(
    chatId: Long,
    clientData: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatClientData>(TdApi.SetChatClientData(chatId,clientData),error,callback)



class TSendChatSetTtlMessage(
    chatId: Long,
    ttl: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendChatSetTtlMessage>(TdApi.SendChatSetTtlMessage(
    chatId,ttl),error,callback)



class TSendChatScreenshotTakenNotification(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendChatScreenshotTakenNotification>(
    TdApi.SendChatScreenshotTakenNotification(chatId),error,callback)



class TSendChatAction(
    chatId: Long,
    action: TdApi.ChatAction,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SendChatAction>(TdApi.SendChatAction(chatId,action),error,callback)



class TSearchPublicChats(
    query: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchPublicChats>(TdApi.SearchPublicChats(query),error,callback)


class TSearchPublicChat(
    username: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchPublicChat>(TdApi.SearchPublicChat(username),error,callback)


class TSearchChatsOnServer(
    query: String,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChatsOnServer>(TdApi.SearchChatsOnServer(query,limit),error,callback)


class TSearchChats(
    query: String,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChats>(TdApi.SearchChats(query,limit),error,callback)


class TSearchChatRecentLocationMessages(
    chatId: Long,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChatRecentLocationMessages>(TdApi.
    SearchChatRecentLocationMessages(chatId,limit),error,callback)

class TSearchChatMessages(
    chatId: Long,
    query: String,
    senderUserId: Int,
    fromMessageId: Long,
    offset: Int,
    limit: Int,
    filter: TdApi.SearchMessagesFilter,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChatMessages>(TdApi.SearchChatMessages
    (chatId,query,senderUserId,fromMessageId,offset,limit,filter),error,callback)

class TSearchChatMembers(
    chatId: Long,
    query: String,
    limit: Int,
    filter: TdApi.ChatMembersFilter,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchChatMembers>(TdApi.SearchChatMembers(chatId,query,limit,filter),error,callback)

class TReportSupergroupSpam(
    supergroupId: Int,
    userId: Int,
    messageIds: LongArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ReportSupergroupSpam>(TdApi.ReportSupergroupSpam(supergroupId,userId,messageIds),error,callback)

class TReportChat(
    chatId: Long,
    reason: TdApi.ChatReportReason,
    messageIds: LongArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ReportChat>(TdApi.ReportChat(chatId,reason,messageIds),error,callback)

class TRemoveRecentlyFoundChat(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveRecentlyFoundChat>(TdApi.RemoveRecentlyFoundChat
    (chatId),error,callback)

class TOpenChat(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.OpenChat>(TdApi.OpenChat(chatId),error,callback)

class TLeaveChat(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.LeaveChat>(TdApi.LeaveChat(chatId),error,callback)

class TJoinChatByInviteLink(
    inviteLink: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.JoinChatByInviteLink>
    (TdApi.JoinChatByInviteLink(inviteLink),error,callback)


class TJoinChat(
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.JoinChat>(TdApi.JoinChat(chatId),error,callback)


class TGetTopChats(
    category: TdApi.TopChatCategory,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetTopChats>(TdApi.GetTopChats(category,limit),error,callback)


class TGetSupergroupMembers(
    supergroupId: Int,
    filter: TdApi.SupergroupMembersFilter,
    offset: Int,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetSupergroupMembers>(TdApi.GetSupergroupMembers(supergroupId,filter,offset,limit),error,callback)


class TGetSupergroupFullInfo(
    supergroupId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetSupergroupFullInfo>(TdApi.GetSupergroupFullInfo(supergroupId),error,callback)


class TGetSupergroup(
    supergroupId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetSupergroup>(TdApi.GetSupergroup(supergroupId),error,callback)


class TGetSecretChat(
    secretChatId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetSecretChat>(TdApi.GetSecretChat(secretChatId),error,callback)


class TGetBasicGroup(
    basicGroupId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetBasicGroup>
    (TdApi.GetBasicGroup(basicGroupId),error,callback)

class TGetBasicGroupFullInfo(
    basicGroupId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetBasicGroupFullInfo>
    (TdApi.GetBasicGroupFullInfo(basicGroupId),error,callback)

class TGetGroupsInCommon(
    userId: Int,
    offsetChatId: Long,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetGroupsInCommon>
    (TdApi.GetGroupsInCommon(userId,offsetChatId,limit),error,callback)

class TRemoveNotificationGroup(
    notificationGroupId: Int,
    maxNotificationId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveNotificationGroup>
    (TdApi.RemoveNotificationGroup(notificationGroupId,maxNotificationId),error,callback)

class TSetSupergroupDescription(
    supergroupId: Int,
    description: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetSupergroupDescription>
    (TdApi.SetSupergroupDescription(supergroupId,description),error,callback)

class TSetSupergroupUsername(
    supergroupId: Int,
    username: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetSupergroupUsername>
    (TdApi.SetSupergroupUsername(supergroupId,username),error,callback)

class TToggleBasicGroupAdministrators(
    basicGroupId: Int,
    everyoneIsAdministrator : Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleBasicGroupAdministrators>
    (TdApi.ToggleBasicGroupAdministrators(basicGroupId,everyoneIsAdministrator),error,callback)

class TToggleSupergroupInvites(
    supergroupId: Int,
    anyoneCanInvite: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleSupergroupInvites>
    (TdApi.ToggleSupergroupInvites(supergroupId,anyoneCanInvite),error,callback)

class TToggleSupergroupIsAllHistoryAvailable(
    supergroupId: Int,
    isAllHistoryAvailable: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ToggleSupergroupIsAllHistoryAvailable>
    (TdApi.ToggleSupergroupIsAllHistoryAvailable(supergroupId,isAllHistoryAvailable),error,callback)

class TSetChatPhoto(
    chatId: Long,
    photo: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetChatPhoto>(TdApi.SetChatPhoto(chatId,photo),error,callback)












