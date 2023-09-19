package KaKao_Internship2021_숫자문자열과영단어

class Solution{
  fun solution(s:String): Int{
    val nums=arrayOf("zero","one","two", "three", "four", "five", "six", "seven", "eight", "nine")
    val str=s
    for (i in 0 until nums.size){
      str=str.replace(nums[i], i.toString()) //s에 담긴 영단어를 숫자로 바꿔준다
    }
    return str.toInt()
  }
}
