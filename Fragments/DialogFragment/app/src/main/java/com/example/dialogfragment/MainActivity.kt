package com.example.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//        val btn =findViewById<Button>(R.id.button)
//
//        btn.setOnClickListener{
//
//        }

    }

    fun showAlertDialog(view: View) {
        //Toast.makeText(this,"hghx",Toast.LENGTH_SHORT).show()
        MaterialAlertDialogBuilder(this)
            .setTitle("Alert")
            .setMessage("Do you want update now")
            .setNeutralButton("Remind me Later") { dialog , which  ->
                Snackbar.make(view, "Remind me Later is clicked", Snackbar.LENGTH_LONG).show();
            }
            .setPositiveButton("Yes"){dialog,which->
                Snackbar.make(view, "Yes is clicked", Snackbar.LENGTH_LONG).show();
            }
            .setNegativeButton("No"){dialog,which->
                Snackbar.make(view, "No is clicked", Snackbar.LENGTH_LONG).show();
            }
            .show()
    }

}