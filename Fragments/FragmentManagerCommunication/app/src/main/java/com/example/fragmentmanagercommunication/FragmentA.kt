package com.example.fragmentmanagercommunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class FragmentA : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_a, container, false)
        val btnA= view.findViewById<Button>(R.id.buttonA)
        val textView = view.findViewById<EditText>(R.id.textView3A)
        btnA.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("text",textView.text.toString())
            parentFragmentManager.setFragmentResult("fragA",bundle)

        }



        return view
    }


}