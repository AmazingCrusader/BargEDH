package com.barge.bargedh.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.barge.bargedh.model.DeckEntity

@Database(entities = [DeckEntity::class], version = 1, exportSchema = false)
public abstract class EDHDatabase : RoomDatabase() {

    abstract val dao: EDHDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: EDHDatabase? = null

        fun getInstance(context: Context): EDHDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if(instance == null) {
                    instance = Room.databaseBuilder(
                        context,
                        EDHDatabase::class.java,
                        "edh_database")
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}