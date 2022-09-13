package com.barge.bargedh.ui.lifecounter

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.barge.bargedh.R

class LifeCounterFragment : Fragment() {

    companion object {
        fun newInstance() = LifeCounterFragment()
    }

    private lateinit var viewModel: LifeCounterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_life_counter_four, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LifeCounterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}