package org.unicauca.common.util

import android.support.design.widget.TextInputLayout

fun TextInputLayout.text():String = editText?.text.toString()