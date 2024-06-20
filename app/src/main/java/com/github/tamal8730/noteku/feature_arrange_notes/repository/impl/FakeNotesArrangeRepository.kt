package com.github.tamal8730.noteku.feature_arrange_notes.repository.impl

import com.github.tamal8730.noteku.core.model.NoteModel
import com.github.tamal8730.noteku.feature_arrange_notes.repository.NotesArrangeRepository

class FakeNotesArrangeRepository(private val notes: List<NoteModel>) : NotesArrangeRepository {

    override suspend fun getAllNotes(): List<NoteModel> {
        return notes
    }


}