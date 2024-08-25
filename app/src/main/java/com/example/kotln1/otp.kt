package com.example.kotln1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kotln1.databinding.FragmentOtpBinding
import com.example.kotln1.otpDirections.Companion.actionOtp2ToForgotPassword
import com.example.kotln1.otpDirections.Companion.actionOtp2ToNewPass


class otp : Fragment() {

    private lateinit var binding: FragmentOtpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentOtpBinding.inflate(layoutInflater)
        val view = binding.root

        binding.verifyButton.setOnClickListener{

            val action = actionOtp2ToNewPass()
            findNavController().navigate(action)

        }
        binding.backButton.backButton.setOnClickListener{

            val action = actionOtp2ToForgotPassword()
            findNavController().navigate(action)

        }


        return view
    }


    }
