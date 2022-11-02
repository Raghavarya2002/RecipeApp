package com.example.recipeapp.interfaces

import android.telecom.Call
import com.example.recipeapp.entities.Category
import com.example.recipeapp.entities.Meal
import com.example.recipeapp.entities.MealResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList():  retrofit2.Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): retrofit2.Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String):  retrofit2.Call<MealResponse>


}