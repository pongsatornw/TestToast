package com.yggdrasil.testlib

import android.content.Context
import android.widget.Toast

object TestToast {

    fun create(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}