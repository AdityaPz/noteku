package com.github.tamal8730.noteku.feature_edit_note.repository

import com.github.tamal8730.noteku.core.model.NoteModel

interface NoteEditRepository {

    suspend fun saveNote(note: NoteModel): Long
    suspend fun loadNote(id: Long): NoteModel?
    suspend fun deleteNote(id: Long)

}