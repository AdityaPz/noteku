package com.github.tamal8730.noteku.feature_arrange_notes.view.notes_grid_screen.ui_model

data class NoteUIModel(
    val id: Long,
    val title: String,
    val body: String?,
    val coverImage: String?,
    val lastModifiedAt: String,
    val tasks: List<TaskUIModel>?,
    val color: Long?,
)
