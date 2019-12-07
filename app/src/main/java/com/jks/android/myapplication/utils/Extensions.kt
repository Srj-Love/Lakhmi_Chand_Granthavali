package com.jks.android.myapplication.utils

import android.content.Context
import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject

// convert GSON object to JSON string
fun Context.convertToJson(obj: Any): JsonObject? = Gson().toJsonTree(obj).asJsonObject

// convert to GSON Array to JSON string
fun Context.convertToJsonArray(obj: List<Any>): JsonArray? = Gson().toJsonTree(obj).asJsonArray
