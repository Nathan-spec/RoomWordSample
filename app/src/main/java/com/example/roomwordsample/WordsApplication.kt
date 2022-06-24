package com.example.roomwordsample

import android.app.Application
import com.example.roomwordsample.WordRoomDatabase.WordRoomDatabase.Companion.getDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob


class WordsApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
     val database by lazy { getDatabase(this, applicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }
}
