package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This object contains detailed info about the response.
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.response)
 */
@Serializable
data class HarResponse(
    @SerialName("status") val status: Int,
    @SerialName("statusText") val statusText: String,
    @SerialName("httpVersion") val httpVersion: String,
    @SerialName("cookies") val cookies: List<HarCookie> = emptyList(),
    @SerialName("headers") val headers: List<HarHeader> = emptyList(),
    @SerialName("headersSize") val headersSize: Long = headers.size.toLong(),
    @SerialName("content") val content: HarContent? = null,
    @SerialName("redirectURL") val redirectURL: String? = null,
    @SerialName("bodySize") val bodySize: Long = 0L,
    @SerialName("comment") val comment: String? = null
) {
    override fun toString(): String {
        return "HarResponse [content = $content, headers = $headers, bodySize = $bodySize, httpVersion = $httpVersion, status = $status, redirectURL = $redirectURL, statusText = $statusText, comment = $comment, cookies = $cookies, headersSize = $headersSize]"
    }
}