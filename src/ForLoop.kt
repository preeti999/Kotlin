fun main() {
    for (i in 1..10 step 2) {
        // println(i)
    }

    println("Until")
    for (i in 1 until 5) {
        // println(i)
    }

    //Decrement for loop
    for (i in 10 downTo 1 step 2) {
        // println(i)
    }

    //String Templating
    val number = 2
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}