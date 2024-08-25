package com.example.kotln1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kotln1.databinding.FragmentRegisterBinding
import com.example.kotln1.registerDirections.Companion.actionRegisterToLogin
import com.example.kotln1.registerDirections.Companion.actionRegisterToWelcomeScreen


class register : Fragment() {

        private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentRegisterBinding.inflate(layoutInflater)
        val view = binding.root

        binding.agreeButton.setOnClickListener{

            val action = actionRegisterToLogin()
            findNavController().navigate(action)


        }

        binding.backButton.backButton.setOnClickListener{

            val action = actionRegisterToWelcomeScreen()
            findNavController().navigate(action)

        }



        return view
    }



}