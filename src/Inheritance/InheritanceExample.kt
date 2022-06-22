package Inheritance

fun main() {
    val objChild = Child()
    objChild.parentConstructor()
    objChild.childConstructor()

}

open class Parent {
    init {
        println("Parent constructor called")
    }

    fun parentConstructor() {
        println("Hello from Parent")
    }
}

class Child : Parent() {
    init {
        println("Child constructor called")
    }

    fun childConstructor() {
        println("Hello from Child")
    }
}