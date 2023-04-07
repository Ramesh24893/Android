package com.example.fragmentcommunicator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentA.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentA : Fragment() {

    private lateinit var communicator: Communicator


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_a, container, false)
//        communicator = activity as Communicator
//
//        view.findViewById<Button>(R.id.button).setOnClickListener{
//            communicator.passDataCom(view.findViewById<EditText>(R.id.tvfragA).text.toString())
//        }
//        return view
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        communicator = activity as Communicator

        view.findViewById<Button>(R.id.button).setOnClickListener{
            communicator.passDataCom(view.findViewById<EditText>(R.id.tvfragA).text.toString())
        }
    }

}