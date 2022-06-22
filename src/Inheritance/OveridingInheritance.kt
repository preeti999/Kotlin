package Inheritance

fun main() {
    val onePlus = OnePlus("SmartPhone")
    onePlus.display()
    val generalMobile = Mobile("General")
    generalMobile.display()
    println(onePlus.toString())

}

open class Mobile(val type: String) {
    open val name: String = ""
    open val size: Int = 5
    fun makeCall() = println("Calling from Mobile")
    fun powerOff() = println("Shutting down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus(typeParam: String) : Mobile(typeParam) {
    override val name: String = "One Plus"
    override val size: Int = 6
    override fun display() {
        super.display()
        println("One PLus Display")
    }

}