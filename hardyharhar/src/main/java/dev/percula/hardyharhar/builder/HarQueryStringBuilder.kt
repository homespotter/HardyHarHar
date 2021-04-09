package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarQueryString

class HarQueryStringBuilder {
    private var name: String? = null
    private var value: String? = null
    private var comment: String? = null
    fun withName(name: String?): HarQueryStringBuilder {
        this.name = name
        return this
    }

    fun withValue(value: String?): HarQueryStringBuilder {
        this.value = value
        return this
    }

    fun withComment(comment: String?): HarQueryStringBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarQueryString {
        return HarQueryString(
            name = name ?: "",
            value = value ?: "",
            comment = comment
        )
    }
}