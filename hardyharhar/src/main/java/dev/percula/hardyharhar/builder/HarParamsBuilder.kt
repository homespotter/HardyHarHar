package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarParam

class HarParamsBuilder {
    private var name: String? = null
    private var value: String? = null
    private var fileName: String? = null
    private var contentType: String? = null
    private var comment: String? = null
    fun withName(name: String?): HarParamsBuilder {
        this.name = name
        return this
    }

    fun withValue(value: String?): HarParamsBuilder {
        this.value = value
        return this
    }

    fun withFileName(fileName: String?): HarParamsBuilder {
        this.fileName = fileName
        return this
    }

    fun withContentType(contentType: String?): HarParamsBuilder {
        this.contentType = contentType
        return this
    }

    fun withComment(comment: String?): HarParamsBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarParam {
        return HarParam(
            name = name ?: "",
            value = value,
            fileName = fileName,
            contentType = contentType,
            comment = comment
        )
    }
}