fun main() {
    printMessage(2)
    printMessage()
}

//Default arguments
fun printMessage(count: Int = 2) {
    for (i in 1..count) {
        println("Hello $i")
    }
}


fun add(num1: Int, num2: Int) = num1 + num2

