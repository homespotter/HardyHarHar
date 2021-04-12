[![](https://jitpack.io/v/percula/hardyharhar.svg)](https://jitpack.io/#percula/hardyharhar)

## HardyHarHar

A Kotlin library to create [HAR](http://www.softwareishard.com/blog/har-12-spec/) network log files.

## Usage
```kotlin
private val entries = mutableListOf<HarEntry>()

fun addEntry() {
    val harRequest: HarRequest = HarRequest(
            method = "GET",
            url = "http://example.com",
            httpVersion = "HTTP/1.1",
    )

    val harResponse: HarResponse = HarResponse(
            status = 200,
            statusText = "OK",
            httpVersion = "HTTP/1.1",
    )

    entries.add(HarEntry(
            request = harRequest,
            response = harResponse,
            startedDateTime = Date(),
            time = 200 // duration of network request in ms,
    ))
}

fun writeHarFile() {
    val file = File("treasure_map.har")
    DefaultHarWriter().writeHarLogToFile(HarLog(entries = entries), file)
}
```