package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarCookie

class HarCookieBuilder {
    private var name: String? = null
    private var value: String? = null
    private var path: String? = null
    private var domain: String? = null
    private var expires: String? = null
    private var httpOnly = false
    private var secure = false
    private var comment: String? = null
    fun withName(name: String?): HarCookieBuilder {
        this.name = name
        return this
    }

    fun withValue(value: String?): HarCookieBuilder {
        this.value = value
        return this
    }

    fun withPath(path: String?): HarCookieBuilder {
        this.path = path
        return this
    }

    fun withDomain(domain: String?): HarCookieBuilder {
        this.domain = domain
        return this
    }

    fun withExpires(expires: String?): HarCookieBuilder {
        this.expires = expires
        return this
    }

    fun withHttpOnly(httpOnly: Boolean): HarCookieBuilder {
        this.httpOnly = httpOnly
        return this
    }

    fun withSecure(secure: Boolean): HarCookieBuilder {
        this.secure = secure
        return this
    }

    fun withComment(comment: String?): HarCookieBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarCookie {
        return HarCookie(
            name = name ?: "",
            value = value ?: "",
            path = path,
            domain = domain,
            expires = expires,
            httpOnly = httpOnly,
            secure = secure,
            comment = comment
        )
    }
}