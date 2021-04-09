package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarTimings

class HarTimingsBuilder {
    private var blocked: Long? = null
    private var dns: Long? = null
    private var connect: Long? = null
    private var send: Long? = null
    private var wait: Long? = null
    private var receive: Long? = null
    private var ssl: Long? = null
    private var comment: String? = null
    fun withBlocked(blocked: Long?): HarTimingsBuilder {
        this.blocked = blocked
        return this
    }

    fun withDns(dns: Long?): HarTimingsBuilder {
        this.dns = dns
        return this
    }

    fun withConnect(connect: Long?): HarTimingsBuilder {
        this.connect = connect
        return this
    }

    fun withSend(send: Long?): HarTimingsBuilder {
        this.send = send
        return this
    }

    fun withWait(wait: Long?): HarTimingsBuilder {
        this.wait = wait
        return this
    }

    fun withReceive(receive: Long?): HarTimingsBuilder {
        this.receive = receive
        return this
    }

    fun withSsl(ssl: Long?): HarTimingsBuilder {
        this.ssl = ssl
        return this
    }

    fun withComment(comment: String?): HarTimingsBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarTimings {
        return HarTimings(
            blocked = blocked,
            dns = dns,
            connect = connect,
            send = send ?: 0,
            wait = wait ?: 0,
            receive = receive ?: 0,
            ssl = ssl,
            comment = comment
        )
    }
}