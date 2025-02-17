package com.example.kotln1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kotln1.databinding.FragmentForgotPassBinding
import com.example.kotln1.forgotPassDirections.Companion.actionForgotPasswordToLogin
import com.example.kotln1.forgotPassDirections.Companion.actionForgotPasswordToOtp2


class forgotPass : Fragment() {

        private lateinit var binding: FragmentForgotPassBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentForgotPassBinding.inflate(layoutInflater)
        val view = binding.root

        binding.forgotButton.setOnClickListener{

            val action = actionForgotPasswordToOtp2()
            findNavController().navigate(action)



        }
        binding.backButton.backButton.setOnClickListener{

            val action = actionForgotPasswordToLogin()
            findNavController().navigate(action)

        }


        return view
    }


}