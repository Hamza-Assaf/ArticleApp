package com.example.kotln1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.widget.Toast
import com.example.kotln1.databinding.FragmentWebActivityBinding


class WebActivity : Fragment() {


    private lateinit var binding : FragmentWebActivityBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentWebActivityBinding.inflate(layoutInflater)






            binding.webView.loadUrl( arguments?.getString("url").toString())
            val webSettings: WebSettings = binding.webView.getSettings()
            binding.webView.settings.javaScriptEnabled = true





        return binding.root
    }
}
