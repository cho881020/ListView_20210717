package com.neppplus.listview_20210717.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listview_20210717.R
import com.neppplus.listview_20210717.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {


//        xml 파일을 => 코틀린에서 사용해서, 이름/나이/거주지 등등을 입혀줘야함.
//        xml 파일을 코틀린으로 가져와주는 도구 (LayoutInflater) 가 우선 필요함.

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        1. convertView에 내용물이 없는 상태라면 (null 상태) => 내용물을 채워주자.

//        convertView를 직접 다루기 까다롭다. => tempRow에 옮겨담아서 사용.
        var tempRow = convertView
        if (tempRow == null) {

//            tempRow가 비어있는 상황. => 내용물 채워주자.
            tempRow = mInflater.inflate(R.layout.student_list_item, null)

        }

//        진짜 row 생성. tempRow가 절대 null 이 아니다.
        val row = tempRow!!


//        row와 + position에 해당하는 학생데이터를 이용해서 => 위치에 맞는 이름 / 나이 / 주소 등을 넣어주자. (Adapter 2차작업)

//        1. 위치에 맞는 학생 데이터 꺼내오기.

        val data = mList[position]

//        2. row (xml) 안에서, 데이터를 반영할 텍스트뷰 / 이미지뷰 등등.

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)


//        3. 각각의 UI에 data변수를 이용한 세팅.
        nameTxt.text = data.name
        addressTxt.text = data.address
        ageTxt.text = "(${data.birthYear})"


//        완성된 row가 결과로 나가도록 지정.
        return row

    }



}