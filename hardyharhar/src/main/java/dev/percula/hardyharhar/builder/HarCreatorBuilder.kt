package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarCreator

class HarCreatorBuilder {
    private var name: String? = null
    private var comment: String? = null
    private var version: String? = null
    fun withName(name: String?): HarCreatorBuilder {
        this.name = name
        return this
    }

    fun withComment(comment: String?): HarCreatorBuilder {
        this.comment = comment
        return this
    }

    fun withVersion(version: String?): HarCreatorBuilder {
        this.version = version
        return this
    }

    fun build(): HarCreator {
        return HarCreator(
            name = name ?: "",
            comment = comment,
            version = version ?: ""
        )
    }
}