package com.example.kotln1.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.example.kotln1.Models.User
import com.example.kotln1.Models.database.DataBaseHelper
import com.example.kotln1.databinding.FragmentRegisterBinding
import com.example.kotln1.ui.fragments.RegisterFragmentDirections.Companion.actionRegisterToLogin
import com.example.kotln1.ui.fragments.RegisterFragmentDirections.Companion.actionRegisterToWelcomeScreen


class RegisterFragment : Fragment() {



    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        val view = binding.root

        val db = Room.databaseBuilder(binding.root.context, DataBaseHelper::class.java, "users").allowMainThreadQueries().build()

        val userDao = db.userDao()




        binding.agreeButton.setOnClickListener {

            val action = actionRegisterToLogin()
            findNavController().navigate(action)


        }

        binding.backButton.backButton.setOnClickListener {

            val action = actionRegisterToWelcomeScreen()
            findNavController().navigate(action)

        }

        binding.agreeButton.setOnClickListener {




            if(binding.username.text.toString().isEmpty() || binding.email.text.toString().isEmpty() || binding.password.text.toString().isEmpty() || binding.confirmPassword.text.toString().isEmpty()){

                Toast.makeText(binding.root.context, "Please fill all fields", Toast.LENGTH_SHORT).show()

            }
            else if( binding.password.text.toString().length < 8  ){

            Toast.makeText(binding.root.context, "Password must be at least 8 characters", Toast.LENGTH_SHORT).show()





            }

            else if (binding.password.text.toString() != binding.confirmPassword.text.toString()){

                Toast.makeText(binding.root.context, "Passwords do not match", Toast.LENGTH_SHORT).show()


            }

            else if (userDao.checkEmailExists(binding.email.text.toString())){



                Toast.makeText(binding.root.context, "Email Already Exists! Please Try Another", Toast.LENGTH_SHORT).show()

            }


            else{


                val user = User(binding.username.text.toString(), binding.email.text.toString(), binding.password.text.toString())

                userDao.insertAll(user)





                    Toast.makeText(binding.root.context, "Register Successful", Toast.LENGTH_SHORT)
                        .show()

                val action = actionRegisterToLogin()
                findNavController().navigate(action)

            }




        }














        return view
    }


}
