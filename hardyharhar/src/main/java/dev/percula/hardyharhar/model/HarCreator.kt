package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the creator of HAR
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.creator)
 */
@Serializable
data class HarCreator(
    @SerialName("name") val name: String,
    @SerialName("comment") val comment: String?,
    @SerialName("version") val version: String
) {
    override fun toString(): String {
        return "HarCreator [name = $name, comment = $comment, version = $version]"
    }
}