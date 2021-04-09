package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This object describes details about response content (embedded in response object).
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.content)
 */
@Serializable
data class HarContent(
    @SerialName("size") val size: Long = 0L,
    @SerialName("compression") val compression: Long?,
    @SerialName("mimeType") val mimeType: String = "",
    @SerialName("text") val text: String?,
    @SerialName("comment") val comment: String?
) {
    override fun toString(): String {
        return "HarContent [text = $text, comment = $comment, compression = $compression, mimeType = $mimeType, size = $size]"
    }
}