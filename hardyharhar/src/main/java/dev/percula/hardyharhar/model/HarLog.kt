package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This object represents the top log object according the HAR specification.
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.log)
 */
@Serializable
data class HarLog(
    @SerialName("version") val version: String = "1.2",
    @SerialName("creator") val creator: HarCreator?,
    @SerialName("browser") val browser: HarBrowser?,
    @SerialName("pages") val pages: List<HarPage> = mutableListOf(),
    @SerialName("entries") val entries: List<HarEntry> = mutableListOf(),
    @SerialName("comment") val comment: String?
) {

    override fun toString(): String {
        return "HarLog [pages = $pages, browser = $browser, entries = $entries, comment = $comment, creator = $creator, version = $version]"
    }

}