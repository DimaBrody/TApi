package inc.brody.tapi.data.entity

import org.drinkless.td.libcore.telegram.TdApi

/**
 * A chat. (Can be a private chat, basic group, supergroup, or secret chat.)
 *
 * @param id Chat unique identifier.
 * @param type Type of the chat.
 * @param title Chat title.
 * @param photo Chat photo; may be null.
 * @param lastMessage Last message in the chat; may be null.
 * @param order Descending parameter by which chats are sorted in the main chat list. If the order number of two chats is the same, they must be sorted in descending order by ID. If 0, the position of the chat in the list is undetermined.
 * @param isPinned True, if the chat is pinned.
 * @param isMarkedAsUnread True, if the chat is marked as unread.
 * @param isSponsored True, if the chat is sponsored by the user's MTProxy server.
 * @param canBeDeletedOnlyForSelf True, if the chat messages can be deleted only for the current user while other users will continue to see the messages.
 * @param canBeDeletedForAllUsers True, if the chat messages can be deleted for all users.
 * @param canBeReported True, if the chat can be reported to Telegram moderators through reportChat.
 * @param defaultDisableNotification Default value of the disableNotification parameter, used when a message is sent to the chat.
 * @param unreadCount Number of unread messages in the chat.
 * @param lastReadInboxMessageId Identifier of the last read incoming message.
 * @param lastReadOutboxMessageId Identifier of the last read outgoing message.
 * @param unreadMentionCount Number of unread messages with a mention/reply in the chat.
 * @param notificationSettings Notification settings for this chat.
 * @param pinnedMessageId Identifier of the pinned message in the chat; 0 if none.
 * @param replyMarkupMessageId Identifier of the message from which reply markup needs to be used; 0 if there is no default custom reply markup in the chat.
 * @param draftMessage A draft of a message in the chat; may be null.
 * @param clientData Contains client-specific data associated with the chat. (For example, the chat position or local chat notification settings can be stored here.) Persistent if a message database is used.
 */

data class TChat(
    val id: Long = 0L,
    val title: String = "",
    val photoSmall: TdApi.File? = null,
    val photoBig: TdApi.File? = null,
    val lastMessage: String = "",
    val order: Long = 0L,
    val isPinned: Boolean = false,
    val isMarkedAsUnread: Boolean = false,
    val canBeDeletedOnlyForSelf: Boolean = false,
    val canBeDeletedForAllUsers: Boolean = false,
    val isSponsored: Boolean  = false,
    val canBeReported: Boolean = false,
    val defaultDisableNotification: Boolean = false,
    val unreadCount: Int = 0,
    val lastReadInboxMessageId: Long = 0L,
    val lastReadOutboxMessageId: Long = 0L,
    val unreadMentionCount: Int = 0,
    val pinnedMessageId: Long = 0L,
    val replyMarkupMessageId: Long = 0L,
    val clientData: String = ""
)