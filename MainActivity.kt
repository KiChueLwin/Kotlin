package com.example.firstapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstapplication.databinding.ActivityMainBinding
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding  //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        //val txtDesc = findViewById<TextView>(R.id.txtDesc)

        var msg = "Hello my name is Ki."  // declaring variable


        binding.txtDesc.text = msg

        binding.txtDesc.setOnClickListener(){
            msg= "Good Morning!"
            binding.txtDesc.text = msg

            binding.txtDesc.setTextColor(Color.BLACK)

            Toast.makeText(this,"Clicked Textview",Toast.LENGTH_LONG).show() // message box

            Log.i("my Log","Clicked TextView on description!")  // view as log/activity in logcat
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }// Clicklistener

        binding.btnOK.setOnClickListener{
            Toast.makeText(this, "Button OK is clicked!", Toast.LENGTH_LONG).show()
            Log.i("My Log", "Button OK is clicked!")
            test()

            intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
            finish() // kill this


        }//ClickListener

    }// on create

    fun test(){
        binding.txtDesc.text = "Hello"
        binding.txtDesc.text = "Texting"
    }// test function


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main_menu,menu)

        return super.onCreateOptionsMenu(menu)
    } // option_menu

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.item_search -> {
                // search action
                intent =Intent(this,SearchActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.item_list -> {
                // list action
                Toast.makeText(this, "Selected item list", Toast.LENGTH_LONG).show()
            }

            R.id.item_setting -> {
                // setting action
                Toast.makeText(this, "Selected item setting", Toast.LENGTH_LONG).show()
            }

            R.id.item_exit -> {
                // exit action
                exitProcess(-1)

            }// when


        }
        return super.onOptionsItemSelected(item)
    }


}// MainActivity
