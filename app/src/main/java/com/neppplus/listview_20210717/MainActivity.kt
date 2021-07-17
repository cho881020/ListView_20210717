package com.neppplus.listview_20210717

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listview_20210717.adapters.StudentAdapter
import com.neppplus.listview_20210717.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    변수로 mAdapter를 만들어두고 => 나중에 채워주겠다고 명시. (lateinit var)
//     어댑터는 onCreate {} 안에서 채워줘야 정상 동작.
    lateinit var mAdapter : StudentAdapter
    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        만들어둔 ArrayList에 학생 데이터들을 추가.

        mStudentList.add(  Student("조경진", 1988, "서울시 동대문구")  )
        mStudentList.add(  Student("정효균", 1997, "서울시 성북구")  )
        mStudentList.add(  Student("김태섭", 1991, "경기도 평택시")  )
        mStudentList.add(  Student("오준영", 1993, "경기도 용인시")  )
        mStudentList.add(  Student("아이유", 1993, "서울시 송파구")  )
        mStudentList.add(  Student("박보검", 1993, "서울시 동작구")  )
        mStudentList.add(  Student("박보영", 1990, "서울시 서대문구")  )
        mStudentList.add(  Student("박서준", 1988, "경기도 부천시")  )
        mStudentList.add(  Student("김학생", 1995, "서울시 강남구")  )


        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

//        만들어진 mAdapter를 리스트뷰의 어댑터로써 연결.
        studentListView.adapter = mAdapter


    }
}