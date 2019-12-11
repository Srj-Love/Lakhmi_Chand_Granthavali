package com.jks.android.myapplication.model

import java.util.*


class CommentModel @JvmOverloads
constructor(val admin: Boolean ?= false,
            val time: Date ? = Date(),
            val msg: String? = null)