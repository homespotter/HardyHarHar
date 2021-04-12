package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.*
import java.util.*

class HarLogBuilder {
    private var version = "1.2"
    private var creator: HarCreator = HarCreator(
        name = "HardyHarHar",
        version = "1.0",
    )
    private var browser: HarBrowser? = null
    private var pages: List<HarPage>? = null
    private var entries: MutableList<HarEntry> = ArrayList<HarEntry>()
    private var comment: String? = null
    fun withVersion(version: String): HarLogBuilder {
        this.version = version
        return this
    }

    fun withCreator(creator: HarCreator): HarLogBuilder {
        this.creator = creator
        return this
    }

    fun withBrowser(browser: HarBrowser?): HarLogBuilder {
        this.browser = browser
        return this
    }

    fun withPages(pages: List<HarPage>?): HarLogBuilder {
        this.pages = pages
        return this
    }

    fun withEntries(entries: MutableList<HarEntry>): HarLogBuilder {
        this.entries = entries
        return this
    }

    fun addEntry(entry: HarEntry): HarLogBuilder {
        entries.add(entry)
        return this
    }

    fun withComment(comment: String?): HarLogBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarLog {
        return HarLog(
            version = version,
            creator = creator,
            browser = browser,
            pages = pages ?: emptyList(),
            entries = entries,
            comment = comment
        )
    }
}