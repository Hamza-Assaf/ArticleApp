package com.example.kotln1.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kotln1.databinding.FragmentNewPassBinding
import com.example.kotln1.ui.fragments.NewPasswordFragmentDirections.Companion.actionNewPassToOtp2
import com.example.kotln1.ui.fragments.NewPasswordFragmentDirections.Companion.actionNewPassToPassChanged

class NewPasswordFragment : Fragment() {

        private lateinit var binding : FragmentNewPassBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentNewPassBinding.inflate(layoutInflater)
        val view = binding.root

        binding.resetButton.setOnClickListener{

            val action = actionNewPassToPassChanged()
            findNavController().navigate(action)

        }

        binding.backButton.backButton.setOnClickListener{

            val action = actionNewPassToOtp2()
            findNavController().navigate(action)

        }


        return view
    }


}