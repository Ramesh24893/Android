package com.example.orderburger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.RadioButton
import com.example.orderburger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btOrder.setOnClickListener {
            val checkedMeatRadioButtonId=binding.rgMeat.checkedRadioButtonId
            val meat=findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese=binding.cbCheese.isChecked
            val onion=binding.cbOnion.isChecked
            val salad=binding.checkBox3.isChecked
            val orderedMessage="You ordered a burger with\n" +
                    "${meat.text}" +
                    (if(cheese) "\nCheese" else "")+
            (if(onion) "\nOnion" else "")+
                    (if(salad) "\nSalad" else "")

            binding.tvMessage.text=orderedMessage
        }
    }
}