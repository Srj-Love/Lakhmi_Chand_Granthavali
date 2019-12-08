package com.jks.android.myapplication.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build
import com.jks.android.myapplication.model.JsonDataModel
import com.jks.android.myapplication.utils.Constants
import com.jks.android.myapplication.utils.DBConstant

class SqlDbHelper(context: Context?) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {
    private val can_null: String? = null


    override fun onCreate(db: SQLiteDatabase) { // creating LOGIN table
        db.execSQL("CREATE TABLE " + TABLE_RAGINI + "("
                + DBConstant._ID + " integer primary key autoincrement" + " , "
                + DBConstant.ID + " integer " + " , "
                + DBConstant.SUB_ID + " integer " + " , "
                + DBConstant.NAME + " VARCHAR(250) " + "); "
        )

        db.execSQL("CREATE TABLE " + TABLE_RAGINI_STORY + "("
                + DBConstant.ID + " integer" + " , "
                + DBConstant.SUB_ID + " integer " + " , "
                + DBConstant.SUB_NAME + " VARCHAR(250) " + " , "
                + DBConstant.STORY + " TEXT   " + "); "
        )
    }

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS $TABLE_RAGINI")
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS $TABLE_RAGINI_STORY")
        onCreate(sqLiteDatabase)
    }

    override fun onConfigure(db: SQLiteDatabase) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            db.setForeignKeyConstraintsEnabled(true)
        }
    }

    fun addData(model: JsonDataModel.Data): Long? {

        val db = this.writableDatabase

        // Create a new map of values, where column names are the keys
        val values = ContentValues().apply {
            put(DBConstant.ID, model.id)
            put(DBConstant.SUB_ID, model.dataList!![0].id)
            put(DBConstant.NAME, model.name)

        }

        val childValues = ContentValues().apply {
            put(DBConstant.ID, model.id)
            put(DBConstant.SUB_ID, model.dataList!![0].id)
            put(DBConstant.SUB_NAME, model.dataList!![0].name)
            put(DBConstant.STORY, model.dataList!![0].story)
        }

        // Insert the new row, returning the primary key value of the new row
        val newRowId = db?.insert(TABLE_RAGINI, null, values)
        val newRowIdChild = db?.insert(TABLE_RAGINI_STORY, null, childValues)



        return newRowId

    }

    fun readAllData(): ArrayList<JsonDataModel.Data> {

        val db = this.readableDatabase

        // How you want the results sorted in the resulting Cursor
        val sortOrder = "${DBConstant.ID} ASC"

//        val cursor = db.query(TABLE_RAGINI,
//                null,
//                null,
//                null,
//                null,
//                null,
//                sortOrder
//        )

        val sql = "select DISTINCT ${DBConstant.ID}, ${DBConstant.NAME}" +
                " FROM $TABLE_RAGINI a ORDER BY $sortOrder "
        println(sql)
        val cursor = db.rawQuery(sql, null)

        val itemIds = mutableListOf<JsonDataModel.Data>()

        with(cursor) {
            while (moveToNext()) {

                val itemId = getInt(getColumnIndexOrThrow(DBConstant.ID))
                val itemName = getString(getColumnIndexOrThrow(DBConstant.NAME))


                //val itemSubId = getInt(getColumnIndexOrThrow(DBConstant.SUB_ID))
                //val itemSubName = getString(getColumnIndexOrThrow(DBConstant.SUB_NAME))
                //val itemStory = getString(getColumnIndexOrThrow(DBConstant.STORY))

                val selection = "${DBConstant.ID}=?  "


                val model = JsonDataModel.Data().apply {
                    id = itemId
                    name = itemName
                    dataList = readSingleData(selection, arrayOf(itemId.toString()), DBConstant.SUB_ID)
//                    dataList = null
                }

                itemIds.add(model)
            }
        }

        return itemIds as ArrayList<JsonDataModel.Data>

    }


    fun readSingleData(sel: String, selectionArg: Array<String?>, order: String): List<JsonDataModel.DataStoryList>? {

        val db = this.readableDatabase

        val projection = arrayOf(DBConstant.ID, DBConstant.SUB_ID, DBConstant.SUB_NAME, DBConstant.STORY)

        // Filter results WHERE "title" = 'My Title'
        val selection = sel
        val selectionArgs = selectionArg

// How you want the results sorted in the resulting Cursor
        val sortOrder = "$order ASC"

        val cursor = db.query(
                TABLE_RAGINI_STORY,   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                selection,              // The columns for the WHERE clause
                selectionArgs,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
        )

        val itemIds = mutableListOf<JsonDataModel.DataStoryList>()

        with(cursor) {
            while (moveToNext()) {
                val itemSubId = getInt(getColumnIndexOrThrow(DBConstant.SUB_ID))
                val itemSubName = getString(getColumnIndexOrThrow(DBConstant.SUB_NAME))
                val itemStory = getString(getColumnIndexOrThrow(DBConstant.STORY))

                val model = JsonDataModel.DataStoryList().apply {
                    id = itemSubId
                    name = itemSubName
                    story = itemStory
                }

                itemIds.add(model)
            }
        }

        return itemIds

    }

    fun removeBookmark(id: Int): Int {
        val db = this.writableDatabase

        val selection = "${Constants.SUB_ID} =? "

        val selectionArgs = arrayOf(id.toString())

        db.delete(TABLE_RAGINI, selection, selectionArgs)
        return db.delete(TABLE_RAGINI_STORY, selection, selectionArgs)
    }

    companion object {
        private const val DB_NAME = "ragini.db"
        private const val DB_VERSION = 1
        private const val on_foreign_key = "PRAGMA foreign_keys=ON;"

        //  TABLES
        const val TABLE_RAGINI = "RAGINI"
        const val TABLE_RAGINI_STORY = "STORY"
    }
}