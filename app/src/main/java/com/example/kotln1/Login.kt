package com.example.kotln1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kotln1.databinding.FragmentLoginBinding
import com.example.kotln1.LoginDirections.Companion.actionLoginToForgotPassword
import com.example.kotln1.LoginDirections.Companion.actionLoginToArticleList
import com.example.kotln1.LoginDirections.Companion.actionLoginToWelcomeScreen

class Login : Fragment() {

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentLoginBinding.inflate(layoutInflater)
        val view = binding.root

        binding.forgotPass.setOnClickListener{

            val action = actionLoginToForgotPassword()
            findNavController().navigate(action)


        }

        binding.loginButton.setOnClickListener{

            val action = actionLoginToArticleList()
            findNavController().navigate(action)


        }

        binding.backButton.backButton.setOnClickListener{

         val action = actionLoginToWelcomeScreen()
         findNavController().navigate(action)

        }


return view
    }

}
