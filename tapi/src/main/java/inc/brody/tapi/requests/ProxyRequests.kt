package inc.brody.tapi.requests

import inc.brody.tapi.utils.responses.ErrorResponse
import org.drinkless.td.libcore.telegram.TdApi

class TAddProxy (
    server: String,
    port: Int,
    enable: Boolean,
    type: TdApi.ProxyType,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.AddProxy>(
    TdApi.AddProxy(server,port,enable,type),error,callback)

class TDisableProxy (
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.DisableProxy>(
    TdApi.DisableProxy(),error,callback)

class TEditProxy (
    proxyId: Int,
    server: String,
    port: Int,
    enable: Boolean,
    type: TdApi.ProxyType,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EditProxy>(
    TdApi.EditProxy(proxyId,server,port,enable,type),error,callback)

class TEnableProxy (
    proxyId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.EnableProxy>(
    TdApi.EnableProxy(proxyId),error,callback)

class TGetProxyLink (
    proxyId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetProxyLink>(
    TdApi.GetProxyLink(proxyId),error,callback)

class TPingProxy (
    proxyId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.PingProxy>(
    TdApi.PingProxy(proxyId),error,callback)

class TRemoveProxy (
    proxyId: Int,
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.RemoveProxy>(
    TdApi.RemoveProxy(proxyId),error,callback)

class TGetProxies(
    error: ((ErrorResponse)->Unit)? = null,
    callback: ((TdApi.Object?)->Unit)? = null
) : TRequest<TdApi.GetProxies>(
    TdApi.GetProxies(),error,callback)