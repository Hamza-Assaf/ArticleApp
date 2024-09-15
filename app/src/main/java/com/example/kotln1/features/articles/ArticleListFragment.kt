package com.example.kotln1.features.articles


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.example.kotlin1.databinding.FragmentArticleListBinding
import com.example.kotln1.database.DataBaseHelper
import com.example.kotln1.features.articles.ArticleListFragmentDirections.Companion.actionListToLogin
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class ArticleListFragment  : Fragment() {

    private lateinit var binding: FragmentArticleListBinding
    private val viewModel: ArticleViewModel by viewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {



        binding = FragmentArticleListBinding.inflate(layoutInflater)



        val db = Room.databaseBuilder(binding.root.context, DataBaseHelper::class.java, "users").allowMainThreadQueries().build()
        val userDao = db.userDao()
        val email = arguments?.getString("Email")

        if (email != null) binding.welcomeText.text = "Welcome " + userDao.findUserByEmail(email).userName
        binding.backButton.backButton.setOnClickListener {

            val action = actionListToLogin()
            findNavController().navigate(action)

        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            viewModel.articlesLiveData.observe(viewLifecycleOwner) { response ->

                Toast.makeText(binding.root.context, response.toString(), Toast.LENGTH_LONG).show()

            }
        }

        catch (e: Exception) {

            Toast.makeText(binding.root.context, e.message, Toast.LENGTH_LONG).show()


        }

    }
}











