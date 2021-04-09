package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Posted parameters, if any (embedded in postData object).
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.params)
 */
@Serializable
data class HarParam(
    @SerialName("name") val name: String,
    @SerialName("value") val value: String?,
    @SerialName("fileName") val fileName: String?,
    @SerialName("contentType") val contentType: String?,
    @SerialName("comment") val comment: String?
) {
    override fun toString(): String {
        return "HarParam [name = $name, fileName = $fileName, value = $value, contentType = $contentType, comment = $comment]"
    }
}