package com.example.kotln1.ui.fragments


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotln1.api.APIInterface
import com.example.kotln1.api.ApiClient
import com.example.kotln1.data.Article
import com.example.kotln1.adapters.ArticleAdapter
import com.example.kotln1.data.ResponseModel
import com.example.kotln1.databinding.FragmentArticleListBinding
import com.example.kotln1.ui.fragments.ArticleListFragmentDirections.Companion.actionListToLogin
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ArticleListFragment : Fragment() {


    private val apiKey: String = "f391df4c366b4be0b0a7e303c92bd5c4"
    private lateinit var binding: FragmentArticleListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {


        binding = FragmentArticleListBinding.inflate(layoutInflater)

        val apiService: APIInterface = ApiClient().getClient().create(APIInterface::class.java)
        val call: Call<ResponseModel> = apiService.getLatestNews("techcrunch", apiKey)
        call.enqueue(object : Callback<ResponseModel> {
            override fun onResponse(call: Call<ResponseModel>, response: Response<ResponseModel>) {
                if (response.body()?.getStatus().equals("ok")) {

                    val list: List<Article> = response.body()!!.getArticles()


                    if (list.isNotEmpty()) {
                        val layoutManager =
                            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                        binding.movieRv.layoutManager = layoutManager
                        val adapter = ArticleAdapter(list)
                            binding.movieRv.adapter = adapter



                    }
                } else {

                    Toast.makeText(
                        context,
                        " ${response.code()} ${response.message()} ${response.errorBody()}",
                        Toast.LENGTH_LONG
                    ).show()
                }


            }

            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                Log.e("error", t.message.toString())
            }
        })

        binding.backButton.backButton.setOnClickListener {

            val action = actionListToLogin()
            findNavController().navigate(action)

        }


















        return binding.root
    }




}











