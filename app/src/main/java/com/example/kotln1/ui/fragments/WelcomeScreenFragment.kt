package com.example.kotln1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kotln1.databinding.FragmentWelcomeScreenBinding
import com.example.kotln1.ui.fragments.WelcomeScreenFragmentDirections.Companion.actionGotoLogin
import com.example.kotln1.ui.fragments.WelcomeScreenFragmentDirections.Companion.actionGotoRegister



class WelcomeScreenFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeScreenBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        binding = FragmentWelcomeScreenBinding.inflate(layoutInflater)
       val view = binding.root
       binding.loginPageButton.setOnClickListener {

           val action = actionGotoLogin()
           findNavController().navigate(action)
       }

        binding.registerButton.setOnClickListener{
            val action = actionGotoRegister()
           findNavController().navigate(action)

    }
        return view
    }


}