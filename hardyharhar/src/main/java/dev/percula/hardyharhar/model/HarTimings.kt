package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This object describes various phases within request-response round trip. All times are specified in milliseconds.
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.timings)
 */
@Serializable
data class HarTimings(
    @SerialName("blocked") val blocked: Long?,
    @SerialName("dns") val dns: Long?,
    @SerialName("connect") val connect: Long?,
    @SerialName("send") val send: Long,
    @SerialName("wait") val wait: Long,
    @SerialName("receive") val receive: Long,
    @SerialName("ssl") val ssl: Long?,
    @SerialName("comment") val comment: String?
) {
    override fun toString(): String {
        return "HarTimings [send = $send, connect = $connect, dns = $dns, ssl = $ssl, blocked = $blocked, wait = $wait, comment = $comment, receive = $receive]"
    }
}