package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This objects contains info about a request coming from browser cache.
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.cache)
 */
@Serializable
data class HarCache(
    @SerialName("beforeRequest") val beforeRequest: HarCacheRequest?,
    @SerialName("afterRequest") val afterRequest: HarCacheRequest?,
    @SerialName("comment") val comment: String?
) {
    override fun toString(): String {
        return "HarCache [beforeRequest = $beforeRequest, afterRequest = $afterRequest, comment = $comment]"
    }
}