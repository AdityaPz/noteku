package com.github.tamal8730.noteku.core.model

data class NoteModel(
    val id: Long,
    val title: String? = null,
    val body: String = "",
    val coverImage: String? = null,
    val lastModifiedAt: String,
    val tasks: List<TaskListItemModel>? = null,
    val color: Long? = null,
)
