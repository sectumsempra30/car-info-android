package com.sectumsempra.carinfo.presentation.pages.base

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.databinding.ViewDataBinding
import com.sectumsempra.carinfo.R
import com.sectumsempra.carinfo.presentation.extensions.enableBackButton
import com.sectumsempra.carinfo.presentation.extensions.makeToolbarAsActionBar
import com.sectumsempra.carinfo.presentation.extensions.onBackPressedHandler

internal abstract class BaseToolbarActivity<V: ViewDataBinding, VM: BaseViewModel> : BaseActivity<V, VM>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setToolbar()
    }

    private fun setToolbar() {
        findViewById<Toolbar>(R.id.toolbar)?.let {
            makeToolbarAsActionBar(it)
            enableBackButton()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) = onBackPressedHandler(item)
}