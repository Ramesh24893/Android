package com.example.fragmentcommunicator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentB : Fragment() {

    var displayMessage : String? =""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_b, container, false)
        displayMessage = arguments?.getString("message")
        view.findViewById<TextView>(R.id.tvfragB).text = displayMessage

        return view
    }


}