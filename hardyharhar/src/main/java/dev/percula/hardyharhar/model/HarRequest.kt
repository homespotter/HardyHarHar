package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This object contains detailed info about performed request.
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.request)
 */
@Serializable
data class HarRequest(
    @SerialName("headersSize") val headersSize: Long,
    @SerialName("method") val method: String,
    @SerialName("url") val url: String,
    @SerialName("httpVersion") val httpVersion: String,
    @SerialName("cookies") val cookies: List<HarCookie> = emptyList(),
    @SerialName("headers") val headers: List<HarHeader> = emptyList(),
    @SerialName("queryString") val queryString: List<HarQueryString> = emptyList(),
    @SerialName("postData") val postData: HarPostData?,
    @SerialName("bodySize") val bodySize: Long,
    @SerialName("comment") val comment: String? = null
) {
    override fun toString(): String {
        return "HarRequest [headers = $headers, queryString = $queryString, bodySize = $bodySize, postData = $postData, httpVersion = $httpVersion, method = $method, comment = $comment, cookies = $cookies, url = $url, headersSize = $headersSize]"
    }
}