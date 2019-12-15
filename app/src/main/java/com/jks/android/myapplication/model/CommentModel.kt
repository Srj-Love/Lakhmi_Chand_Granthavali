package com.jks.android.myapplication.model

import com.google.firebase.database.ServerValue
import com.google.firebase.database.core.ServerValues
import java.util.*


class CommentModel @JvmOverloads
constructor(val admin: Boolean ?= false,
            val timestamp: MutableMap<String, Any>? = mutableMapOf(),
            val msg: String? = null)