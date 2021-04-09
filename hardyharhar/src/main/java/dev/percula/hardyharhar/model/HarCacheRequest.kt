package dev.percula.hardyharhar.model

import dev.percula.hardyharhar.DateSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class HarCacheRequest constructor(
    @SerialName("expires") @Serializable(with = DateSerializer::class) val expires: Date?,
    @SerialName("lastAccess") @Serializable(with = DateSerializer::class) val lastAccess: Date?,
    @SerialName("eTag") val eTag: String = "",
    @SerialName("hitCount") val hitCount: Long = 0L,
    @SerialName("comment") val comment: String?
) {
    override fun toString(): String {
        return "HarCacheRequest [eTag = $eTag, expires = $expires, hitCount = $hitCount, lastAccess = $lastAccess, comment = $comment]"
    }
}