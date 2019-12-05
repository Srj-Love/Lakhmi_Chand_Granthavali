package com.jks.android.myapplication.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class JsonDataModel {
    

    @SerializedName("DATA")
    @Expose
    private var dataList: MutableList<Data?>? = null

    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("name")
        @Expose
        var name: String? = null
        @SerializedName("dataList")
        @Expose
        var dataList: List<DataStoryList>? = null
    }

    inner class DataStoryList {

        @SerializedName("name")
        @Expose
        var name: String? = null
        @SerializedName("story")
        @Expose
        var story: String? = null

        /*@SerializedName("id")
        @Expose
        var id: Int? = 0*/
    }
}