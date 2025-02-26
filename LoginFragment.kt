package com.example.navigationapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationapplication.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentLoginBinding.inflate(inflater,container,false)

        binding.txtRegister.setOnClickListener{

            val action= LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            findNavController().navigate(action)

        } // btn go to gister





        return binding.root
    }


}
