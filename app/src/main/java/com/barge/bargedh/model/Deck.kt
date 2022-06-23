package com.barge.bargedh.model

//TODO aggiungere classe dati
//TODO classe Identity
//TODO magari fare classe commander con effetto, colori, flavour, link al ruling ecc. e fare che l'identity del deck siano un'unione dell'identity dei due comandanti eventuali

data class Deck(
    val name: String = "",
    val commander: String = "",
    val secondaryCommander: String?,
    val companion: String = "",
    val firstFlair: Flair = Flair.NONE,
    val secondFlair: Flair = Flair.NONE,
    val owner: String = "",
    val imgsrc: String = "",
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
}
