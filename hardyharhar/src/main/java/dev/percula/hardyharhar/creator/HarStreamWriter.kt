package dev.percula.hardyharhar.creator

import dev.percula.hardyharhar.model.HarEntry
import java.io.IOException

/**
 * Writes HAR log to an output file in a streaming way. It should be used when entries need to be appended over time.
 *
 */
interface HarStreamWriter {
    /**
     * Adds an entry to an already created HarLog.
     *
     * @param      harEntry    the harEntry you want to append.
     * @exception  IOException  if it fails to write the entry
     */
    @Throws(IOException::class)
    fun addEntry(harEntry: HarEntry?)

    /**
     * Closes the entries array and the root HarLog object.
     *
     * @exception  IOException  if it fails to close the HarLog
     */
    @Throws(IOException::class)
    fun closeHar()
}