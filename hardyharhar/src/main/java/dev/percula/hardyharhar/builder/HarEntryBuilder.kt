package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.*
import java.util.*
import dev.percula.hardyharhar.model.HarEntry as HarEntry1

class HarEntryBuilder {
    private var pageref: String? = null
    private var startedDateTime: Date? = null
    private var time: Long = 0
    private var request: HarRequest? = null
    private var response: HarResponse? = null
    private var cache: HarCache? = null
    private var timings: HarTimings? = null
    private var serverIPAddress: String? = null
    private var connection: String? = null
    private var comment: String? = null
    fun withPageref(pageref: String?): HarEntryBuilder {
        this.pageref = pageref
        return this
    }

    fun withStartedDateTime(startedDateTime: Date?): HarEntryBuilder {
        this.startedDateTime = startedDateTime
        return this
    }

    fun withTime(time: Long): HarEntryBuilder {
        this.time = time
        return this
    }

    fun withRequest(request: HarRequest?): HarEntryBuilder {
        this.request = request
        return this
    }

    fun withResponse(response: HarResponse?): HarEntryBuilder {
        this.response = response
        return this
    }

    fun withCache(cache: HarCache?): HarEntryBuilder {
        this.cache = cache
        return this
    }

    fun withTimings(timings: HarTimings?): HarEntryBuilder {
        this.timings = timings
        return this
    }

    fun withServerIPAddress(serverIPAddress: String?): HarEntryBuilder {
        this.serverIPAddress = serverIPAddress
        return this
    }

    fun withConnection(connection: String?): HarEntryBuilder {
        this.connection = connection
        return this
    }

    fun withComment(comment: String?): HarEntryBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarEntry1 {
        return HarEntry1(
            pageref = pageref ?: "",
            startedDateTime = startedDateTime,
            time = time,
            request = request,
            response = response,
            cache = cache,
            timings = timings,
            serverIPAddress = serverIPAddress,
            connection = connection,
            comment = comment
        )
    }
}