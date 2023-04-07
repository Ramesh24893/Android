package com.example.playstore.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.playstore.Activity.AppActivity

import com.example.playstore.Models.AppsChartModel
import com.example.playstore.R
import com.example.playstore.TopChartsAdapter

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentTwo.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentTwo : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerFrag2)
        val list =AppsChartModel.getData()
        val adap = TopChartsAdapter(list)
        val manager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        recyclerView.apply {
            adapter=adap
            layoutManager= manager
        }
        adap.setOnIteClickListener(object : TopChartsAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                //Toast.makeText(activity, "HElloo", Toast.LENGTH_SHORT).show()
                val appClicked=list[position]

                val intent = Intent(activity, AppActivity::class.java)
                intent.putExtra("appName",appClicked.appName)
                intent.putExtra("appImage",appClicked.image)
                intent.putExtra("appRating",appClicked.rating)

                activity?.startActivity(intent)
            }

        })
    }



}