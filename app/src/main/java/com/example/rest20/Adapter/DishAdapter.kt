package com.example.rest20.Adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rest20.Model.Dish
import com.example.rest20.R

class DishAdapter(val context: Context, val dishes: List<Dish>): RecyclerView.Adapter<DishAdapter.ProductHolder>(){


    inner  class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dishImage = itemView.findViewById<ImageView>(R.id.dish_image_view)
        val dishName = itemView.findViewById<TextView>(R.id.dish_name)
        val dishPrice = itemView.findViewById<TextView>(R.id.dish_price)
        val dishDesc = itemView.findViewById<TextView>(R.id.dish_description)

        fun bindProduct(dish: Dish, context: Context) {
            val resourceId = context.resources.getIdentifier(dish.image, "drawable", context.packageName)

            dishImage.setImageResource(resourceId)
            dishName.text = dish.name
            dishPrice.text = dish.price
            dishDesc.text = dish.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.dish_item, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(dishes[position], context)
    }

    override fun getItemCount(): Int {
        return dishes.count()
    }
}
