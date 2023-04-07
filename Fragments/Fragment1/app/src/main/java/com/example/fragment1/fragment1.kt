package com.example.fragment1

import android.animation.Animator
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.IntentSender
import android.content.res.Configuration
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.view.animation.Animation
import androidx.core.app.SharedElementCallback
import androidx.fragment.app.FragmentContainer
import androidx.lifecycle.*
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.loader.app.LoaderManager
import java.io.FileDescriptor
import java.io.PrintWriter
import java.util.ArrayList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment1 : Fragment() {
    val msg="          FRAGMENT CLASS1"
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        return inflater.inflate(R.layout.fragment_fragment1, container, false)
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









    override fun onGetLayoutInflater(savedInstanceState: Bundle?): LayoutInflater {
        Log.e("TAG"," onGetLayoutInflater       $msg")
        return super.onGetLayoutInflater(savedInstanceState)
    }



    override fun onInflate(context: Context, attrs: AttributeSet, savedInstanceState: Bundle?) {
        Log.e("TAG"," onInflate      $msg")
        super.onInflate(context, attrs, savedInstanceState)
    }

    override fun getContext(): Context? {
        Log.e("TAG","getContext       $msg")
        return super.getContext()
    }

//    override fun onAttach(activity: Activity) {
//        super.onAttach(activity)
//    }
//
//    override fun onInflate(activity: Activity, attrs: AttributeSet, savedInstanceState: Bundle?) {
//        super.onInflate(activity, attrs, savedInstanceState)
//    }

    override fun toString(): String {
        Log.e("TAG","toString     $msg")
        return super.toString()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.e("TAG","onConfigurationChanged     $msg")
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        Log.e("TAG","onLowMemory      $msg")
        super.onLowMemory()
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        Log.e("TAG","onCreateContextMenu      $msg")
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun getViewModelStore(): ViewModelStore {
        Log.e("TAG","getViewModelStore      $msg")
        return super.getViewModelStore()
    }

    override fun getDefaultViewModelProviderFactory(): ViewModelProvider.Factory {
        Log.e("TAG","etDefaultViewModelProviderFactory      $msg")
        return super.getDefaultViewModelProviderFactory()
    }

    override fun getDefaultViewModelCreationExtras(): CreationExtras {
        Log.e("TAG","getDefaultViewModelCreationExtra       $msg")
        return super.getDefaultViewModelCreationExtras()
    }

    override fun getViewLifecycleOwner(): LifecycleOwner {
        Log.e("TAG","getViewLifecycleOwner     $msg")
        return super.getViewLifecycleOwner()
    }

    override fun getViewLifecycleOwnerLiveData(): LiveData<LifecycleOwner> {
        Log.e("TAG","getViewLifecycleOwnerLiveData       $msg")
        return super.getViewLifecycleOwnerLiveData()
    }

    override fun setArguments(args: Bundle?) {
        Log.e("TAG","setArguments      $msg")
        super.setArguments(args)
    }

    override fun setInitialSavedState(state: SavedState?) {
        Log.e("TAG","setInitialSavedState       $msg")
        super.setInitialSavedState(state)
    }

//    override fun setTargetFragment(fragment: Fragment?, requestCode: Int) {
//        super.setTargetFragment(fragment, requestCode)
//    }

    override fun onHiddenChanged(hidden: Boolean) {
        Log.e("TAG","onHiddenChanged      $msg")
        super.onHiddenChanged(hidden)
    }

//    override fun setRetainInstance(retain: Boolean) {
//        super.setRetainInstance(retain)
//    }
//
//    override fun setHasOptionsMenu(hasMenu: Boolean) {
//        super.setHasOptionsMenu(hasMenu)
//    }

    override fun setMenuVisibility(menuVisible: Boolean) {
        Log.e("TAG"," setMenuVisibility       $msg")
        super.setMenuVisibility(menuVisible)
    }

//    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
//        super.setUserVisibleHint(isVisibleToUser)
//    }

//    override fun getUserVisibleHint(): Boolean {
//        return super.getUserVisibleHint()
//    }
//
//    override fun getLoaderManager(): LoaderManager {
//        return super.getLoaderManager()
//    }
//
//    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
//        super.startActivityForResult(intent, requestCode)
//    }
//
//    override fun startActivityForResult(intent: Intent?, requestCode: Int, options: Bundle?) {
//        super.startActivityForResult(intent, requestCode, options)
//    }


    override fun startIntentSenderForResult(
        intent: IntentSender?,
        requestCode: Int,
        fillInIntent: Intent?,
        flagsMask: Int,
        flagsValues: Int,
        extraFlags: Int,
        options: Bundle?
    ) {
        super.startIntentSenderForResult(
            intent,
            requestCode,
            fillInIntent,
            flagsMask,
            flagsValues,
            extraFlags,
            options
        )
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//    }

    override fun shouldShowRequestPermissionRationale(permission: String): Boolean {
        Log.e("TAG","shouldShowRequestPermissionRationale       $msg")
        return super.shouldShowRequestPermissionRationale(permission)
    }

//    override fun getLayoutInflater(savedFragmentState: Bundle?): LayoutInflater {
//        return super.getLayoutInflater(savedFragmentState)
//    }
//
//    override fun performGetLayoutInflater(savedInstanceState: Bundle?): LayoutInflater {
//        return super.performGetLayoutInflater(savedInstanceState)
//    }

    override fun onAttachFragment(childFragment: Fragment) {
        Log.e("TAG","onAttachFragment      $msg")
        super.onAttachFragment(childFragment)
    }

    override fun onCreateAnimation(transit: Int, enter: Boolean, nextAnim: Int): Animation? {
        Log.e("TAG","onCreateAnimation     $msg")
        return super.onCreateAnimation(transit, enter, nextAnim)
    }

    override fun onCreateAnimator(transit: Int, enter: Boolean, nextAnim: Int): Animator? {
        Log.e("TAG","onCreateAnimator       $msg")
        return super.onCreateAnimator(transit, enter, nextAnim)
    }

//    override fun restoreChildFragmentState(savedInstanceState: Bundle?) {
//        super.restoreChildFragmentState(savedInstanceState)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.e("TAG","onViewCreated       $msg")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun getView(): View? {
        Log.e("TAG","getView      $msg")
        return super.getView()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.e("TAG","onActivityCreated       $msg")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.e("TAG","onViewStateRestored       $msg")

        super.onViewStateRestored(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.e("TAG","onSaveInstanceState       $msg")
        super.onSaveInstanceState(outState)
    }

    override fun onMultiWindowModeChanged(isInMultiWindowMode: Boolean) {
        Log.e("TAG","onMultiWindowModeChanged      $msg")
        super.onMultiWindowModeChanged(isInMultiWindowMode)
    }

    override fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean) {
        Log.e("TAG","onPictureInPictureModeChanged       $msg")
        super.onPictureInPictureModeChanged(isInPictureInPictureMode)
    }

    override fun onPrimaryNavigationFragmentChanged(isPrimaryNavigationFragment: Boolean) {
        Log.e("TAG","onPrimaryNavigationFragmentChanged       $msg")
        super.onPrimaryNavigationFragmentChanged(isPrimaryNavigationFragment)
    }

//    override fun initState() {
//        super.initState()
//    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//    }
//
//    override fun onPrepareOptionsMenu(menu: Menu) {
//        super.onPrepareOptionsMenu(menu)
//    }
//
//    override fun onDestroyOptionsMenu() {
//        super.onDestroyOptionsMenu()
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return super.onOptionsItemSelected(item)
//    }
//
//    override fun onOptionsMenuClosed(menu: Menu) {
//        super.onOptionsMenuClosed(menu)
 //   }

    override fun registerForContextMenu(view: View) {
        Log.e("TAG","registerForContextMenu       $msg")
        super.registerForContextMenu(view)
    }

    override fun unregisterForContextMenu(view: View) {
        Log.e("TAG","unregisterForContextMenu       $msg")
        super.unregisterForContextMenu(view)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        Log.e("TAG","onContextItemSelected       $msg")
        return super.onContextItemSelected(item)
    }

    override fun setEnterSharedElementCallback(callback: SharedElementCallback?) {
        Log.e("TAG","setEnterSharedElementCallback      $msg")
        super.setEnterSharedElementCallback(callback)
    }

    override fun setExitSharedElementCallback(callback: SharedElementCallback?) {
        Log.e("TAG","setExitSharedElementCallback       $msg")
        super.setExitSharedElementCallback(callback)
    }

    override fun setEnterTransition(transition: Any?) {
        Log.e("TAG","setEnterTransition      $msg")
        super.setEnterTransition(transition)
    }

    override fun getEnterTransition(): Any? {
        Log.e("TAG","getEnterTransition       $msg")
        return super.getEnterTransition()
    }

    override fun setReturnTransition(transition: Any?) {
        Log.e("TAG","setReturnTransition      $msg")
        super.setReturnTransition(transition)
    }

    override fun getReturnTransition(): Any? {
        Log.e("TAG","getReturnTransition       $msg")
        return super.getReturnTransition()
    }

    override fun setExitTransition(transition: Any?) {
        Log.e("TAG","setExitTransition       $msg")
        super.setExitTransition(transition)
    }

    override fun getExitTransition(): Any? {
        Log.e("TAG","getExitTransition       $msg")
        return super.getExitTransition()
    }

    override fun setReenterTransition(transition: Any?) {
        Log.e("TAG","setReenterTransition      $msg")
        super.setReenterTransition(transition)
    }

    override fun getReenterTransition(): Any? {
        Log.e("TAG","getReenterTransition      $msg")
        return super.getReenterTransition()
    }

    override fun setSharedElementEnterTransition(transition: Any?) {
        Log.e("TAG","setSharedElementEnterTransition      $msg")
        super.setSharedElementEnterTransition(transition)
    }

    override fun getSharedElementEnterTransition(): Any? {
        Log.e("TAG","getSharedElementEnterTransition       $msg")
        return super.getSharedElementEnterTransition()
    }

    override fun setSharedElementReturnTransition(transition: Any?) {
        Log.e("TAG","setSharedElementReturnTransition      $msg")
        super.setSharedElementReturnTransition(transition)
    }

    override fun getSharedElementReturnTransition(): Any? {
        Log.e("TAG","getSharedElementReturnTransition       $msg")
        return super.getSharedElementReturnTransition()
    }

    override fun setAllowEnterTransitionOverlap(allow: Boolean) {
        Log.e("TAG","setAllowEnterTransitionOverlap       $msg")
        super.setAllowEnterTransitionOverlap(allow)
    }

    override fun getAllowEnterTransitionOverlap(): Boolean {
        Log.e("TAG","getAllowEnterTransitionOverlap      $msg")
        return super.getAllowEnterTransitionOverlap()
    }

    override fun setAllowReturnTransitionOverlap(allow: Boolean) {
        Log.e("TAG","setAllowReturnTransitionOverlap      $msg")
        super.setAllowReturnTransitionOverlap(allow)
    }

    override fun getAllowReturnTransitionOverlap(): Boolean {
        Log.e("TAG","getAllowReturnTransitionOverlap      $msg")
        return super.getAllowReturnTransitionOverlap()
    }

    override fun postponeEnterTransition() {
        Log.e("TAG","postponeEnterTransition      $msg")
        super.postponeEnterTransition()
    }

    override fun startPostponedEnterTransition() {
        Log.e("TAG","startPostponedEnterTransition       $msg")
        super.startPostponedEnterTransition()
    }

//    override fun callStartTransitionListener(calledDirectly: Boolean) {
//        super.callStartTransitionListener(calledDirectly)
//    }

    override fun dump(
        prefix: String,
        fd: FileDescriptor?,
        writer: PrintWriter,
        args: Array<out String>?
    ) {
        Log.e("TAG","startActivity 2       $msg")
        super.dump(prefix, fd, writer, args)
    }

//    override fun findFragmentByWho(who: String): Fragment? {
//        return super.findFragmentByWho(who)
//    }
//
//    override fun createFragmentContainer(): FragmentContainer {
//        return super.createFragmentContainer()
//    }
//
//    override fun performAttach() {
//        super.performAttach()
//    }
//
//    override fun performCreate(savedInstanceState: Bundle?) {
//        super.performCreate(savedInstanceState)
//    }
//
//    override fun performCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ) {
//        super.performCreateView(inflater, container, savedInstanceState)
//    }
//
//    override fun performViewCreated() {
//        super.performViewCreated()
//    }
//
//    override fun performActivityCreated(savedInstanceState: Bundle?) {
//        super.performActivityCreated(savedInstanceState)
//    }
//
//    override fun performStart() {
//        super.performStart()
//    }
//
//    override fun performResume() {
//        super.performResume()
//    }
//
//    override fun noteStateNotSaved() {
//        super.noteStateNotSaved()
////    }
//
//    override fun performPrimaryNavigationFragmentChanged() {
//        super.performPrimaryNavigationFragmentChanged()
//    }
//
//    override fun performMultiWindowModeChanged(isInMultiWindowMode: Boolean) {
//        super.performMultiWindowModeChanged(isInMultiWindowMode)
//    }
//
//    override fun performPictureInPictureModeChanged(isInPictureInPictureMode: Boolean) {
//        super.performPictureInPictureModeChanged(isInPictureInPictureMode)
//    }
//
//    override fun performConfigurationChanged(newConfig: Configuration) {
//        super.performConfigurationChanged(newConfig)
//    }
//
//    override fun performLowMemory() {
//        super.performLowMemory()
//    }
//
//    override fun performCreateOptionsMenu(menu: Menu, inflater: MenuInflater): Boolean {
//        return super.performCreateOptionsMenu(menu, inflater)
//    }
//
//    override fun performPrepareOptionsMenu(menu: Menu): Boolean {
//        return super.performPrepareOptionsMenu(menu)
//    }
//
//    override fun performOptionsItemSelected(item: MenuItem): Boolean {
//        return super.performOptionsItemSelected(item)
//    }
//
//    override fun performContextItemSelected(item: MenuItem): Boolean {
//        return super.performContextItemSelected(item)
//    }
//
//    override fun performOptionsMenuClosed(menu: Menu) {
//        super.performOptionsMenuClosed(menu)
//    }
//
//    override fun performSaveInstanceState(outState: Bundle?) {
//        super.performSaveInstanceState(outState)
//    }
//
//    override fun performPause() {
//        super.performPause()
//    }
//
//    override fun performStop() {
//        super.performStop()
//    }
//
//    override fun performDestroyView() {
//        super.performDestroyView()
//    }
//
//    override fun performDestroy() {
//        super.performDestroy()
//    }
//
//    override fun performDetach() {
//        super.performDetach()
//    }
//
//    override fun setAnimations(enter: Int, exit: Int, popEnter: Int, popExit: Int) {
//        super.setAnimations(enter, exit, popEnter, popExit)
//    }
//
//    override fun getEnterAnim(): Int {
//        return super.getEnterAnim()
//    }
//
//    override fun getExitAnim(): Int {
//        return super.getExitAnim()
//    }
//
//    override fun getPopEnterAnim(): Int {
//        return super.getPopEnterAnim()
//    }
//
//    override fun getPopExitAnim(): Int {
//        return super.getPopExitAnim()
//    }
//
//    override fun getPopDirection(): Boolean {
//        return super.getPopDirection()
//    }
//
//    override fun setPopDirection(isPop: Boolean) {
//        super.setPopDirection(isPop)
//    }
//
//    override fun getNextTransition(): Int {
//        return super.getNextTransition()
//    }
//
//    override fun setNextTransition(nextTransition: Int) {
//        super.setNextTransition(nextTransition)
//    }
//
//    override fun getSharedElementSourceNames(): ArrayList<String> {
//        return super.getSharedElementSourceNames()
//    }
//
//    override fun getSharedElementTargetNames(): ArrayList<String> {
//        return super.getSharedElementTargetNames()
//    }
//
//    override fun setSharedElementNames(
//        sharedElementSourceNames: ArrayList<String>?,
//        sharedElementTargetNames: ArrayList<String>?
//    ) {
//        super.setSharedElementNames(sharedElementSourceNames, sharedElementTargetNames)
//    }
//
//    override fun getEnterTransitionCallback(): SharedElementCallback {
//        return super.getEnterTransitionCallback()
//    }
//
//    override fun getExitTransitionCallback(): SharedElementCallback {
//        return super.getExitTransitionCallback()
//    }
//
//    override fun getAnimatingAway(): View {
//        return super.getAnimatingAway()
//    }
//
//    override fun setPostOnViewCreatedAlpha(alpha: Float) {
//        super.setPostOnViewCreatedAlpha(alpha)
//    }
//
//    override fun getPostOnViewCreatedAlpha(): Float {
//        return super.getPostOnViewCreatedAlpha()
//    }
//
//    override fun setFocusedView(view: View?) {
//        super.setFocusedView(view)
//    }

//    override fun getFocusedView(): View {
//        return super.getFocusedView()
//    }
//
//    override fun isPostponed(): Boolean {
//        return super.isPostponed()
//    }
//
//    override fun generateActivityResultKey(): String {
//        return super.generateActivityResultKey()
//    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}