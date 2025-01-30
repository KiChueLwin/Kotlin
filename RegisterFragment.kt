package com.example.navigationapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationapplication.databinding.FragmentLoginBinding
import com.example.navigationapplication.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentRegisterBinding.inflate(inflater,container,false)

        binding.txtLogin.setOnClickListener{

            val action= RegisterFragmentDirections.actionRegisterFragmentToLoginFragment()
            findNavController().navigate(action)

        } // btn go to Login

        return binding.root

    }




}// Register Fragment
