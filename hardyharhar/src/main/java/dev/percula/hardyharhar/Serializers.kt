package dev.percula.hardyharhar

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.text.SimpleDateFormat
import java.util.*


@Serializer(forClass = Date::class)
object DateSerializer : KSerializer<Date?> {

    private val df = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")

    override fun deserialize(decoder: Decoder): Date? {
        return try {
            df.parse(decoder.decodeString())
        } catch (e: Exception) {
            println(e.message)
            null
        }
    }

    override fun serialize(encoder: Encoder, value: Date?) {
        encoder.encodeString(df.format(value))
    }

}