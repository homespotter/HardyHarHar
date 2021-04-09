package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarCache
import dev.percula.hardyharhar.model.HarCacheRequest

class HarCacheBuilder {
    private var beforeRequest: HarCacheRequest? = null
    private var afterRequest: HarCacheRequest? = null
    private var comment: String? = null
    fun withBeforeRequest(beforeRequest: HarCacheRequest?): HarCacheBuilder {
        this.beforeRequest = beforeRequest
        return this
    }

    fun withAfterRequest(afterRequest: HarCacheRequest?): HarCacheBuilder {
        this.afterRequest = afterRequest
        return this
    }

    fun withComment(comment: String?): HarCacheBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarCache {
        return HarCache(beforeRequest, afterRequest, comment)
    }
}