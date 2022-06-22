fun main() {
    val num=5
    val result=num in 1..5 // 1,2,3,4,5
    val newResult = num in 1 until 5 //1,2,3,4
    println(result)
    println(newResult)
}