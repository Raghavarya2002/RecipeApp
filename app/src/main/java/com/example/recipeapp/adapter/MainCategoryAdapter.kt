package com.example.recipeapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recipeapp.R
import com.example.recipeapp.entities.CategoryItems
import kotlinx.android.synthetic.main.item_main_category.view.*

class MainCategoryAdapter : RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>() {

    var listener: OnItemClickListener? = null
    var ctx: Context? = null
    var arrayMainCategory = ArrayList<CategoryItems>()

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    fun setData(arrayData: List<CategoryItems>) {
        arrayMainCategory = arrayData as ArrayList<CategoryItems>
    }

    fun setClickListener(listener1: OnItemClickListener) {
        listener = listener1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        ctx = parent.context
        return RecipeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_main_category, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return arrayMainCategory.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        holder.itemView.tv_dish_name.text = arrayMainCategory[position].strcategory
        Glide.with(ctx!!).load(arrayMainCategory[position].strcategorythumb)
            .into(holder.itemView.img_dish)
        holder.itemView.rootView.setOnClickListener {
            listener!!.onClicked(arrayMainCategory[position].strcategory)
        }
    }

    interface OnItemClickListener {
        fun onClicked(categoryName: String)
    }
}