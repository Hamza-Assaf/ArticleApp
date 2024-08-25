package com.example.kotln1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotln1.databinding.ArticleCardBinding
import com.example.kotln1.ArticleListDirections.Companion.actionArticleListToArticleDetails
import java.util.ResourceBundle.getBundle

class ArticleAdapter(private var articleArrayList: List<Article>) :
    RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ArticleCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val article: Article = articleArrayList[position]
        holder.bind(article)


    }


    override fun getItemCount(): Int {

        return articleArrayList.size
    }

    class ViewHolder(private val itemBinding: ArticleCardBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {


        fun bind(article: Article) {
            itemBinding.articleTitle.text = article.getTitle()
            itemBinding.articleDescription.text = article.getDescription()
            Glide.with(itemBinding.articleImage.context).asBitmap().load(article.getUrlToImage())
                .into(itemBinding.articleImage)


            itemBinding.root.setOnClickListener(){



                val toItem = ArticleListDirections.actionArticleListToArticleDetails(article.getTitle(),article.getDescription(), article.getUrlToImage(),article.getUrl())
                findNavController(itemBinding.root).navigate(toItem)


            }

        }




            }


        }







