package dev.percula.hardyharhar.creator

import dev.percula.hardyharhar.model.HarLog
import dev.percula.hardyharhar.model.HarLogRoot
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.IOException


class DefaultHarWriter : HarWriter {

    @Throws(IOException::class)
    override fun writeHarLogToFile(harLog: HarLog, logFile: File) {
        val json = Json {
            ignoreUnknownKeys = true
            isLenient = true
            allowSpecialFloatingPointValues = false
        }

        val harLogRoot = HarLogRoot(harLog)
        val harJson = json.encodeToString(harLogRoot)
        val writer = BufferedWriter(FileWriter(logFile))
        try {
            writer.write(harJson)
        } finally {
            writer.flush()
            writer.close()
        }
    }

}