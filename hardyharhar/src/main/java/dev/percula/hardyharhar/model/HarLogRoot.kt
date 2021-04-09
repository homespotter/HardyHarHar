package dev.percula.hardyharhar.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This object represents the root of exported data.
 */
@Serializable
data class HarLogRoot(@SerialName("log") val log: HarLog)