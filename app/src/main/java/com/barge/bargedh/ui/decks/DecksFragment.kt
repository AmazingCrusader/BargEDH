package com.barge.bargedh.ui.decks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import com.barge.bargedh.R
import com.barge.bargedh.databinding.FragmentDecksBinding

class DecksFragment : Fragment() {

    private lateinit var binding: FragmentDecksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_decks, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addDeckFab.setOnClickListener {
            NavHostFragment.findNavController(this)
                .navigate(R.id.action_decksFragment_to_deckCreationFragment)
        }
    }
}