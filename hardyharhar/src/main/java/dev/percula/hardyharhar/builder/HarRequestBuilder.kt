package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.*
import java.io.UnsupportedEncodingException
import java.net.URLDecoder
import java.util.*

class HarRequestBuilder {
    private var headersSize = -1L
    private var method: String? = null
    private var url: String? = null
    private var httpVersion: String? = null
    private var cookies: List<HarCookie> = ArrayList<HarCookie>()
    private var headers: List<HarHeader> = ArrayList<HarHeader>()
    private var queryString: List<HarQueryString> = ArrayList<HarQueryString>()
    private var postData: HarPostData? = null
    private var bodySize = -1L
    private var comment: String? = null
    fun withHeadersSize(headersSize: Long): HarRequestBuilder {
        this.headersSize = headersSize
        return this
    }

    fun withMethod(method: String?): HarRequestBuilder {
        this.method = method
        return this
    }

    fun withUrl(url: String?): HarRequestBuilder {
        this.url = url
        return this
    }

    fun withHttpVersion(httpVersion: String?): HarRequestBuilder {
        this.httpVersion = httpVersion
        return this
    }

    fun withCookies(cookies: List<HarCookie>): HarRequestBuilder {
        this.cookies = cookies
        return this
    }

    fun withHeaders(headers: List<HarHeader>): HarRequestBuilder {
        this.headers = headers
        return this
    }

    fun withQueryString(queryString: List<HarQueryString>): HarRequestBuilder {
        this.queryString = queryString
        return this
    }

    @Throws(UnsupportedEncodingException::class)
    fun withQueryString(queryString: String): HarRequestBuilder {
        val queryStrings: MutableList<HarQueryString> = ArrayList<HarQueryString>()
        val parameters = queryString.split("&").toTypedArray()
        for (parameter in parameters) {
            val idx = parameter.indexOf("=")
            val key =
                if (idx > 0) URLDecoder.decode(parameter.substring(0, idx), "UTF-8") else parameter
            val value = if (idx > 0 && parameter.length > idx + 1) URLDecoder.decode(
                parameter.substring(idx + 1),
                "UTF-8"
            ) else ""
            if (!key.isEmpty()) {
                queryStrings.add(HarQueryString(key, value, ""))
            }
        }
        this.queryString = queryStrings
        return this
    }

    fun withPostData(postData: HarPostData?): HarRequestBuilder {
        this.postData = postData
        return this
    }

    fun withBodySize(bodySize: Long): HarRequestBuilder {
        this.bodySize = bodySize
        return this
    }

    fun withComment(comment: String?): HarRequestBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarRequest {
        return HarRequest(
            headersSize = headersSize,
            method = method ?: "",
            url = url ?: "",
            httpVersion = httpVersion ?: "",
            cookies = cookies,
            headers = headers,
            queryString = queryString,
            postData = postData,
            bodySize = bodySize,
            comment = comment
        )
    }
}