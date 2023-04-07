package com.example.fragmentmanagercommunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentResultListener


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentB.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentB : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val textview = view.findViewById<TextView>(R.id.textView2B)

        //val btn2= view.findViewById<Button>(R.id.)


        parentFragmentManager.setFragmentResultListener(
            "fragA", this
        ) { requestKey, result ->

            textview.text = result.getString("text")



        }
        return view

    }




}