package com.barge.bargedh.ui.lifecounter

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.get
import com.barge.bargedh.R
import com.barge.bargedh.databinding.FragmentLifeCounterFourBinding

class LifeCounterFragment : Fragment() {

    private lateinit var binding: FragmentLifeCounterFourBinding
    private lateinit var viewModel: LifeCounterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_life_counter_four, container, false)
        viewModel = ViewModelProvider(this).get(LifeCounterViewModel::class.java)

        setLayouts()

        return binding.root
    }

    private fun setLayouts() {
        setFirstPlayerLayout()
    }

    private fun setFirstPlayerLayout() {
        binding.firstPlayer.decreaseButton.setOnClickListener {
            viewModel.decreaseLifePlayer1()
            binding.firstPlayer.lifeCounterText.text = viewModel.lifePlayer1.toString()
        }
    }

}