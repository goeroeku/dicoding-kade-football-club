package ic.aiczone.cifbclubapps.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by aic on 20/09/18.
 */

@Parcelize
data class Item (val name: String, val image: Int, val description: String) : Parcelable