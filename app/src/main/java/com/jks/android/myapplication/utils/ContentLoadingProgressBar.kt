package com.jks.android.myapplication.utils

import android.content.Context
import android.os.SystemClock
import android.util.AttributeSet
import android.view.View
import android.widget.ProgressBar

class ContentLoadingProgressBar @JvmOverloads constructor(context: Context?, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ProgressBar(context, attrs, defStyleAttr) {
    private var mIsAttachedToWindow = false
    private var mIsShown: Boolean
    var mStartTime = -1L


    private val mDelayedHide = Runnable {
        visibility = View.GONE
        mStartTime = -1L
    }


    private val mDelayedShow = Runnable {
        mStartTime = SystemClock.uptimeMillis()
        visibility = View.VISIBLE
    }


    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        mIsAttachedToWindow = true
        if (mIsShown && visibility != View.VISIBLE) {
            postDelayed(mDelayedShow, MIN_DELAY)
        }
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        mIsAttachedToWindow = false
        removeCallbacks(mDelayedHide)
        removeCallbacks(mDelayedShow)
        if (!mIsShown && mStartTime != -1L) {
            visibility = View.GONE
        }
        mStartTime = -1L
    }

    /**
     * Hide the progress view if it is visible. The progress view will not be
     * hidden until it has been shown for at least a minimum show time. If the
     * progress view was not yet visible, cancels showing the progress view.
     */
    fun hide() {
        if (mIsShown) {
            mIsShown = false
            if (mIsAttachedToWindow) {
                removeCallbacks(mDelayedShow)
            }
            val diff = SystemClock.uptimeMillis() - mStartTime
            if (mStartTime == -1L || diff >= MIN_SHOW_TIME) { // The progress spinner has been shown long enough
// OR was not shown yet. If it wasn't shown yet,
// it will just never be shown.
                visibility = View.GONE
                mStartTime = -1L
            } else { // The progress spinner is shown, but not long enough,
// so put a delayed message in to hide it when its been
// shown long enough.
                postDelayed(mDelayedHide, MIN_SHOW_TIME - diff)
            }
        }
    }

    /**
     * Show the progress view after waiting for a minimum delay. If
     * during that time, hide() is called, the view is never made visible.
     */
    fun show() {
        if (!mIsShown) {
            mIsShown = true
            if (mIsAttachedToWindow) {
                removeCallbacks(mDelayedHide)
                if (mStartTime == -1L) {
                    postDelayed(mDelayedShow, MIN_DELAY)
                }
            }
        }
    }

    companion object {
        private const val MIN_SHOW_TIME = 500L // ms
        private const val MIN_DELAY = 500L // ms
    }

    init {
        mIsShown = visibility == View.VISIBLE
    }
}