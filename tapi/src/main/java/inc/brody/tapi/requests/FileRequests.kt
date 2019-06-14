package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TCancelUploadFile (
    fileId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CancelUploadFile>(
    TdApi.CancelUploadFile(fileId),error,callback)

class TCancelDownloadFile (
    fileId: Int,
    onlyIfPending: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CancelDownloadFile>(
    TdApi.CancelDownloadFile(fileId,onlyIfPending),error,callback)

class TCleanFileName (
    fileName: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.CleanFileName>(
    TdApi.CleanFileName(fileName),error,callback)

class TDeleteFile (
    fileId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteFile>(
    TdApi.DeleteFile(fileId),error,callback)

class TDeleteProfilePhoto (
    profilePhotoId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DeleteProfilePhoto>(
    TdApi.DeleteProfilePhoto(profilePhotoId),error,callback)

class TDownloadFile (
    fileId: Int,
    priority: Int,
    offset: Int,
    limit: Int,
    synchronous: Boolean,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DownloadFile>(
    TdApi.DownloadFile(fileId,priority,offset,limit,synchronous),error,callback)

class TFinishFileGeneration (
    generationId: Long,
    errorFile: TdApi.Error,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.FinishFileGeneration>(
    TdApi.FinishFileGeneration(generationId,errorFile),error,callback)

class TGetFile (
    fileId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFile>(
    TdApi.GetFile(fileId),error,callback)

class TGetFileDownloadedPrefixSize (
    fileId: Int,
    offset: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFileDownloadedPrefixSize>(
    TdApi.GetFileDownloadedPrefixSize(fileId,offset),error,callback)

class TGetFileExtension (
    mimeType: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFileExtension>(
    TdApi.GetFileExtension(mimeType),error,callback)

class TGetFileMimeType (
    fileName: String,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetFileMimeType>(
    TdApi.GetFileMimeType(fileName),error,callback)

class TGetMapThumbnailFile (
    location: TdApi.Location,
    zoom: Int,
    width: Int,
    height: Int,
    scale: Int,
    chatId: Long,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetMapThumbnailFile>(
    TdApi.GetMapThumbnailFile(location,zoom,width,height,scale,chatId),error,callback)

class TGetRemoteFile (
    remoteFileId: String,
    fileType: TdApi.FileType,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetRemoteFile>(
    TdApi.GetRemoteFile(remoteFileId,fileType),error,callback)

class TGetUserProfilePhotos (
    userId: Int,
    offset: Int,
    limit: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetUserProfilePhotos>(
    TdApi.GetUserProfilePhotos(userId,offset,limit),error,callback)

class TReadFilePart (
    fileId: Int,
    offset: Int,
    count: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.ReadFilePart>(
    TdApi.ReadFilePart(fileId,offset,count),error,callback)

class TSetFileGenerationProgress (
    generationId: Long,
    expectedSize: Int,
    localPrefixSize: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetFileGenerationProgress>(
    TdApi.SetFileGenerationProgress(generationId,expectedSize,localPrefixSize),error,callback)

class TSetProfilePhoto (
    photo: TdApi.InputFile,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.SetProfilePhoto>(
    TdApi.SetProfilePhoto(photo),error,callback)

class TUploadFile (
    file: TdApi.InputFile,
    fileType: TdApi.FileType,
    priority: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.UploadFile>(
    TdApi.UploadFile(file,fileType,priority),error,callback)

class TWriteGeneratedFilePart (
    generationId: Long,
    offset: Int,
    data: ByteArray,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.WriteGeneratedFilePart>(
    TdApi.WriteGeneratedFilePart(generationId,offset,data),error,callback)

