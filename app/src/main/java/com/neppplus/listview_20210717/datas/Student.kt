package com.neppplus.listview_20210717.datas

class Student(
    val name : String,
    val birthYear : Int,
    val address : String) {

//    자신의 출생년도를 가지고 -> (년도를 재료로) 그 해의 나이로 변환해서 결과를 주는 함수 제작.

    fun getAgeByYear(year : Int) : Int {
        val age = year - this.birthYear + 1
        return age
    }

}