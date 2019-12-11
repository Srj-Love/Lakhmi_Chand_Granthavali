package com.jks.android.myapplication.model

import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.ServerTimestamp
import java.util.*


data class CommentModel(val isAdmin: Boolean = false,
                        val time: Date = Date(),
                        val msg: String)