package ru.mmurzin.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage(
    private val context: Context,
    private val message: String
) {

    fun showLong() {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun showShort() {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}