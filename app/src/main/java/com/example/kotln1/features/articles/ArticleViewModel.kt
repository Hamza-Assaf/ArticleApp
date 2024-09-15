package com.example.kotln1.features.articles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotln1.model.ArticleRemoteModel
import com.example.kotln1.repository.ArticleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ArticleViewModel @Inject constructor(private val repository: ArticleRepository) : ViewModel() {



   private  val _articlesLiveData: MutableLiveData<List<ArticleRemoteModel>> = MutableLiveData()
    val articlesLiveData: LiveData<List<ArticleRemoteModel>> = _articlesLiveData


    init{
        getArticles()

    }
     private fun getArticles() {

        viewModelScope.launch {
            _articlesLiveData.postValue(repository.getArticle().articles)

        }

    }

}