@file:Suppress("NOTHING_TO_INLINE", "unused")
package com.sectumsempra.carinfo.presentation.extensions

import android.view.View
import androidx.annotation.DimenRes
import org.jetbrains.anko.dip
import java.util.*

/*
 * View properties
 **/
internal fun View.visible() {
    this.visibility = View.VISIBLE
}

internal fun View.gone() {
    this.visibility = View.GONE
}

internal fun View.generateId() {
    id = Random().nextInt(Int.MAX_VALUE)
}

internal inline fun View.dip(@DimenRes dimenRes: Int): Int = context.dip(resources.getDimension(dimenRes))