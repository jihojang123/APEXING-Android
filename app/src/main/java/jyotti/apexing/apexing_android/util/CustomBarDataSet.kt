package jyotti.apexing.apexing_android.util

import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

class CustomBarDataSet(yVals: List<BarEntry?>?, label: String?) :
    BarDataSet(yVals, label) {
    override fun getEntryIndex(e: BarEntry?): Int {
        return getEntryIndex(e)
    }

    override fun getValueTextColor(index: Int): Int {
        return if (getEntryForIndex(index).y == 0f) {
            mValueColors[0]
        } else {
            mValueColors[1]
        }
    }
}
