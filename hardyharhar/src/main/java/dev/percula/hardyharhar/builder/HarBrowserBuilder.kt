package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarBrowser

class HarBrowserBuilder {
    private var name: String? = null
    private var version: String? = null
    private var comment: String? = null
    fun withName(name: String?): HarBrowserBuilder {
        this.name = name
        return this
    }

    fun withVersion(version: String?): HarBrowserBuilder {
        this.version = version
        return this
    }

    fun withComment(comment: String?): HarBrowserBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarBrowser {
        return HarBrowser(
            name = name ?: "",
            version = version ?: "",
            comment = comment
        )
    }
}