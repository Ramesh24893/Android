package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var itemsAdapter: FootItemsAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var btn: Button

    private val listener=object: ViewPager2.OnPageChangeCallback() {

        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)

            if(position == itemsAdapter.itemCount-1)
                btn.text="Finish"
            else{
                btn.text="Next"
                btn.setOnClickListener {
                    viewPager.currentItem=position+1
                }
            }
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         viewPager=findViewById<ViewPager2>(R.id.viewPager2)

        btn=findViewById<Button>(R.id.btn)

         var items = ArrayList<Items>()
        val imageArray= arrayOf(R.drawable.a,
            R.drawable.b,
            R.drawable.c,R.drawable.d,
            R.drawable.e)
        val heading= arrayOf("Baked","Grilled","Dessert","Italian","Shakes")
        val descArray= arrayOf(R.string.a_desc,R.string.b_desc,
            R.string.c_desc,R.string.d_desc,
            R.string.e_desc,)
        for (i in heading.indices){
            items.add(Items(imageArray[i], heading[i],getString(descArray[i])))
        }
       itemsAdapter= FootItemsAdapter(items)

        viewPager.adapter=itemsAdapter
        viewPager.registerOnPageChangeCallback(listener)





        viewPager.orientation=ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.offscreenPageLimit=2
        viewPager.beginFakeDrag()
        //viewPager.fakeDragBy(-100f)
        Log.e("TAG","${viewPager.isFakeDragging}")
        Log.e("TAG","${viewPager.isUserInputEnabled}")
        viewPager.endFakeDrag()
        Log.e("TAG","${viewPager.adapter}")
        Log.e("TAG","${viewPager.orientation}")
        Log.e("TAG","${viewPager.currentItem}")
        Log.e("TAG","${viewPager.offscreenPageLimit}")

    }

    override fun onDestroy() {
        viewPager.unregisterOnPageChangeCallback(listener)
        super.onDestroy()

    }
}