package com.barge.bargedh.model

//TODO aggiungere classe statistiche
//TODO classe Identity
//TODO magari fare classe commander con effetto, colori, flavour, link al ruling ecc. e fare che l'identity del deck siano un'unione dell'identity dei due comandanti eventuali

data class Deck(
    val id: Long,
    val name: String = "",
    val commander: String = "",
    val secondaryCommander: String?,
    val companion: String = "",
    val firstFlair: DeckEntity.Flair = DeckEntity.Flair.NONE,
    val secondFlair: DeckEntity.Flair = DeckEntity.Flair.NONE,
    val owner: String = "",
    val imgsrc: String = "",
    val backgroundColor: String = ""
)
