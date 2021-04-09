package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarPage
import dev.percula.hardyharhar.model.HarPageTimings
import java.util.*

class HarPageBuilder {
    private var startedDateTime: Date? = null
    private var id: String? = null
    private var title: String? = null
    private var pageTimings: HarPageTimings? = null
    private var comment: String? = null
    fun withStartedDateTime(startedDateTime: Date?): HarPageBuilder {
        this.startedDateTime = startedDateTime
        return this
    }

    fun withId(id: String?): HarPageBuilder {
        this.id = id
        return this
    }

    fun withTitle(title: String?): HarPageBuilder {
        this.title = title
        return this
    }

    fun withPageTimings(pageTimings: HarPageTimings?): HarPageBuilder {
        this.pageTimings = pageTimings
        return this
    }

    fun withComment(comment: String?): HarPageBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarPage {
        return HarPage(
            startedDateTime = startedDateTime,
            id = id,
            title = title,
            pageTimings = pageTimings,
            comment = comment)
    }
}