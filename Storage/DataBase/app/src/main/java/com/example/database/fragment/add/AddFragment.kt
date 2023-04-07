package com.example.database.fragment.add

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.database.R
import com.example.database.data.User
import com.example.database.data.UserRepository
import com.example.database.data.UserViewModel


class AddFragment : Fragment() {

    private lateinit var mUserViewModel : UserViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_add, container, false)
        mUserViewModel = ViewModelProvider(this)[UserViewModel::class.java]
        view.findViewById<Button>(R.id.btAdd).setOnClickListener{
            insertDataToDataBase(view)
        }
        return view
    }

    private fun insertDataToDataBase(view : View) {
        val firstName = view.findViewById<EditText>(R.id.etFirstName).text.toString()
        val lastName = view.findViewById<EditText>(R.id.etLastName).text.toString()
        val age = view.findViewById<EditText>(R.id.etAge).text.toString()

        if(inputCheck(firstName, lastName, age)){
            val user= User(0,firstName,lastName,Integer.parseInt(age))
            mUserViewModel.addUser(user)
            Toast.makeText(context,"SUCCESSFULLY ADDED",Toast.LENGTH_LONG).show()

            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        }
    }

    private fun inputCheck(firstName : String, lastName: String, age : String): Boolean{
        return !(TextUtils.isEmpty(firstName) && TextUtils.isEmpty(lastName) && TextUtils.isEmpty(age))
    }


}