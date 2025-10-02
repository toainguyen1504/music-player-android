package com.example.musicplayerandroid.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.musicplayerandroid.R
import com.example.musicplayerandroid.ui.theme.SplashScreen

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreen (
                onStartClick = {
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()
                }
            )
        }
    }
}