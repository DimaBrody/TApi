package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddFavoriteSticker (
    sticker: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddFavoriteSticker>(
    TdApi.AddFavoriteSticker(sticker),error,callback)

class TAddRecentSticker (
    isAttached: Boolean,
    sticker: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddRecentSticker>(
    TdApi.AddRecentSticker(isAttached,sticker),error,callback)

class TClearRecentStickers (
    isAttached: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ClearRecentStickers>(
    TdApi.ClearRecentStickers(isAttached),error,callback)

class TCreateNewStickerSet (
    userId: Int,
    title: String,
    name: String,
    isMasks: Boolean,
    stickers: Array<TdApi.InputSticker>,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CreateNewStickerSet>(
    TdApi.CreateNewStickerSet(userId,title,name,isMasks,stickers),error,callback)

class TGetArchivedStickerSets (
    isMasks: Boolean,
    offsetStickerSetId: Long,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetArchivedStickerSets>(
    TdApi.GetArchivedStickerSets(isMasks,offsetStickerSetId,limit),error,callback)

class TGetAttachedStickerSets (
    fileId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetAttachedStickerSets>(
    TdApi.GetAttachedStickerSets(fileId),error,callback)

class TGetFavoriteStickers (
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFavoriteStickers>(
    TdApi.GetFavoriteStickers(),error,callback)

class TGetInstalledStickerSets (
    isMasks: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetInstalledStickerSets>(
    TdApi.GetInstalledStickerSets(isMasks),error,callback)

class TSetSupergroupStickerSet (
    supergroupId: Int,
    stickerSetId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetSupergroupStickerSet>(
    TdApi.SetSupergroupStickerSet(supergroupId,stickerSetId),error,callback)



class TSetStickerPositionInSet (
    sticker: TdApi.InputFile,
    position: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetStickerPositionInSet>(
    TdApi.SetStickerPositionInSet(sticker,position),error,callback)


class TSearchStickerSets (
    query: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchStickerSets>(
    TdApi.SearchStickerSets(query),error,callback)


class TSearchStickerSet (
    name: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchStickerSet>(
    TdApi.SearchStickerSet(name),error,callback)


class TSearchStickers (
    emoji: String,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchStickers>(
    TdApi.SearchStickers(emoji,limit),error,callback)


class TSearchInstalledStickerSets (
    isMasks: Boolean,
    query: String,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SearchInstalledStickerSets>(
    TdApi.SearchInstalledStickerSets(isMasks,query,limit),error,callback)


class TReorderInstalledStickerSets (
    isMasks: Boolean,
    stickerSetIds: LongArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ReorderInstalledStickerSets>(
    TdApi.ReorderInstalledStickerSets(isMasks,stickerSetIds),error,callback)


class TRemoveTopChat (
    category: TdApi.TopChatCategory,
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveTopChat>(
    TdApi.RemoveTopChat(category,chatId),error,callback)

class TRemoveStickerFromSet(
    sticker: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveStickerFromSet>(TdApi.RemoveStickerFromSet
    (sticker),error,callback)

class TRemoveRecentSticker(
    isAttached: Boolean,
    sticker: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveRecentSticker>(TdApi.RemoveRecentSticker(isAttached,sticker),error,callback)

class TRemoveFavoriteSticker (
    sticker: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveFavoriteSticker>(
    TdApi.RemoveFavoriteSticker(sticker),error,callback)

class TAddStickerToSet (
    userId: Int,
    name: String,
    sticker: TdApi.InputSticker,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddStickerToSet>(
    TdApi.AddStickerToSet(userId,name,sticker),error,callback)

class TGetStickerSet(
    setId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetStickerSet>(
    TdApi.GetStickerSet(setId),error,callback)

class TGetStickers (
    emoji: String,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetStickers>(
    TdApi.GetStickers(emoji,limit),error,callback)

class TViewTrendingStickerSets (
    stickerSetIds: LongArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ViewTrendingStickerSets>(
    TdApi.ViewTrendingStickerSets(stickerSetIds),error,callback)

class TGetTrendingStickerSets (
    sticker: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetTrendingStickerSets>(
    TdApi.GetTrendingStickerSets(),error,callback)

class TGetStickerEmojis (
    sticker: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetStickerEmojis>(
    TdApi.GetStickerEmojis(sticker),error,callback)

class TChangeStickerSet (
    setId: Long,
    isInstalled: Boolean,
    isArchived: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ChangeStickerSet>(
    TdApi.ChangeStickerSet(setId,isInstalled,isArchived),error,callback)