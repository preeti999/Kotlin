//In Kotlin, abstract class is declared using the abstract keyword in front of class.
// An abstract class can not instantiate means we can not create object for the abstract class.


// abstract class
abstract class Calculator {
    abstract fun cal(x: Int, y: Int): Int
}

// addition of two numbers
class Add : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x + y
    }
}

// subtraction of two numbers
class Sub : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x - y
    }
}

// multiplication of two numbers
class Mul : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x * y
    }
}

fun main(args: Array<String>) {
    val add: Calculator = Add()
    val x1 = add.cal(4, 6)
    println("Addition of two numbers $x1")
    val sub: Calculator = Sub()
    val x2 = sub.cal(10, 6)
    println("Subtraction of two numbers $x2")
    val mul: Calculator = Mul()
    val x3 = mul.cal(20, 6)
    println("Multiplication of two numbers $x3")
}