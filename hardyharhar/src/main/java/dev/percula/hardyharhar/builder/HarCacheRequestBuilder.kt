package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarCacheRequest
import java.util.*

class HarCacheRequestBuilder {
    private var expires: Date? = null
    private var lastAccess: Date? = null
    private var eTag: String? = null
    private var hitCount: Long? = null
    private var comment: String? = null
    fun withExpires(expires: Date?): HarCacheRequestBuilder {
        this.expires = expires
        return this
    }

    fun withLastAccess(lastAccess: Date?): HarCacheRequestBuilder {
        this.lastAccess = lastAccess
        return this
    }

    fun witheTag(eTag: String?): HarCacheRequestBuilder {
        this.eTag = eTag
        return this
    }

    fun withHitCount(hitCount: Long?): HarCacheRequestBuilder {
        this.hitCount = hitCount
        return this
    }

    fun withComment(comment: String?): HarCacheRequestBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarCacheRequest {
        return HarCacheRequest(
            expires = expires,
            lastAccess = lastAccess,
            eTag = eTag ?: "",
            hitCount = hitCount ?: 0L,
            comment)
    }
}