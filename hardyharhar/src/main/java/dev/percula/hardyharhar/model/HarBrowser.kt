package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HarBrowser(
    @SerialName("name") val name: String,
    @SerialName("version") val version: String,
    @SerialName("comment") val comment: String?,
) {
    override fun toString(): String {
        return "HarBrowser [name = $name, comment = $comment, version = $version]"
    }
}