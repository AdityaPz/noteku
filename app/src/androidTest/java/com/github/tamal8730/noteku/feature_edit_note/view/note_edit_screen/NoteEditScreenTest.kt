package com.github.tamal8730.noteku.feature_edit_note.view.note_edit_screen

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.tamal8730.noteku.MainActivity
import com.github.tamal8730.noteku.core.navigation.Screen
import com.github.tamal8730.noteku.ui.theme.NoteItTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class NoteEditScreenTest {

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setup() {


        composeRule.setContent {

            val navController = rememberNavController()
            NoteItTheme {
                NavHost(
                    navController = navController,
                    startDestination = Screen.EditNoteScreen.route
                ) {

                    composable(route = Screen.EditNoteScreen.route) {

//                        NoteEditScreen(
//                            viewModel = viewModel(
//                                factory = NoteEditScreenViewModelFactory(
//                                    noteEditRepository = NoteEditRepositoryImpl(noteDao),
//                                    noteID = noteID?.toLong(),
//                                    lastUpdateTimestampFormatter = LastUpdatedDateTimeFormatter()
//                                )
//                            ),
//                            onBack = {
//                                navController.popBackStack()
//                            },
//                            onDelete = {
//                                navController.popBackStack()
//                            }
//                        )

                    }

                }
            }


        }
    }

    @Test
    fun a() {


    }

}