package com.example.recyclerview

import android.content.ContentValues.TAG
import android.content.Context
import android.graphics.PointF
import android.graphics.Rect
import android.os.Bundle
import android.os.Parcelable
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityEvent
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class CustomLinearLayoutManager : LinearLayoutManager {

    constructor(context: Context) : super(context)

    constructor(context: Context, orientation: Int, reverseLayout: Boolean) : super(
        context, orientation, reverseLayout
    )

    override fun addDisappearingView(child: View?) {
        Log.e(TAG, " add disappearing view        LAYOUT MANAGER")
        super.addDisappearingView(child)
    }

    override fun addView(child: View?) {
        Log.e(TAG, "add view        LAYOUT MANAGER")
        super.addView(child)
    }

    override fun addDisappearingView(child: View?, index: Int) {
        Log.d(TAG, "add disappearing view, index        LAYOUT MANAGER")
        super.addDisappearingView(child, index)
    }

    override fun attachView(child: View) {
        Log.e(TAG, "attach view        LAYOUT MANAGER")
        super.attachView(child)
    }

    override fun addView(child: View?, index: Int) {
        Log.d(TAG, "add view index         LAYOUT MANAGER")
        super.addView(child, index)
    }

    override fun getHeight(): Int {
        Log.d(TAG, "getHeight        LAYOUT MANAGER")
        return super.getHeight()
    }

    override fun getChildCount(): Int {
        Log.d(TAG, "getChildCount   ${super.getChildCount()}    LAYOUT MANAGER")
        return super.getChildCount()
    }

    override fun attachView(child: View, index: Int, lp: RecyclerView.LayoutParams?) {
        Log.e(TAG, "attachView       LAYOUT MANAGER")
        super.attachView(child, index, lp)
    }

//    override fun setRecyclerView(recyclerView: RecyclerView?) {
//        super.setRecyclerView(recyclerView)
//    }
//
//    override fun setMeasureSpecs(wSpec: Int, hSpec: Int) {
//        super.setMeasureSpecs(wSpec, hSpec)
//    }
//
//    override fun setMeasuredDimensionFromChildren(widthSpec: Int, heightSpec: Int) {
//        super.setMeasuredDimensionFromChildren(widthSpec, heightSpec)
//    }

    override fun setMeasuredDimension(childrenBounds: Rect?, wSpec: Int, hSpec: Int) {
        Log.e(TAG, "setMeasuredDimension        LAYOUT MANAGER")
        super.setMeasuredDimension(childrenBounds, wSpec, hSpec)
    }

    override fun setMeasuredDimension(widthSize: Int, heightSize: Int) {
        Log.e(TAG, "setMeasuredDimension    2    LAYOUT MANAGER")
        super.setMeasuredDimension(widthSize, heightSize)
    }

    override fun requestLayout() {
        Log.e("TAG", "requestLayout                 LAYOUT MANAGER")
        super.requestLayout()
    }

    override fun assertInLayoutOrScroll(message: String?) {
        Log.e("TAG", "assertInLayoutOrScroll                LAYOUT MANAGER")
        super.assertInLayoutOrScroll(message)
    }

    override fun assertNotInLayoutOrScroll(message: String?) {
        Log.e("TAG", "assertNotInLayoutOrScroll               LAYOUT MANAGER")
        super.assertNotInLayoutOrScroll(message)
    }



    override fun isAutoMeasureEnabled(): Boolean {
        Log.e("TAG", "isAutoMeasureEnabled              LAYOUT MANAGER")
        return super.isAutoMeasureEnabled()
    }

    override fun supportsPredictiveItemAnimations(): Boolean {
        Log.e("TAG", "supportsPredictiveItemAnimations                 LAYOUT MANAGER")
        return super.supportsPredictiveItemAnimations()

    }

    override fun collectAdjacentPrefetchPositions(
        dx: Int,
        dy: Int,
        state: RecyclerView.State?,
        layoutPrefetchRegistry: LayoutPrefetchRegistry?
    ) {
        Log.e("TAG", "collectAdjacentPrefetchPositions                LAYOUT MANAGER")
        super.collectAdjacentPrefetchPositions(dx, dy, state, layoutPrefetchRegistry)
    }

    override fun collectInitialPrefetchPositions(
        adapterItemCount: Int, layoutPrefetchRegistry: LayoutPrefetchRegistry?
    ) {
        Log.e("TAG", "collectInitialPrefetchPositions                LAYOUT MANAGER")
        super.collectInitialPrefetchPositions(adapterItemCount, layoutPrefetchRegistry)
    }

//    override fun dispatchAttachedToWindow(view: RecyclerView?) {
//        super.dispatchAttachedToWindow(view)
//    }
//
//    override fun dispatchDetachedFromWindow(view: RecyclerView?, recycler: RecyclerView.Recycler?) {
//        super.dispatchDetachedFromWindow(view, recycler)
//    }

    override fun isAttachedToWindow(): Boolean {
        Log.e("TAG", "isAttachedToWindow                LAYOUT MANAGER")
        return super.isAttachedToWindow()
    }

    override fun postOnAnimation(action: Runnable?) {
        Log.e("TAG", "postOnAnimation                LAYOUT MANAGER")
        super.postOnAnimation(action)
    }

    override fun removeCallbacks(action: Runnable?): Boolean {
        Log.e("TAG", "removeCallbacks                LAYOUT MANAGER")
        return super.removeCallbacks(action)
    }

    override fun onDetachedFromWindow(view: RecyclerView?, recycler: RecyclerView.Recycler?) {
        Log.e("TAG", "onDetachedFromWindow                 LAYOUT MANAGER")
        super.onDetachedFromWindow(view, recycler)
    }

    override fun onDetachedFromWindow(view: RecyclerView?) {
        super.onDetachedFromWindow(view)
    }

    override fun getClipToPadding(): Boolean {
        Log.e("TAG", "getClipToPadding                 LAYOUT MANAGER")
        return super.getClipToPadding()
    }

    override fun generateDefaultLayoutParams(): RecyclerView.LayoutParams {
        Log.e("TAG", "generateDefaultLayoutParams                 LAYOUT MANAGER")
        return super.generateDefaultLayoutParams()
    }

    override fun checkLayoutParams(lp: RecyclerView.LayoutParams?): Boolean {
        Log.e("TAG", "checkLayoutParams                LAYOUT MANAGER")
        return super.checkLayoutParams(lp)
    }

    override fun generateLayoutParams(lp: ViewGroup.LayoutParams?): RecyclerView.LayoutParams {
        Log.e("TAG", "RgenerateLayoutParams                LAYOUT MANAGER")
        return super.generateLayoutParams(lp)
    }

    override fun generateLayoutParams(
        c: Context?, attrs: AttributeSet?
    ): RecyclerView.LayoutParams {
        Log.e("TAG", "generateLayoutParams                 LAYOUT MANAGER")
        return super.generateLayoutParams(c, attrs)
    }

    override fun scrollHorizontallyBy(
        dx: Int, recycler: RecyclerView.Recycler?, state: RecyclerView.State?
    ): Int {
        Log.e("TAG", "scrollHorizontallyBy                LAYOUT MANAGER")
        return super.scrollHorizontallyBy(dx, recycler, state)
    }

    override fun scrollVerticallyBy(
        dy: Int, recycler: RecyclerView.Recycler?, state: RecyclerView.State?
    ): Int {
        Log.e(TAG, "scrollVerticallyBy")
        return super.scrollVerticallyBy(dy, recycler, state)
    }

    override fun canScrollHorizontally(): Boolean {
        Log.e("TAG", "CANscrollHorizontallyBy                LAYOUT MANAGER")
        return super.canScrollHorizontally()
    }

    override fun canScrollVertically(): Boolean {
        Log.e("TAG", "CANscrollVerticallyBy                LAYOUT MANAGER")
        return super.canScrollVertically()
    }

    override fun scrollToPosition(position: Int) {
        Log.e("TAG", "scrollToPosition               LAYOUT MANAGER")
        super.scrollToPosition(position)
    }

    override fun smoothScrollToPosition(
        recyclerView: RecyclerView?, state: RecyclerView.State?, position: Int
    ) {
        Log.e("TAG", "smoothScrollToPosition             LAYOUT MANAGER")
        super.smoothScrollToPosition(recyclerView, state, position)
    }

    override fun startSmoothScroll(smoothScroller: RecyclerView.SmoothScroller?) {
        Log.e("TAG", "startSmoothScrol               LAYOUT MANAGER")
        super.startSmoothScroll(smoothScroller)
    }

    override fun isSmoothScrolling(): Boolean {
        Log.e("TAG", "isSmoothScrolling            LAYOUT MANAGER")
        return super.isSmoothScrolling()
    }

    override fun getLayoutDirection(): Int {
        Log.e("TAG", "getLayoutDirection              LAYOUT MANAGER")
        return super.getLayoutDirection()
    }

    override fun endAnimation(view: View?) {
        Log.e("TAG", "endAnimation            LAYOUT MANAGER")
        super.endAnimation(view)
    }

//    override fun addViewInt(child: View?, index: Int, disappearing: Boolean) {
//        super.addViewInt(child, index, disappearing)
//    }

    override fun removeView(child: View?) {
        Log.e("TAG", "removeView           LAYOUT MANAGER")
        super.removeView(child)
    }

    override fun removeViewAt(index: Int) {
        Log.e("TAG", "removeViewA            LAYOUT MANAGER")
        super.removeViewAt(index)
    }

    override fun removeAllViews() {
        Log.e("TAG", "removeAllViews            LAYOUT MANAGER")
        super.removeAllViews()
    }



    override fun getPosition(view: View): Int {
        Log.e("TAG", "getPosition           LAYOUT MANAGER")
        return super.getPosition(view)
    }

    override fun findContainingItemView(view: View): View? {
        Log.e("TAG", "findContainingItemView           LAYOUT MANAGER")
        return super.findContainingItemView(view)
    }

    override fun detachViewAt(index: Int) {
        super.detachViewAt(index)
    }

//    override fun detachViewInternal(index: Int, view: View) {
//        super.detachViewInternal(index, view)
//    }

    override fun removeDetachedView(child: View) {
        super.removeDetachedView(child)
    }

    override fun moveView(fromIndex: Int, toIndex: Int) {
        super.moveView(fromIndex, toIndex)
    }

    override fun removeAndRecycleViewAt(index: Int, recycler: RecyclerView.Recycler) {
        super.removeAndRecycleViewAt(index, recycler)
    }

    override fun getChildAt(index: Int): View? {
        return super.getChildAt(index)
    }

    override fun getWidthMode(): Int {
        return super.getWidthMode()
    }

    override fun getHeightMode(): Int {
        return super.getHeightMode()
    }

    override fun getWidth(): Int {
        return super.getWidth()
    }

    override fun getPaddingLeft(): Int {
        return super.getPaddingLeft()
    }

    override fun getPaddingTop(): Int {
        return super.getPaddingTop()
    }

    override fun getPaddingRight(): Int {
        return super.getPaddingRight()
    }

    override fun getPaddingBottom(): Int {
        return super.getPaddingBottom()
    }

    override fun getPaddingStart(): Int {
        return super.getPaddingStart()
    }

    override fun getPaddingEnd(): Int {
        return super.getPaddingEnd()
    }

    override fun isFocused(): Boolean {
        return super.isFocused()
    }

    override fun hasFocus(): Boolean {
        return super.hasFocus()
    }

    override fun getFocusedChild(): View? {
        return super.getFocusedChild()
    }

    override fun getItemCount(): Int {
        return super.getItemCount()
    }

    override fun offsetChildrenHorizontal(dx: Int) {
        super.offsetChildrenHorizontal(dx)
    }

    override fun offsetChildrenVertical(dy: Int) {
        super.offsetChildrenVertical(dy)
    }

    override fun ignoreView(view: View) {
        super.ignoreView(view)
    }

    override fun stopIgnoringView(view: View) {
        super.stopIgnoringView(view)
    }

    override fun detachAndScrapAttachedViews(recycler: RecyclerView.Recycler) {
        super.detachAndScrapAttachedViews(recycler)
    }

//    override fun scrapOrRecycleView(recycler: RecyclerView.Recycler?, index: Int, view: View?) {
//        super.scrapOrRecycleView(recycler, index, view)
//    }
//
//    override fun removeAndRecycleScrapInt(recycler: RecyclerView.Recycler?) {
//        super.removeAndRecycleScrapInt(recycler)
//    }
//
//    override fun shouldReMeasureChild(
//        child: View?,
//        widthSpec: Int,
//        heightSpec: Int,
//        lp: RecyclerView.LayoutParams?
//    ): Boolean {
//        return super.shouldReMeasureChild(child, widthSpec, heightSpec, lp)
//    }
//
//    override fun shouldMeasureChild(
//        child: View?,
//        widthSpec: Int,
//        heightSpec: Int,
//        lp: RecyclerView.LayoutParams?
//    ): Boolean {
//        return super.shouldMeasureChild(child, widthSpec, heightSpec, lp)
//    }

    override fun isMeasurementCacheEnabled(): Boolean {
        return super.isMeasurementCacheEnabled()
    }

    override fun setMeasurementCacheEnabled(measurementCacheEnabled: Boolean) {
        super.setMeasurementCacheEnabled(measurementCacheEnabled)
    }

    override fun measureChildWithMargins(child: View, widthUsed: Int, heightUsed: Int) {
        super.measureChildWithMargins(child, widthUsed, heightUsed)
    }

    override fun getDecoratedMeasuredWidth(child: View): Int {
        return super.getDecoratedMeasuredWidth(child)
    }

    override fun getDecoratedMeasuredHeight(child: View): Int {
        return super.getDecoratedMeasuredHeight(child)
    }

    override fun layoutDecorated(child: View, left: Int, top: Int, right: Int, bottom: Int) {
        super.layoutDecorated(child, left, top, right, bottom)
    }

    override fun layoutDecoratedWithMargins(
        child: View, left: Int, top: Int, right: Int, bottom: Int
    ) {
        super.layoutDecoratedWithMargins(child, left, top, right, bottom)
    }

    override fun getTransformedBoundingBox(child: View, includeDecorInsets: Boolean, out: Rect) {
        super.getTransformedBoundingBox(child, includeDecorInsets, out)
    }

    override fun getDecoratedBoundsWithMargins(view: View, outBounds: Rect) {
        super.getDecoratedBoundsWithMargins(view, outBounds)
    }

    override fun getDecoratedLeft(child: View): Int {
        return super.getDecoratedLeft(child)
    }

    override fun getDecoratedTop(child: View): Int {
        return super.getDecoratedTop(child)
    }

    override fun getDecoratedRight(child: View): Int {
        return super.getDecoratedRight(child)
    }

    override fun getDecoratedBottom(child: View): Int {
        return super.getDecoratedBottom(child)
    }

    override fun calculateItemDecorationsForChild(child: View, outRect: Rect) {
        super.calculateItemDecorationsForChild(child, outRect)
    }

    override fun getTopDecorationHeight(child: View): Int {
        return super.getTopDecorationHeight(child)
    }

    override fun getBottomDecorationHeight(child: View): Int {
        return super.getBottomDecorationHeight(child)
    }

    override fun getLeftDecorationWidth(child: View): Int {
        return super.getLeftDecorationWidth(child)
    }

    override fun getRightDecorationWidth(child: View): Int {
        return super.getRightDecorationWidth(child)
    }

    override fun onFocusSearchFailed(
        focused: View,
        focusDirection: Int,
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State
    ): View? {
        return super.onFocusSearchFailed(focused, focusDirection, recycler, state)
    }

    override fun onInterceptFocusSearch(focused: View, direction: Int): View? {
        return super.onInterceptFocusSearch(focused, direction)
    }

//    override fun getChildRectangleOnScreenScrollAmount(child: View?, rect: Rect?): IntArray {
//        return super.getChildRectangleOnScreenScrollAmount(child, rect)
//    }

    override fun requestChildRectangleOnScreen(
        parent: RecyclerView, child: View, rect: Rect, immediate: Boolean
    ): Boolean {
        return super.requestChildRectangleOnScreen(parent, child, rect, immediate)
    }

    override fun requestChildRectangleOnScreen(
        parent: RecyclerView,
        child: View,
        rect: Rect,
        immediate: Boolean,
        focusedChildVisible: Boolean
    ): Boolean {
        return super.requestChildRectangleOnScreen(
            parent, child, rect, immediate, focusedChildVisible
        )
    }

    override fun isViewPartiallyVisible(
        child: View, completelyVisible: Boolean, acceptEndPointInclusion: Boolean
    ): Boolean {
        return super.isViewPartiallyVisible(child, completelyVisible, acceptEndPointInclusion)
    }

//    override fun isFocusedChildVisibleAfterScrolling(
//        parent: RecyclerView?,
//        dx: Int,
//        dy: Int
//    ): Boolean {
//        return super.isFocusedChildVisibleAfterScrolling(parent, dx, dy)
//    }

    override fun onRequestChildFocus(parent: RecyclerView, child: View, focused: View?): Boolean {
        return super.onRequestChildFocus(parent, child, focused)
    }

    override fun onRequestChildFocus(
        parent: RecyclerView, state: RecyclerView.State, child: View, focused: View?
    ): Boolean {
        return super.onRequestChildFocus(parent, state, child, focused)
    }

    override fun onAdapterChanged(
        oldAdapter: RecyclerView.Adapter<*>?, newAdapter: RecyclerView.Adapter<*>?
    ) {
        super.onAdapterChanged(oldAdapter, newAdapter)
    }

    override fun onAddFocusables(
        recyclerView: RecyclerView, views: ArrayList<View>, direction: Int, focusableMode: Int
    ): Boolean {
        return super.onAddFocusables(recyclerView, views, direction, focusableMode)
    }

    override fun onItemsChanged(recyclerView: RecyclerView) {
        super.onItemsChanged(recyclerView)
    }

    override fun onItemsAdded(recyclerView: RecyclerView, positionStart: Int, itemCount: Int) {
        super.onItemsAdded(recyclerView, positionStart, itemCount)
    }

    override fun onItemsRemoved(recyclerView: RecyclerView, positionStart: Int, itemCount: Int) {
        super.onItemsRemoved(recyclerView, positionStart, itemCount)
    }

    override fun onItemsUpdated(recyclerView: RecyclerView, positionStart: Int, itemCount: Int) {
        super.onItemsUpdated(recyclerView, positionStart, itemCount)
    }

    override fun onItemsUpdated(
        recyclerView: RecyclerView, positionStart: Int, itemCount: Int, payload: Any?
    ) {
        super.onItemsUpdated(recyclerView, positionStart, itemCount, payload)
    }

    override fun onItemsMoved(recyclerView: RecyclerView, from: Int, to: Int, itemCount: Int) {
        super.onItemsMoved(recyclerView, from, to, itemCount)
    }

    override fun computeHorizontalScrollExtent(state: RecyclerView.State): Int {
        return super.computeHorizontalScrollExtent(state)
    }

    override fun computeHorizontalScrollOffset(state: RecyclerView.State): Int {
        return super.computeHorizontalScrollOffset(state)
    }

    override fun computeHorizontalScrollRange(state: RecyclerView.State): Int {
        return super.computeHorizontalScrollRange(state)
    }

    override fun computeVerticalScrollExtent(state: RecyclerView.State): Int {
        return super.computeVerticalScrollExtent(state)
    }

    override fun computeVerticalScrollOffset(state: RecyclerView.State): Int {
        return super.computeVerticalScrollOffset(state)
    }

    override fun computeVerticalScrollRange(state: RecyclerView.State): Int {
        return super.computeVerticalScrollRange(state)
    }

    override fun getMinimumWidth(): Int {
        return super.getMinimumWidth()
    }

    override fun getMinimumHeight(): Int {
        return super.getMinimumHeight()
    }

    override fun onSaveInstanceState(): Parcelable? {
        return super.onSaveInstanceState()
    }

    override fun onRestoreInstanceState(state: Parcelable?) {
        super.onRestoreInstanceState(state)
    }

//    override fun stopSmoothScroller() {
//        super.stopSmoothScroller()
//    }
//
//    override fun onSmoothScrollerStopped(smoothScroller: RecyclerView.SmoothScroller?) {
//        super.onSmoothScrollerStopped(smoothScroller)
//    }

    override fun onScrollStateChanged(state: Int) {
        super.onScrollStateChanged(state)
    }

    override fun removeAndRecycleAllViews(recycler: RecyclerView.Recycler) {
        super.removeAndRecycleAllViews(recycler)
    }

//    override fun onInitializeAccessibilityNodeInfo(info: AccessibilityNodeInfoCompat?) {
//        super.onInitializeAccessibilityNodeInfo(info)
//    }

    override fun onInitializeAccessibilityNodeInfo(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State,
        info: AccessibilityNodeInfoCompat
    ) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, info)
    }

    override fun onInitializeAccessibilityEvent(event: AccessibilityEvent) {
        super.onInitializeAccessibilityEvent(event)
    }

    override fun onInitializeAccessibilityEvent(
        recycler: RecyclerView.Recycler, state: RecyclerView.State, event: AccessibilityEvent
    ) {
        super.onInitializeAccessibilityEvent(recycler, state, event)
    }

//    override fun onInitializeAccessibilityNodeInfoForItem(
//        host: View?,
//        info: AccessibilityNodeInfoCompat?
//    ) {
//        super.onInitializeAccessibilityNodeInfoForItem(host, info)
//    }

    override fun onInitializeAccessibilityNodeInfoForItem(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State,
        host: View,
        info: AccessibilityNodeInfoCompat
    ) {
        super.onInitializeAccessibilityNodeInfoForItem(recycler, state, host, info)
    }

    override fun requestSimpleAnimationsInNextLayout() {
        super.requestSimpleAnimationsInNextLayout()
    }

    override fun getSelectionModeForAccessibility(
        recycler: RecyclerView.Recycler, state: RecyclerView.State
    ): Int {
        return super.getSelectionModeForAccessibility(recycler, state)
    }

    override fun getRowCountForAccessibility(
        recycler: RecyclerView.Recycler, state: RecyclerView.State
    ): Int {
        return super.getRowCountForAccessibility(recycler, state)
    }

    override fun getColumnCountForAccessibility(
        recycler: RecyclerView.Recycler, state: RecyclerView.State
    ): Int {
        return super.getColumnCountForAccessibility(recycler, state)
    }

    override fun isLayoutHierarchical(
        recycler: RecyclerView.Recycler, state: RecyclerView.State
    ): Boolean {
        return super.isLayoutHierarchical(recycler, state)
    }

//    override fun performAccessibilityAction(action: Int, args: Bundle?): Boolean {
//        return super.performAccessibilityAction(action, args)
//    }
//
//    override fun performAccessibilityAction(
//        recycler: RecyclerView.Recycler,
//        state: RecyclerView.State,
//        action: Int,
//        args: Bundle?
//    ): Boolean {
//        return super.performAccessibilityAction(recycler, state, action, args)
//    }
//
//    override fun performAccessibilityActionForItem(
//        view: View,
//        action: Int,
//        args: Bundle?
//    ): Boolean {
//        return super.performAccessibilityActionForItem(view, action, args)
//    }

    override fun performAccessibilityActionForItem(
        recycler: RecyclerView.Recycler,
        state: RecyclerView.State,
        view: View,
        action: Int,
        args: Bundle?
    ): Boolean {
        return super.performAccessibilityActionForItem(recycler, state, view, action, args)
    }

//    override fun setExactMeasureSpecsFrom(recyclerView: RecyclerView?) {
//        super.setExactMeasureSpecsFrom(recyclerView)
//    }
//
//    override fun shouldMeasureTwice(): Boolean {
//        return super.shouldMeasureTwice()
//    }
//
//    override fun hasFlexibleChildInBothOrientations(): Boolean {
//        return super.hasFlexibleChildInBothOrientations()
//    }

    override fun prepareForDrop(view: View, target: View, x: Int, y: Int) {
        super.prepareForDrop(view, target, x, y)
    }

    override fun computeScrollVectorForPosition(targetPosition: Int): PointF? {
        return super.computeScrollVectorForPosition(targetPosition)
    }

    override fun getRecycleChildrenOnDetach(): Boolean {
        return super.getRecycleChildrenOnDetach()
    }

    override fun setRecycleChildrenOnDetach(recycleChildrenOnDetach: Boolean) {
        super.setRecycleChildrenOnDetach(recycleChildrenOnDetach)
    }

    override fun setStackFromEnd(stackFromEnd: Boolean) {
        super.setStackFromEnd(stackFromEnd)
    }

    override fun getStackFromEnd(): Boolean {
        return super.getStackFromEnd()
    }

    override fun getOrientation(): Int {
        Log.e("TAG","getOrientation")
        return super.getOrientation()
    }

    override fun setOrientation(orientation: Int) {
        Log.e("TAG","setOrientation")
        super.setOrientation(orientation)
    }

    override fun getReverseLayout(): Boolean {
        return super.getReverseLayout()
    }

    override fun setReverseLayout(reverseLayout: Boolean) {
        super.setReverseLayout(reverseLayout)
    }

    override fun getExtraLayoutSpace(state: RecyclerView.State?): Int {
        return super.getExtraLayoutSpace(state)
    }

    override fun calculateExtraLayoutSpace(state: RecyclerView.State, extraLayoutSpace: IntArray) {
        super.calculateExtraLayoutSpace(state, extraLayoutSpace)
    }

//    override fun onAnchorReady(
//        recycler: RecyclerView.Recycler?,
//        state: RecyclerView.State?,
//        anchorInfo: AnchorInfo?,
//        firstLayoutItemDirection: Int
//    ) {
//        super.onAnchorReady(recycler, state, anchorInfo, firstLayoutItemDirection)
//    }
//
//    override fun isLayoutRTL(): Boolean {
//        return super.isLayoutRTL()
//    }
//
//    override fun ensureLayoutState() {
//        super.ensureLayoutState()
//    }
//
//    override fun createLayoutState(): LayoutState {
//        return super.createLayoutState()
//    }

    override fun scrollToPositionWithOffset(position: Int, offset: Int) {
        super.scrollToPositionWithOffset(position, offset)
    }

    override fun setSmoothScrollbarEnabled(enabled: Boolean) {
        super.setSmoothScrollbarEnabled(enabled)
    }

    override fun isSmoothScrollbarEnabled(): Boolean {
        return super.isSmoothScrollbarEnabled()
    }

//    override fun resolveIsInfinite(): Boolean {
//        return super.resolveIsInfinite()
//    }
//
//    override fun collectPrefetchPositionsForLayoutState(
//        state: RecyclerView.State?,
//        layoutState: LayoutState?,
//        layoutPrefetchRegistry: LayoutPrefetchRegistry?
//    ) {
//        super.collectPrefetchPositionsForLayoutState(state, layoutState, layoutPrefetchRegistry)
//    }

    override fun setInitialPrefetchItemCount(itemCount: Int) {
        super.setInitialPrefetchItemCount(itemCount)
    }

    override fun getInitialPrefetchItemCount(): Int {
        return super.getInitialPrefetchItemCount()
    }

//    override fun scrollBy(
//        delta: Int,
//        recycler: RecyclerView.Recycler?,
//        state: RecyclerView.State?
//    ): Int {
//        return super.scrollBy(delta, recycler, state)
//    }
//
//    override fun fill(
//        recycler: RecyclerView.Recycler?,
//        layoutState: LayoutState?,
//        state: RecyclerView.State?,
//        stopOnFocusable: Boolean
//    ): Int {
//        return super.fill(recycler, layoutState, state, stopOnFocusable)
//    }

//    override fun layoutChunk(
//        recycler: RecyclerView.Recycler?,
//        state: RecyclerView.State?,
//        layoutState: LayoutState?,
//        result: LayoutChunkResult?
//    ) {
//        super.layoutChunk(recycler, state, layoutState, result)
//    }
//
//    override fun convertFocusDirectionToLayoutDirection(focusDirection: Int): Int {
//        return super.convertFocusDirectionToLayoutDirection(focusDirection)
//    }
//
//    override fun findFirstVisibleChildClosestToStart(
//        completelyVisible: Boolean,
//        acceptPartiallyVisible: Boolean
//    ): View {
//        return super.findFirstVisibleChildClosestToStart(completelyVisible, acceptPartiallyVisible)
//    }
//
//    override fun findFirstVisibleChildClosestToEnd(
//        completelyVisible: Boolean,
//        acceptPartiallyVisible: Boolean
//    ): View {
//        return super.findFirstVisibleChildClosestToEnd(completelyVisible, acceptPartiallyVisible)
//    }

//    override fun findReferenceChild(
//        recycler: RecyclerView.Recycler?,
//        state: RecyclerView.State?,
//        start: Int,
//        end: Int,
//        itemCount: Int
//    ): View {
//        return super.findReferenceChild(recycler, state, start, end, itemCount)
//    }

    override fun findFirstVisibleItemPosition(): Int {
        return super.findFirstVisibleItemPosition()
    }

    override fun findFirstCompletelyVisibleItemPosition(): Int {
        return super.findFirstCompletelyVisibleItemPosition()
    }

    override fun findLastVisibleItemPosition(): Int {
        return super.findLastVisibleItemPosition()
    }

    override fun findLastCompletelyVisibleItemPosition(): Int {
        return super.findLastCompletelyVisibleItemPosition()
    }

//    override fun findOneVisibleChild(
//        fromIndex: Int,
//        toIndex: Int,
//        completelyVisible: Boolean,
//        acceptPartiallyVisible: Boolean
//    ): View {
//        return super.findOneVisibleChild(
//            fromIndex,
//            toIndex,
//            completelyVisible,
//            acceptPartiallyVisible
//        )
//    }
//
//    override fun findOnePartiallyOrCompletelyInvisibleChild(fromIndex: Int, toIndex: Int): View {
//        return super.findOnePartiallyOrCompletelyInvisibleChild(fromIndex, toIndex)
//    }
//
//    override fun validateChildOrder() {
//        super.validateChildOrder()
//    }

    override fun findViewByPosition(position: Int): View? {
        Log.d(TAG, "findViewByPosition     LAYOUT MANAGER")
        return super.findViewByPosition(position)
    }

    override fun measureChild(child: View, widthUsed: Int, heightUsed: Int) {
        Log.d(TAG, "measureChild        LAYOUT MANAGER")
        super.measureChild(child, widthUsed, heightUsed)
    }


    override fun attachView(child: View, index: Int) {
        Log.d(TAG, "Attach View        LAYOUT MANAGER")
        super.attachView(child, index)
    }

    override fun onMeasure(
        recycler: RecyclerView.Recycler, state: RecyclerView.State, widthSpec: Int, heightSpec: Int
    ) {
        super.onMeasure(recycler, state, widthSpec, heightSpec)
    }

    override fun onLayoutChildren(recycler: RecyclerView.Recycler?, state: RecyclerView.State?) {
        Log.e(TAG, "on Layout Children        LAYOUT MANAGER")
        super.onLayoutChildren(recycler, state)
    }

    override fun onLayoutCompleted(state: RecyclerView.State?) {
        Log.d(TAG, "on Layout Completed        LAYOUT MANAGER")
        super.onLayoutCompleted(state)
    }


    override fun onAttachedToWindow(view: RecyclerView?) {
        Log.d(
            TAG, "On attached to Window    " + "    LAYOUT MANAGER is atteched to R V"
        )
        super.onAttachedToWindow(view)
    }

    override fun removeAndRecycleView(child: View, recycler: RecyclerView.Recycler) {
        Log.d(TAG, "removeAndRecycleView        LAYOUT MANAGER")
        super.removeAndRecycleView(child, recycler)
    }

    override fun getItemViewType(view: View): Int {
        Log.d(TAG, "getItemViewType       LAYOUT MANAGER")
        return super.getItemViewType(view)
    }

    override fun detachAndScrapView(child: View, recycler: RecyclerView.Recycler) {
        Log.d(TAG, "detachAndScrapView     LAYOUT MANAGER")
        super.detachAndScrapView(child, recycler)
    }

    override fun detachAndScrapViewAt(index: Int, recycler: RecyclerView.Recycler) {
        Log.d(TAG, "detachAndScrapView At      LAYOUT MANAGER")
        super.detachAndScrapViewAt(index, recycler)
    }

    override fun detachView(child: View) {
        Log.d(TAG, "detachView child      LAYOUT MANAGER")
        super.detachView(child)
    }

}