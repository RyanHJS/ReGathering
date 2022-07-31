package com.cmpt362.regathering.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "event_table")
data class Event(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,

    @ColumnInfo(name = "event_type")
    var event_type: String = "",

    @ColumnInfo(name = "event_name")
    var event_name: String = "",

    @ColumnInfo(name = "event_date_and_time")
    var event_date_and_time: String = "",

    )