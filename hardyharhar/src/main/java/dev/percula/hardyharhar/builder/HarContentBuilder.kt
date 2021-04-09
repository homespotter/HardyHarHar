package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarContent

class HarContentBuilder {
    private var size: Long? = null
    private var compression: Long? = null
    private var mimeType: String? = null
    private var text: String? = null
    private var comment: String? = null
    fun withSize(size: Long?): HarContentBuilder {
        this.size = size
        return this
    }

    fun withCompression(compression: Long?): HarContentBuilder {
        this.compression = compression
        return this
    }

    fun withMimeType(mimeType: String?): HarContentBuilder {
        this.mimeType = mimeType
        return this
    }

    fun withText(text: String?): HarContentBuilder {
        this.text = text
        return this
    }

    fun withComment(comment: String?): HarContentBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarContent {
        return HarContent(
            size = size ?: 0L,
            compression = compression,
            mimeType = mimeType ?: "",
            text = text,
            comment = comment
        )
    }
}