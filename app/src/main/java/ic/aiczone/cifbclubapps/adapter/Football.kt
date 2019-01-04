package ic.aiczone.cifbclubapps.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import ic.aiczone.cifbclubapps.R
import ic.aiczone.cifbclubapps.entity.Item

/**
 * Created by aic on 20/09/18.
 */

class Football(private val context: Context, private val items: List<Item>, private val listener: (Item)-> Unit)
    : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}