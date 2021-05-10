package com.yggdrasil.testlib

import android.content.Context
import android.content.Intent
import android.widget.Toast

object TestToast {

    fun create(context: Context, text: String) {
        context.startActivity(Intent(context, MainActivity2::class.java))
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}