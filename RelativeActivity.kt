package com.example.firstapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstapplication.databinding.ActivityNextBinding
import com.example.firstapplication.databinding.ActivityRelativeBinding

class RelativeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRelativeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding= ActivityRelativeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRelativeSubmit.setOnClickListener{
            intent = Intent(this,ImageActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
