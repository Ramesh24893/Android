package com.example.customdialogfragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class CustomDialogFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("TAG","                onCreateView ")
        val rootView=inflater.inflate(R.layout.rater_dialog_fragment,container,false)


return rootView
    }

    override fun onResume() {
        Log.e("TAG","                onResume")
        super.onResume()
    }


    override fun onViewCreated(rootView: View, savedInstanceState: Bundle?) {
        Log.e("TAG","                onViewCreated ")
        super.onViewCreated(rootView, savedInstanceState)
        val submitBtn=rootView.findViewById<Button>(R.id.submit_button)
        val radioGroup = rootView.findViewById<RadioGroup>(R.id.radioGroup)

        var radio : RadioButton? =null
        submitBtn.isEnabled=false

        radioGroup.setOnCheckedChangeListener {group,checkedId ->
            // Log.e("TAG","                   radioGroup.setOnClickListener ")
            submitBtn.isEnabled = true
            radio = rootView.findViewById(checkedId)

        }



        submitBtn.setOnClickListener{
            var ratingResult = radio?.text.toString()

            Toast.makeText(activity,"You rated $ratingResult",Toast.LENGTH_LONG).show()

            //startActivity(Intent(activity,NewActivity::class.java))
            dismiss()
        }
        rootView.findViewById<Button>(R.id.cancel_button).setOnClickListener{
            dismiss()
        }

    }

//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
//        AlertDialog.Builder(requireContext())
//            .setMessage("Do you need to proceed")
//            .setPositiveButton("Yes") { _,_ ->
//
//                startActivity(Intent(activity,NewActivity::class.java))
//            }
//            .create()

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        Log.e("TAG","                       onDismiss ")
    }

    override fun show(manager: FragmentManager, tag: String?) {
        Log.e("TAG","                show1")
        super.show(manager, tag)
    }

    override fun show(transaction: FragmentTransaction, tag: String?): Int {
        Log.e("TAG","                show2 ")
        return super.show(transaction, tag)
    }

    override fun toString(): String {
        return super<DialogFragment>.toString()
    }

    override fun onGetLayoutInflater(savedInstanceState: Bundle?): LayoutInflater {
        return super.onGetLayoutInflater(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        Log.e("TAG","               onAttach ")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG","               onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.e("TAG","                onStart ")
        super.onStart()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        Log.e("TAG","                onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("TAG","                onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.e("TAG","                onDetach")
        super.onDetach()
    }


    override fun onCancel(dialog: DialogInterface) {
        Log.e("TAG","               onCancel")
        super.onCancel(dialog)
    }

    override fun setStyle(style: Int, theme: Int) {
        super.setStyle(style, theme)
    }

    override fun showNow(manager: FragmentManager, tag: String?) {
        super.showNow(manager, tag)
    }

    override fun dismiss() {
        Log.e("TAG","                dismiss ")
        super.dismiss()
    }

    override fun dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss()
    }


    override fun getDialog(): Dialog? {
        return super.getDialog()
    }

    override fun getTheme(): Int {
        return super.getTheme()
    }

    override fun setCancelable(cancelable: Boolean) {
        super.setCancelable(cancelable)
    }

    override fun isCancelable(): Boolean {
        return super.isCancelable()
    }

    override fun setShowsDialog(showsDialog: Boolean) {
        super.setShowsDialog(showsDialog)
    }

    override fun getShowsDialog(): Boolean {
        return super.getShowsDialog()
    }



}