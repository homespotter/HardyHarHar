package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarContent
import dev.percula.hardyharhar.model.HarCookie
import dev.percula.hardyharhar.model.HarHeader
import dev.percula.hardyharhar.model.HarResponse
import java.util.*

class HarResponseBuilder {
    private var status = 0
    private var statusText: String? = null
    private var httpVersion: String? = null
    private var cookies: List<HarCookie> = ArrayList<HarCookie>()
    private var headers: List<HarHeader> = ArrayList<HarHeader>()
    private var content: HarContent? = null
    private var redirectURL: String? = null
    private var headersSize: Long? = null
    private var bodySize: Long? = null
    private var comment: String? = null
    fun withStatus(status: Int): HarResponseBuilder {
        this.status = status
        return this
    }

    fun withStatusText(statusText: String?): HarResponseBuilder {
        this.statusText = statusText
        return this
    }

    fun withHttpVersion(httpVersion: String?): HarResponseBuilder {
        this.httpVersion = httpVersion
        return this
    }

    fun withCookies(cookies: List<HarCookie>): HarResponseBuilder {
        this.cookies = cookies
        return this
    }

    fun withHeaders(headers: List<HarHeader>): HarResponseBuilder {
        this.headers = headers
        return this
    }

    fun withContent(content: HarContent?): HarResponseBuilder {
        this.content = content
        return this
    }

    fun withRedirectURL(redirectURL: String?): HarResponseBuilder {
        this.redirectURL = redirectURL
        return this
    }

    fun withHeadersSize(headersSize: Long?): HarResponseBuilder {
        this.headersSize = headersSize
        return this
    }

    fun withBodySize(bodySize: Long?): HarResponseBuilder {
        this.bodySize = bodySize
        return this
    }

    fun withComment(comment: String?): HarResponseBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarResponse {
        return HarResponse(
            status = status,
            statusText = statusText ?: "",
            httpVersion = httpVersion ?: "",
            cookies = cookies,
            headers = headers,
            content = content,
            redirectURL = redirectURL ?: "",
            headersSize = headersSize ?: 0,
            bodySize = bodySize ?: 0,
            comment = comment
        )
    }
}