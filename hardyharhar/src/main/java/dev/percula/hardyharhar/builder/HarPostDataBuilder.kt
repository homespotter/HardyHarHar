package dev.percula.hardyharhar.builder

import dev.percula.hardyharhar.model.HarParam
import dev.percula.hardyharhar.model.HarPostData
import java.util.*

class HarPostDataBuilder {
    private var mimeType: String? = null
    private val params: MutableList<HarParam> = ArrayList<HarParam>()
    private var text: String? = null
    private var comment: String? = null
    fun withMimeType(mimeType: String?): HarPostDataBuilder {
        this.mimeType = mimeType
        return this
    }

    fun withParams(params: List<HarParam>?): HarPostDataBuilder {
        this.params.addAll(params!!)
        return this
    }

    fun addParam(param: HarParam): HarPostDataBuilder {
        params.add(param)
        return this
    }

    fun withText(text: String?): HarPostDataBuilder {
        this.text = text
        return this
    }

    fun withComment(comment: String?): HarPostDataBuilder {
        this.comment = comment
        return this
    }

    fun build(): HarPostData {
        return HarPostData(
            mimeType = mimeType ?: "",
            params = params,
            text = text ?: "",
            comment = comment
        )
    }
}