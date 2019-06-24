package com.example.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = setContentView(this, R.layout.activity_main)

        binding.contact = Contact("User", "user@gmail.com")
        binding.handler = EventHandler(this)
        binding.imageUrl = "https://media.wired.com/photos/5b899992404e112d2df1e94e/master/pass/trash2-01.jpg"
    }
}
