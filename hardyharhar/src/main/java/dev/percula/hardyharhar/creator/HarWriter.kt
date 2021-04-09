package dev.percula.hardyharhar.creator

import dev.percula.hardyharhar.model.HarLog
import java.io.File
import java.io.IOException

/**
 * Writes HAR log to an to the given file.
 *
 */
interface HarWriter {
    /**
     * Writes the HarLog to the provided file.
     *
     * @param      harLog    the harLog needs to be written.
     * @param      logFile   the file where harlLog needs to be written.
     * @exception  IOException  if the harLog cannot be written
     */
    @Throws(IOException::class)
    fun writeHarLogToFile(harLog: HarLog, logFile: File)
}