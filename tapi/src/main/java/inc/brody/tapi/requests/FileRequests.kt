package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TCancelUploadFile (
    fileId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CancelUploadFile>(
    TdApi.CancelUploadFile(fileId),onError,onSuccess)

class TCancelDownloadFile (
    fileId: Int,
    onlyIfPending: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CancelDownloadFile>(
    TdApi.CancelDownloadFile(fileId,onlyIfPending),onError,onSuccess)

class TCleanFileName (
    fileName: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CleanFileName>(
    TdApi.CleanFileName(fileName),onError,onSuccess)

class TDeleteFile (
    fileId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteFile>(
    TdApi.DeleteFile(fileId),onError,onSuccess)

class TDeleteProfilePhoto (
    profilePhotoId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteProfilePhoto>(
    TdApi.DeleteProfilePhoto(profilePhotoId),onError,onSuccess)

class TDownloadFile (
    fileId: Int,
    priority: Int,
    offset: Int,
    limit: Int,
    synchronous: Boolean,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DownloadFile>(
    TdApi.DownloadFile(fileId,priority,offset,limit,synchronous),onError,onSuccess)

class TFinishFileGeneration (
    generationId: Long,
    errorFile: TdApi.Error,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.FinishFileGeneration>(
    TdApi.FinishFileGeneration(generationId,errorFile),onError,onSuccess)

class TGetFile (
    fileId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFile>(
    TdApi.GetFile(fileId),onError,onSuccess)

class TGetFileDownloadedPrefixSize (
    fileId: Int,
    offset: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFileDownloadedPrefixSize>(
    TdApi.GetFileDownloadedPrefixSize(fileId,offset),onError,onSuccess)

class TGetFileExtension (
    mimeType: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFileExtension>(
    TdApi.GetFileExtension(mimeType),onError,onSuccess)

class TGetFileMimeType (
    fileName: String,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFileMimeType>(
    TdApi.GetFileMimeType(fileName),onError,onSuccess)

class TGetMapThumbnailFile (
    location: TdApi.Location,
    zoom: Int,
    width: Int,
    height: Int,
    scale: Int,
    chatId: Long,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMapThumbnailFile>(
    TdApi.GetMapThumbnailFile(location,zoom,width,height,scale,chatId),onError,onSuccess)

class TGetRemoteFile (
    remoteFileId: String,
    fileType: TdApi.FileType,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetRemoteFile>(
    TdApi.GetRemoteFile(remoteFileId,fileType),onError,onSuccess)

class TGetUserProfilePhotos (
    userId: Int,
    offset: Int,
    limit: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetUserProfilePhotos>(
    TdApi.GetUserProfilePhotos(userId,offset,limit),onError,onSuccess)

class TReadFilePart (
    fileId: Int,
    offset: Int,
    count: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ReadFilePart>(
    TdApi.ReadFilePart(fileId,offset,count),onError,onSuccess)

class TSetFileGenerationProgress (
    generationId: Long,
    expectedSize: Int,
    localPrefixSize: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetFileGenerationProgress>(
    TdApi.SetFileGenerationProgress(generationId,expectedSize,localPrefixSize),onError,onSuccess)

class TSetProfilePhoto (
    photo: TdApi.InputFile,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetProfilePhoto>(
    TdApi.SetProfilePhoto(photo),onError,onSuccess)

class TUploadFile (
    file: TdApi.InputFile,
    fileType: TdApi.FileType,
    priority: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.UploadFile>(
    TdApi.UploadFile(file,fileType,priority),onError,onSuccess)

class TWriteGeneratedFilePart (
    generationId: Long,
    offset: Int,
    data: ByteArray,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.WriteGeneratedFilePart>(
    TdApi.WriteGeneratedFilePart(generationId,offset,data),onError,onSuccess)

