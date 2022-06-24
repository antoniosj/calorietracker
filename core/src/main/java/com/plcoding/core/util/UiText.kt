package com.plcoding.core.util

import android.content.Context

/*
* As view model doesn't have context we can create this util class so it can be passed
* in the UI. With this we can add the string to the resource folder and call from the viewmodel
* in a SnackBar or something
*  */
sealed class UiText {
    data class DynamicString(val text: String) : UiText()
    data class StringResource(val resId: Int) : UiText()

    fun asString(context: Context): String {
        return when(this) {
            is DynamicString -> text
            is StringResource -> context.getString(resId)
        }
    }
}