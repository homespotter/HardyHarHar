package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarPageTimings

class HarPageTimingsBuilder {
    private var onContentLoad = -1L
    private var onLoad = -1L
    private var comment: String? = null
    fun withOnContentLoad(onContentLoad: Long): HarPageTimingsBuilder {
        this.onContentLoad = onContentLoad
        return this
    }

    fun withOnLoad(onLoad: Long): HarPageTimingsBuilder {
        this.onLoad = onLoad
        return this
    }

    fun withComment(comment: String?): HarPageTimingsBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarPageTimings {
        return HarPageTimings(
            onContentLoad = onContentLoad,
            onLoad = onLoad,
            comment = comment
        )
    }
}