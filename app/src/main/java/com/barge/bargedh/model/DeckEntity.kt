package com.barge.bargedh.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "decks")
data class DeckEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "name")
    val name: String = "",
    @ColumnInfo(name = "commander")
    val commander: String = "",
    @ColumnInfo(name = "secondary_commander")
    val secondaryCommander: String?,
    @ColumnInfo(name = "companion")
    val companion: String = "",
    @ColumnInfo(name = "first_flair")
    val firstFlair: String = "",
    @ColumnInfo(name = "second_flair")
    val secondFlair: String = "",
    @ColumnInfo(name = "owner")
    val owner: String = "",
    @ColumnInfo(name = "img_src")
    val imgsrc: String = "",
    @ColumnInfo(name = "background_color")
    val backgroundColor: String = ""
) {
    enum class Flair {
        ARISTOCRAT,
        COMBO,
        MILL,
        STOMP,
        TOKEN,
        CONTROL,
        SPELLSLINGER,
        BIGMANA,
        ARTIFACTS,
        TRIBAL,
        CASCADE,
        POLITICS,
        REANIMATOR,
        GROUPHUG,
        GROUPSLUG,
        LIFEGAIN,
        EQUIPMENT,
        VOLTRON,
        COUNTERS,
        LANDS,
        ENCHANTMENTS,
        INFECT,
        MADNESS,
        CYCLE,
        NONE
    }

    companion object {
        public fun getFlair(flair: String) : Flair {
            return when(flair) {
                "Aristocrat" -> Flair.ARISTOCRAT
                "Combo" -> Flair.COMBO
                "Mill" -> Flair.MILL
                "Stomp" -> Flair.STOMP
                "Token" -> Flair.TOKEN
                "Control" -> Flair.CONTROL
                "Spellslinger" -> Flair.SPELLSLINGER
                "Big Mana" -> Flair.BIGMANA
                "Artifacts" -> Flair.ARTIFACTS
                "Tribal" -> Flair.TRIBAL
                "Cascade" -> Flair.CASCADE
                "Politics" -> Flair.POLITICS
                "Reanimator" -> Flair.REANIMATOR
                "Group Hug" -> Flair.GROUPHUG
                "Group Slug" -> Flair.GROUPSLUG
                "Lifegain" -> Flair.LIFEGAIN
                "Equipment" -> Flair.EQUIPMENT
                "Voltron" -> Flair.VOLTRON
                "Counters" -> Flair.COUNTERS
                "Landfall" -> Flair.LANDS
                "Enchantress" -> Flair.ENCHANTMENTS
                "Infect" -> Flair.INFECT
                "Madness" -> Flair.MADNESS
                "Cycling" -> Flair.CYCLE
                else -> Flair.NONE
            }
        }
    }
}

fun List<DeckEntity>.asDomainModel() : List<Deck> {
    return map {
        Deck(
            id = it.id,
            name = it.name,
            commander = it.commander,
            secondaryCommander = it.secondaryCommander,
            companion = it.companion,
            firstFlair = DeckEntity.getFlair(it.firstFlair),
            secondFlair = DeckEntity.getFlair(it.secondFlair),
            owner = it.owner,
            imgsrc = it.imgsrc,
            backgroundColor = it.backgroundColor
        )
    }
}
