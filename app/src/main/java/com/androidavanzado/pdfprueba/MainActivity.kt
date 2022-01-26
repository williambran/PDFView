package com.androidavanzado.pdfprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.settings.setSupportZoom(true)
        webView.settings.javaScriptEnabled = true
        val url = "https://github.github.com/training-kit/downloads/github-git-cheat-sheet.pdf"
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=$url")
//        webView.loadUrl("https://docs.google.com/document/d/1LR3sVmyMt-wOLu26NLom24lkWtw4fvG9/edit")

    }
}
