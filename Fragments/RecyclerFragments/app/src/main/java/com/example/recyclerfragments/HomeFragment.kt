package com.example.recyclerfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    val msg= javaClass
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var newsList: ArrayList<News>


    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var news : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG","onCreate       $msg")
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("TAG","onCreateVIEW       $msg")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.e("TAG","on View Created      $msg")
        super.onViewCreated(view, savedInstanceState)


        dataInitialisation()
        val layoutManager= LinearLayoutManager(context)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = MyAdapter2(newsList)
        adapter.setOnItemClickListener(object : MyAdapter2.onItemClickListener{
            override fun onClick(position: Int) {
                Toast.makeText(context,"The position ${position+1} is clicked", Toast.LENGTH_SHORT).show()
            }

        })
        recyclerView.adapter= adapter
        recyclerView.layoutManager=layoutManager
        recyclerView.setHasFixedSize(true)
        var itemDec= DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
        itemDec.setDrawable(activity?.getDrawable(R.drawable.divider)!!)
        recyclerView.addItemDecoration(itemDec)

    }
    override fun onAttach(context: Context) {
        Log.e("TAG","onAttac       $msg")
        super.onAttach(context)
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

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    private fun dataInitialisation(){
        newsList = arrayListOf <News>()

        imageId= arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
        )

        heading= arrayOf(
            getString(R.string.head_1),
                    getString(R.string.head_2),
            getString(R.string.head_3),
            getString(R.string.head_4),
            getString(R.string.head_5),
            getString(R.string.head_6),
            getString(R.string.head_7),
            getString(R.string.head_8),
            getString(R.string.head_9),
            getString(R.string.head_10),
        )
        news= arrayOf(
            getString(R.string.news_a),
            getString(R.string.news_b),
        )
        for(i in imageId.indices){
            val news = News(imageId[i],heading[i])
            newsList.add(news)
        }
    }
}