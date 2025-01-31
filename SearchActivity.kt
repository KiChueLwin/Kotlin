package com.example.firstapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstapplication.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySearchBinding

    private val studentNames = arrayOf("Mg Mg", "Aung Aung", "John", "Ki")

    private val studentEmails = arrayOf("mg@gmail.com","aung@gmail.com", "john@gmail.com","ki@gmail.com")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSearch.setOnClickListener{

            val name = binding.editTextName.text.toString()
            val email = binding.editTextEmail.text.toString()

            if(name in studentNames){
                showAlert("Found", "$name is found in student list.")
            }else{
                showAlert("Not Found", "$name is not found in student list.")
            }
            if(email in studentEmails){
                showAlert("Found", "$email is found in student list.")
            }else{
                showAlert("Not Found", "$email is not found in student list.")
            }



        } // btnSearch

        binding.btnClear.setOnClickListener{
            binding.editTextName.setText("")
            binding.editTextEmail.setText("")

        } // btnClear



    } // on create

    fun showAlert(title:String, msg:String){
        val alertDialog = AlertDialog.Builder(this)

        alertDialog.setTitle(title)
            .setMessage(msg)
            .setPositiveButton("OK"){ _,_ -> // do nothing

            }
            .show()
    } // show alert


} // search activity
