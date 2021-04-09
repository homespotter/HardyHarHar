package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Cookie used in request and response objects.
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.cookies)
 */
@Serializable
data class HarCookie(
    @SerialName("name") val name: String,
    @SerialName("value") val value: String,
    @SerialName("path") val path: String?,
    @SerialName("domain") val domain: String?,
    @SerialName("expires") val expires: String?,
    @SerialName("httpOnly") val httpOnly: Boolean?,
    @SerialName("secure") val secure: Boolean?,
    @SerialName("comment") val comment: String?,
) {
    override fun toString(): String {
        return "HarCookie [expires = $expires, name = $name, secure = $secure, domain = $domain, path = $path, value = $value, httpOnly = $httpOnly, comment = $comment]"
    }
}