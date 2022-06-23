package com.barge.bargedh.ui.decks

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CompoundButton
import androidx.databinding.DataBindingUtil
import com.barge.bargedh.R
import com.barge.bargedh.databinding.FragmentDeckCreationBinding

class DeckCreationFragment : Fragment() {

    private lateinit var binding: FragmentDeckCreationBinding

    private lateinit var viewModel: DeckCreationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_deck_creation, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        switchesSetup()
        flairSpinnersSetup()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DeckCreationViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun flairSpinnersSetup() {

        // Main flair spinner setup
        val spinner = binding.mainFlairSpinner
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.flairs_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        // Secondary flair spinner setup
        val spinnerTwo = binding.secondaryFlairSpinner
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.flairs_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnerTwo.adapter = adapter
        }
    }

    private fun switchesSetup() {

        // Partner commander switch setup
        val partnerSwitch = binding.secondCommanderSwitch
        partnerSwitch.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { _, isChecked ->
                if(isChecked)
                    binding.secondCommanderLayout.visibility = View.VISIBLE
                else
                    binding.secondCommanderLayout.visibility = View.GONE
            }
        )

        // Companion switch setup
        val companionSwitch = binding.companionSwitch
        companionSwitch.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { _, isChecked ->
            if(isChecked)
                binding.companionLayout.visibility = View.VISIBLE
            else
                binding.companionLayout.visibility = View.GONE
        }
        )
    }

}