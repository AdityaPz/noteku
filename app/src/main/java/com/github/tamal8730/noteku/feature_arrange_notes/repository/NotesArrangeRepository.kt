package com.github.tamal8730.noteku.feature_arrange_notes.repository

import com.github.tamal8730.noteku.core.model.NoteModel

interface NotesArrangeRepository {

    suspend fun getAllNotes(): List<NoteModel>

}