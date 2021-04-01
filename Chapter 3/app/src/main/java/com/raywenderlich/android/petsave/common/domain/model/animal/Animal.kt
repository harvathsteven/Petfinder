package com.raywenderlich.android.petsave.common.domain.model.animal

import org.threeten.bp.LocalDateTime

data class Animal(
    var id: Long,
    var name: String,
    var type: String,
    var media: Media,
    val tags: List<String>,
    val adoptionStatus: AdoptionStatus,
    val publishedAt: LocalDateTime
)