package com.jks.android.myapplication.utils

import android.content.Context
import android.content.SharedPreferences
import com.jks.android.myapplication.R

class UserPref(context: Context) {

    val sharedPreferences: SharedPreferences by lazy {
        context.getSharedPreferences(context.getString(R.string.user_pref), Context.MODE_PRIVATE)
    }

    var isAdmin: Boolean // to check if is admin
        get() = sharedPreferences.getBoolean("isAdmin", false)
        set(value) = sharedPreferences.edit().putBoolean("isAdmin", value).apply()





    companion object {
        private var userPreference: UserPref? = null

        fun getInstance(context: Context): UserPref {
            if (userPreference == null) {
                userPreference = UserPref(context)
            }
            return userPreference as UserPref
        }
    }

}
