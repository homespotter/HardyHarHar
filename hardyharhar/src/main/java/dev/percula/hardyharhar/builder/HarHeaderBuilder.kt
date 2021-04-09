package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarHeader
import java.lang.String.join
import java.util.*

class HarHeaderBuilder {
    private var name: String? = null
    private val values: MutableList<String> = ArrayList()
    private var comment: String? = null
    fun withName(name: String?): HarHeaderBuilder {
        this.name = name
        return this
    }

    fun withValue(value: String): HarHeaderBuilder {
        values.add(value)
        return this
    }

    fun withValues(values: List<String>?): HarHeaderBuilder {
        if (values != null) {
            this.values.addAll(values)
        }
        return this
    }

    fun withComment(comment: String?): HarHeaderBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarHeader {
        return HarHeader(
            name = name ?: "",
            value = join(",", values),
            comment = comment
        )
    }
}