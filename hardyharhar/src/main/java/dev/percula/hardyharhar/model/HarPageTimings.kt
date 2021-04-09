package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HarPageTimings(
    @SerialName("onContentLoad") val onContentLoad: Long,
    @SerialName("onLoad") val onLoad: Long,
    @SerialName("comment") val comment: String?
) {
    override fun toString(): String {
        return "HarPageTimings [onLoad = $onLoad, onContentLoad = $onContentLoad, comment = $comment]"
    }
}