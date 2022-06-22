fun main() {
    var arr: Array<String> = arrayOf("one", "two", "three")
    var arr2: Array<Int> = arrayOf(1, 2, 3)
    var arr3: Array<Int> = arrayOf(4, 5, 6)

//    for(i in arr){
//        println(i)
//    }

    for ((i, e) in arr.withIndex()) {
        println("$i - $e")
    }

    println(arr[0])
    println(arr.get(1))
    arr.set(0, "Hello")
    println(arr[0])
    println(arr.size)
}