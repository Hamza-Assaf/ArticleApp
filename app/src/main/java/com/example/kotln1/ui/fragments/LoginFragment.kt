package com.example.kotln1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.example.kotln1.Models.database.DataBaseHelper
import com.example.kotln1.databinding.FragmentLoginBinding
import com.example.kotln1.ui.fragments.LoginFragmentDirections.Companion.actionLoginToForgotPassword
import com.example.kotln1.ui.fragments.LoginFragmentDirections.Companion.actionLoginToArticleList
import com.example.kotln1.ui.fragments.LoginFragmentDirections.Companion.actionLoginToWelcomeScreen
import com.example.kotln1.ui.fragments.LoginFragmentDirections.Companion.actionLoginToRegister
class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        binding = FragmentLoginBinding.inflate(layoutInflater)
        val view = binding.root

        val db = Room.databaseBuilder(binding.root.context, DataBaseHelper::class.java, "users").allowMainThreadQueries().build()

        val userDao = db.userDao()
        binding.forgotPass.setOnClickListener{

            val action = actionLoginToForgotPassword()
            findNavController().navigate(action)


        }

        binding.loginButton.setOnClickListener{


            if(userDao.checkCredentials(binding.email.text.toString(), binding.password.text.toString())){

                Toast.makeText(binding.root.context, "Login Successful", Toast.LENGTH_SHORT).show()

                val action = actionLoginToArticleList(binding.email.text.toString())
                findNavController().navigate(action)

            }

            else if(binding.email.text.toString().isEmpty() || binding.password.text.toString().isEmpty()){

                Toast.makeText(binding.root.context, "Please fill all fields", Toast.LENGTH_SHORT).show()

        }
            else{

                Toast.makeText(binding.root.context, "Wrong Email or Password", Toast.LENGTH_SHORT).show()

            }









        }

        binding.backButton.backButton.setOnClickListener{

         val action = actionLoginToWelcomeScreen()
         findNavController().navigate(action)

        }
        binding.registerNow.setOnClickListener{
            val action = actionLoginToRegister()
            findNavController().navigate(action)
        }


return view
    }

}
