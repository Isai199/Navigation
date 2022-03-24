package com.navigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.navigation.databinding.FragmentHomeBinding




class HomeFragment : Fragment() {
    private lateinit var  binding: FragmentHomeBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //binding = FragmentHomeBinding.inflate(inflater, container,false)
        //
        binding = FragmentHomeBinding.inflate(layoutInflater)


        val navController = findNavController()





        binding.btnHomeToProfile.setOnClickListener{
            //Toast.makeText(context,"prueba",Toast.LENGTH_SHORT).show()
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            //val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome()

            val nombre = binding.etNombre.text.toString()
            val paterno = binding.etPaterno.text.toString()
            val materno = binding.etMaterno.text.toString()
            val usuario = binding.etUser.text.toString()
            val correo = binding.etCorreo.text.toString()

            //val myArray = arrayOf<String>(nombre,paterno,materno,usuario,correo)

            val user = User(nombre,paterno, materno,usuario,correo)


            var directions = HomeFragmentDirections.actionHomeFragmentToProfileFragment(user)

            navController.navigate(directions)
        }
        return binding.root
    }




}