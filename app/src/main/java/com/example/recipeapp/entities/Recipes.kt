package com.example.recipeapp.entities
import java.io.Serializable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Recipies")
data class Recipes(
    @PrimaryKey(autoGenerate = true)
    var id : Int,

    @ColumnInfo(name = "dishName")
    var dishName: String

) : Serializable