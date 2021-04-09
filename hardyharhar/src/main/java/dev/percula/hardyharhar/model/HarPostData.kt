package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

/**
 * This object describes posted data, if any (embedded in request object).
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.postData)
 */
@Serializable
data class HarPostData(
    @SerialName("mimeType") val mimeType: String,
    @SerialName("params") val params: List<HarParam> = arrayListOf(),
    @SerialName("text") val text: String,
    @SerialName("comment") val comment: String?
) {

    override fun toString(): String {
        return "HarPostData [text = $text, params = $params, comment = $comment, mimeType = $mimeType]"
    }

}