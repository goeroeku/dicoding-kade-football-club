package ic.aiczone.cifbclubapps

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import ic.aiczone.cifbclubapps.R.array.*
import ic.aiczone.cifbclubapps.adapter.Football
import ic.aiczone.cifbclubapps.entity.Item
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

/**
 * Created by aic on 20/09/18.
 */

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        club_list.layoutManager = LinearLayoutManager(this)
        club_list.adapter = Football(this, items) { itemClicked(it) }

    }

    private fun initData(){
        val name = resources.getStringArray(club_name)
        val image = resources.obtainTypedArray(club_image)
        val description = resources.getStringArray(club_desc)
        items.clear()
        for (i in name.indices) {
            items.add(Item(name[i],
                    image.getResourceId(i, 0), description[i]))
        }

        //Recycle the typed array
        image.recycle()
    }

    private fun itemClicked(items : Item) {
        startActivity<DetailActivity>(DetailActivity.TITLE to items.name, DetailActivity.IMAGE to items.image, DetailActivity.DESCRIPTION to items.description)
    }
}
