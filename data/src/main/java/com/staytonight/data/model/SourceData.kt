package com.staytonight.data.model

import com.staytonight.domain.MapTo
import com.staytonight.domain.model.Source

data class SourceData(
    val id: String?,
    val name: String?
): MapTo<Source, SourceData> {
    override fun mapTo(): Source =
        Source(id, name)
}