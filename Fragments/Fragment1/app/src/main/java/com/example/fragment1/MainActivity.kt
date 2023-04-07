package com.example.fragment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    val clasName ="MAIN ACTIVITY"
    lateinit var btn1 : Button
    lateinit var btn2 : Button

    val fragmentManager=supportFragmentManager
    var count=0

    fun Replace(view: View) {
        fragmentManager.beginTransaction().apply {

            remove(fragment1())
            //add(fragment2(),"hi")
            addToBackStack("Remove")
            commit()
        }
    }
    fun PopBackStack(view: View) {
        fragmentManager.popBackStack("Remove",1)
    }
    fun fragmentOneClicked(view: View) {
        val firstFragment=fragment1()
        Log.d("TAG","Fragment one clicked   $clasName")
        fragmentManager.beginTransaction().apply {

            add(R.id.frame_layout1,firstFragment)
            //add(fragment2(),"hi")
            addToBackStack("First $count")
            commit()
        }
    }
    fun fragmentTwoClicked(view: View) {
        fragmentManager.beginTransaction().apply {
           // replace(R.id.frame_layout,fragment2())

            add(R.id.frame_layout2,fragment2())
            addToBackStack("Second $count ")
            commit()
        }

    }
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onPause() {
        Log.e("TAG","onPause   $clasName")
        super.onPause()
    }


    override fun onResumeFragments() {
        Log.e("TAG","onResumeFragments   $clasName")
        super.onResumeFragments()
    }
    override fun onStart() {
        Log.e("TAG","onStart   $clasName")
        super.onStart()
    }

    override fun onStop() {
        Log.e("TAG","onStop    $clasName")
        super.onStop()
    }

    override fun onResume() {
        Log.e("TAG","onResume   $clasName")
        super.onResume()
    }

    override fun onRestart() {
        Log.e("TAG","onRestart   $clasName")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.e("TAG","OnDestroy    $clasName")
        super.onDestroy()
    }

    override fun onDetachedFromWindow() {
        Log.e("TAG","onDetachedFromWindow    $clasName")
        super.onDetachedFromWindow()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG","onCreate    $clasName")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager.addOnBackStackChangedListener {
            for(i in 0 until fragmentManager.backStackEntryCount){
                Log.e("TAG", "'FRAGMENT  '${fragmentManager.getBackStackEntryAt(i).name.toString()}")
            }
        }
//        btn1=findViewById(R.id.btn1)
//        btn2=findViewById(R.id.btn2)

        val firstFragment=fragment1()
//        Log.e("TAG","  ${fragment1().activity}")
        val secondFragment=fragment2()
        supportFragmentManager.beginTransaction().apply {
            add(R.id.frame_layout1,firstFragment)
            commit()
        }


//        btn1.setOnClickListener{
//            supportFragmentManager.beginTransaction().apply {
//                //add(fragment1(),"hi")
//
//
//                    replace(R.id.frame_layout,firstFragment)
//                //replace<fragment1>(R.id.frame_layout)
//
//                    addToBackStack(null)
//                commit()
//            }
//
//
//        }
//        btn2.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//
//               replace(R.id.frame_layout,secondFragment)
//                //add(fragment2(),"hi")
//                addToBackStack(null)
//                commit()
//            }
//
//
//        }
    }




}