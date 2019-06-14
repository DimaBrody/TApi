package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddFavoriteSticker (
    sticker: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddFavoriteSticker>(
    TdApi.AddFavoriteSticker(sticker),onError,onSuccess)

class TAddRecentSticker (
    isAttached: Boolean,
    sticker: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddRecentSticker>(
    TdApi.AddRecentSticker(isAttached,sticker),onError,onSuccess)

class TClearRecentStickers (
    isAttached: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ClearRecentStickers>(
    TdApi.ClearRecentStickers(isAttached),onError,onSuccess)

class TCreateNewStickerSet (
    userId: Int,
    title: String,
    name: String,
    isMasks: Boolean,
    stickers: Array<TdApi.InputSticker>,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateNewStickerSet>(
    TdApi.CreateNewStickerSet(userId,title,name,isMasks,stickers),onError,onSuccess)

class TGetArchivedStickerSets (
    isMasks: Boolean,
    offsetStickerSetId: Long,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetArchivedStickerSets>(
    TdApi.GetArchivedStickerSets(isMasks,offsetStickerSetId,limit),onError,onSuccess)

class TGetAttachedStickerSets (
    fileId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetAttachedStickerSets>(
    TdApi.GetAttachedStickerSets(fileId),onError,onSuccess)

class TGetFavoriteStickers (
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFavoriteStickers>(
    TdApi.GetFavoriteStickers(),onError,onSuccess)

class TGetInstalledStickerSets (
    isMasks: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetInstalledStickerSets>(
    TdApi.GetInstalledStickerSets(isMasks),onError,onSuccess)

class TSetSupergroupStickerSet (
    supergroupId: Int,
    stickerSetId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetSupergroupStickerSet>(
    TdApi.SetSupergroupStickerSet(supergroupId,stickerSetId),onError,onSuccess)



class TSetStickerPositionInSet (
    sticker: TdApi.InputFile,
    position: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetStickerPositionInSet>(
    TdApi.SetStickerPositionInSet(sticker,position),onError,onSuccess)


class TSearchStickerSets (
    query: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchStickerSets>(
    TdApi.SearchStickerSets(query),onError,onSuccess)


class TSearchStickerSet (
    name: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchStickerSet>(
    TdApi.SearchStickerSet(name),onError,onSuccess)


class TSearchStickers (
    emoji: String,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchStickers>(
    TdApi.SearchStickers(emoji,limit),onError,onSuccess)


class TSearchInstalledStickerSets (
    isMasks: Boolean,
    query: String,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchInstalledStickerSets>(
    TdApi.SearchInstalledStickerSets(isMasks,query,limit),onError,onSuccess)


class TReorderInstalledStickerSets (
    isMasks: Boolean,
    stickerSetIds: LongArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ReorderInstalledStickerSets>(
    TdApi.ReorderInstalledStickerSets(isMasks,stickerSetIds),onError,onSuccess)


class TRemoveTopChat (
    category: TdApi.TopChatCategory,
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveTopChat>(
    TdApi.RemoveTopChat(category,chatId),onError,onSuccess)

class TRemoveStickerFromSet(
    sticker: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveStickerFromSet>(TdApi.RemoveStickerFromSet
    (sticker),onError,onSuccess)

class TRemoveRecentSticker(
    isAttached: Boolean,
    sticker: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveRecentSticker>(TdApi.RemoveRecentSticker(isAttached,sticker),onError,onSuccess)

class TRemoveFavoriteSticker (
    sticker: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveFavoriteSticker>(
    TdApi.RemoveFavoriteSticker(sticker),onError,onSuccess)

class TAddStickerToSet (
    userId: Int,
    name: String,
    sticker: TdApi.InputSticker,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddStickerToSet>(
    TdApi.AddStickerToSet(userId,name,sticker),onError,onSuccess)

class TGetStickerSet(
    setId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetStickerSet>(
    TdApi.GetStickerSet(setId),onError,onSuccess)

class TGetStickers (
    emoji: String,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetStickers>(
    TdApi.GetStickers(emoji,limit),onError,onSuccess)

class TViewTrendingStickerSets (
    stickerSetIds: LongArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ViewTrendingStickerSets>(
    TdApi.ViewTrendingStickerSets(stickerSetIds),onError,onSuccess)

class TGetTrendingStickerSets (
    sticker: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetTrendingStickerSets>(
    TdApi.GetTrendingStickerSets(),onError,onSuccess)

class TGetStickerEmojis (
    sticker: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetStickerEmojis>(
    TdApi.GetStickerEmojis(sticker),onError,onSuccess)

class TChangeStickerSet (
    setId: Long,
    isInstalled: Boolean,
    isArchived: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ChangeStickerSet>(
    TdApi.ChangeStickerSet(setId,isInstalled,isArchived),onError,onSuccess)