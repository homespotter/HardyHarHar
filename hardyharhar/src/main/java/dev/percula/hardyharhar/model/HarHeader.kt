package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * HarHeader contains header information (used in request and response objects).
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.headers)
 */
@Serializable
data class HarHeader(
    @SerialName("name") val name: String,
    @SerialName("value") val value: String,
    @SerialName("comment") val comment: String?
) {
    override fun toString(): String {
        return "HarHeader [name = $name, value = $value, comment = $comment]"
    }
}