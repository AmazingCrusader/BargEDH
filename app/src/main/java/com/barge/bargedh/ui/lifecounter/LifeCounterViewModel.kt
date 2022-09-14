package com.barge.bargedh.ui.lifecounter

import androidx.lifecycle.ViewModel

class LifeCounterViewModel : ViewModel() {

    var lifePlayer1: Int = 40
    var lifePlayer2: Int = 40
    var lifePlayer3: Int = 40
    var lifePlayer4: Int = 40

    fun decreaseLifePlayer1() {
        lifePlayer1--
    }
}