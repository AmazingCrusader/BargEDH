package com.barge.bargedh.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.barge.bargedh.model.DeckEntity

@Dao
interface EDHDatabaseDao {

    @Insert
    fun insert(e: DeckEntity)

    @Update
    fun update(e: DeckEntity)

    @Query("SELECT * FROM decks WHERE id = :id")
    fun get(id: Long) : LiveData<DeckEntity>?

    @Query("SELECT * FROM decks WHERE owner = :owner")
    fun getAllDecksByOwner(owner: String) : LiveData<List<DeckEntity>>?

    @Query("DELETE FROM decks")
    fun clearDecks()

}