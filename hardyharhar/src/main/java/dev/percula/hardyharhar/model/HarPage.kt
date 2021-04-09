package dev.percula.hardyharhar.model

import dev.percula.hardyharhar.DateSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class HarPage(
    @SerialName("startedDateTime") @Serializable(with = DateSerializer::class) val startedDateTime: Date?,
    @SerialName("id") val id: String?,
    @SerialName("title") val title: String?,
    @SerialName("pageTimings") val pageTimings: HarPageTimings?,
    @SerialName("comment") val comment: String?
) {
    override fun toString(): String {
        return "HarPage [id = $id, title = $title, pageTimings = $pageTimings, comment = $comment, startedDateTime = $startedDateTime]"
    }
}