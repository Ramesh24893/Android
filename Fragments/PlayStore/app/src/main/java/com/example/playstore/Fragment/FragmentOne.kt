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

import com.example.playstore.AppsAdapter
import com.example.playstore.Models.AppsModel
import com.example.playstore.R

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentOne : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

  

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val recyclerView1 =view.findViewById<RecyclerView>(R.id.recycler1)

        val layManager1= LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val layManager2= LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val layManager3= LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val layManager4= LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        val recyclerView2 =view.findViewById<RecyclerView>(R.id.recycler2)
        val recyclerView3 =view.findViewById<RecyclerView>(R.id.recycler3)
        val recyclerView4 =view.findViewById<RecyclerView>(R.id.recycler4)

        val list =AppsModel.getData()

        val ada= AppsAdapter(list)
        ada.setOnIteClickListener(object : AppsAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val appClicked=list[position]

                val intent = Intent(activity,AppActivity::class.java)
                intent.putExtra("appName",appClicked.appName)
                intent.putExtra("appImage",appClicked.appImage)
                intent.putExtra("appRating",appClicked.appRating)

                activity?.startActivity(intent)

                // Toast.makeText(activity, "HElloo   $position", Toast.LENGTH_SHORT).show()
//                val bundle = Bundle()
//                bundle.putString("appName",appClicked.appName)
//                bundle.putInt("appImage",appClicked.appImage)
//                bundle.putFloat("appRating",appClicked.appRating)
//                parentFragmentManager.setFragmentResult("fragA",bundle)
            }

        })


        recyclerView1.apply {
            adapter=ada
            layoutManager=layManager1
            setHasFixedSize(true)
        }

        recyclerView2.apply {
            adapter=ada
            layoutManager=layManager2
            setHasFixedSize(true)
        }
        recyclerView3.apply {
            adapter=ada
            layoutManager=layManager3
            setHasFixedSize(true)
        }
        recyclerView4.apply {
            adapter=ada
            layoutManager=layManager4
            setHasFixedSize(true)
        }
    }

}