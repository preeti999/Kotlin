@file:Suppress("IMPLICIT_CAST_TO_ANY")

fun main() {

    //#1
    val isRaining = true

    if (isRaining) {
        println("Take Umbrella")
    } else {
        println("NoRains -- Enjoy your day")
    }

    //#2
    val x = 10
    val y = 20
    val result = if (x > y) {
        "X is grater"
    } else if (x < y) {
       "Y is grater"
    } else {
        "X and Y both are equal"
    }
    println(result)


    //#3
    val number=21
    val Results=if(number%2==0) "Even" else "Odd"
    println(Results)
}