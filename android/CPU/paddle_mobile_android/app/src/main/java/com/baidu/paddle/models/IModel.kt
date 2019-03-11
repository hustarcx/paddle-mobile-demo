package com.baidu.paddle.models

import android.graphics.Bitmap
import android.support.v7.widget.AppCompatImageView


/**
 * Created by xiebaiyuan on 2018/7/18.
 */

interface IModel {

    fun load()

    fun clear()

    fun predictImage(inputBuf: FloatArray): FloatArray?

    fun predictImage(bitmap: Bitmap): FloatArray?

    fun getInputSize(): Int

    fun getScaledMatrix(bitmap: Bitmap, desWidth: Int, desHeight: Int): FloatArray

    fun mixResult(showView: AppCompatImageView, predicted: Pair<FloatArray, Bitmap>)

    fun setThreadCount(mThreadCounts: Int)

    fun processInfo(result: FloatArray): String?

    fun getMainMsg(): String?

    fun getDebugInfo(): String?
}