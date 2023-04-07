package com.example.tab

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentFirst.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentFirst : Fragment() {
    val msg= javaClass
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG","onCreate       $msg")
        arguments?.let {


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("TAG","onCreate View       $msg")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentFirst().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    override fun onAttach(context: Context) {
        Log.e("TAG","onAttac       $msg")
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.e("TAG","onView Created       $msg")
        super.onViewCreated(view, savedInstanceState)
    }



    override fun onStart() {
        Log.e("TAG","onStart       $msg")
        super.onStart()
    }

    override fun onResume() {
        Log.e("TAG","onResume      $msg")
        super.onResume()
    }

    override fun onPause() {
        Log.e("TAG","onPause      $msg")
        super.onPause()
    }

    override fun onStop() {
        Log.e("TAG","onStop      $msg")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("TAG","onDestroyView       $msg")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("TAG","onDestroy       $msg")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("TAG","onDetach       $msg")
        super.onDetach()
    }






    override fun getLifecycle(): Lifecycle {

        return super.getLifecycle()
    }

    override fun startActivity(intent: Intent?) {
        Log.e("TAG","startActivity       $msg")
        super.startActivity(intent)
    }

    override fun startActivity(intent: Intent?, options: Bundle?) {
        Log.e("TAG","startActivity 2       $msg")
        super.startActivity(intent, options)
    }

}