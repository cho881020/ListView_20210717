package com.neppplus.listview_20210717.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.listview_20210717.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {


}