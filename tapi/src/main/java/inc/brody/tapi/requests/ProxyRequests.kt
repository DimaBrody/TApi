package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import inc.brody.tapi.utils.responses.TelegramErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddProxy (
    server: String,
    port: Int,
    enable: Boolean,
    type: TdApi.ProxyType,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddProxy>(
    TdApi.AddProxy(server,port,enable,type),onError,onSuccess)

class TDisableProxy (
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DisableProxy>(
    TdApi.DisableProxy(),onError,onSuccess)

class TEditProxy (
    proxyId: Int,
    server: String,
    port: Int,
    enable: Boolean,
    type: TdApi.ProxyType,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditProxy>(
    TdApi.EditProxy(proxyId,server,port,enable,type),onError,onSuccess)

class TEnableProxy (
    proxyId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EnableProxy>(
    TdApi.EnableProxy(proxyId),onError,onSuccess)

class TGetProxyLink (
    proxyId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetProxyLink>(
    TdApi.GetProxyLink(proxyId),onError,onSuccess)

class TPingProxy (
    proxyId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.PingProxy>(
    TdApi.PingProxy(proxyId),onError,onSuccess)

class TRemoveProxy (
    proxyId: Int,
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveProxy>(
    TdApi.RemoveProxy(proxyId),onError,onSuccess)

class TGetProxies(
    onError: ((TelegramErrorResponse)->Unit)? = null,
    onSuccess: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetProxies>(
    TdApi.GetProxies(),onError,onSuccess)