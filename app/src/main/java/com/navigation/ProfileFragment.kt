package com.navigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.navigation.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {



    private lateinit var binding: FragmentProfileBinding
    // get the arguments from the Registration fragment
    private val args : ProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentProfileBinding.inflate(layoutInflater)

        //val argumentoRecibido = arguments?.getStringArray("arrayArgument")
        //Log.i("Problema", argumentoRecibido.toString())

        // Receive the arguments in a variable
        val userDetails = args.user


        binding.tvNombre.setText(userDetails.nombre)
        binding.tvPaterno.setText(userDetails.paterno)
        binding.tvMaterno.setText(userDetails.materno)
        binding.tvUser.setText(userDetails.usuario)
        binding.tvCorreo.setText(userDetails.correo)


        return binding.root
    }


}