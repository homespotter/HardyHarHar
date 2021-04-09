package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This object contains list of all parameters and values parsed from a query string, if any (embedded in request object).
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.queryString)
 */
@Serializable
data class HarQueryString(
    @SerialName("name") val name: String,
    @SerialName("value") val value: String,
    @SerialName("comment") val comment: String?
) {
    override fun toString(): String {
        return "HarQueryString [name = $name, value = $value, comment = $comment]"
    }
}