[![](https://jitpack.io/v/homespotter/hardyharhar.svg)](https://jitpack.io/#homespotter/hardyharhar)

## HardyHarHar

A Kotlin library to create [HAR](http://www.softwareishard.com/blog/har-12-spec/) network log files.

## Install
```gradle
implementation 'com.github.homespotter:hardyharhar:LATEST_RELEASE'
```

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

## Proguard
You may need to add the following to your proguard-rules.pro
```
-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.SerializationKt
-keep,includedescriptorclasses class dev.percula.hardyharhar.**$$serializer { *; }
-keepclassmembers class dev.percula.hardyharhar.** {
    *** Companion;
}
-keepclasseswithmembers class dev.percula.hardyharhar.** {
    kotlinx.serialization.KSerializer serializer(...);
}
```

## Credits

HardyHarHar is based on [Har-Java](https://github.com/SmartBear/har-java)
