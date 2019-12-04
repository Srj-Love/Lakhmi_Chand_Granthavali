package com.jks.android.myapplication.model

data class SongDataModel(val id: Int? = null,
                         val name: String? = null,
                         val subName: List<ChildSongModel>? = null )

data class ChildSongModel(val id: Int, val name: String, val Story: String? = null)