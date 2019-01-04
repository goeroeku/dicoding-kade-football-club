package ic.aiczone.cifbclubapps.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import ic.aiczone.cifbclubapps.entity.Item
import kotlinx.android.synthetic.main.item_list.view.*

/**
 * Created by aic on 20/09/18.
 */

class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    fun bindItem(item: Item, listener: (Item) -> Unit) {
        itemView.name.text = item.name
        Glide.with(itemView.context).load(item.image).into(itemView.image)

        itemView.setOnClickListener {
            listener(item)
        }
    }
}