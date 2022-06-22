fun main() {
    val mustang = Car("mustang", "petrol", 200)
    val beetle = Car("beetle", "diesel", 300)

    println(mustang.name)
    println(mustang.type)

    println(beetle.name)

    mustang.driveCar()
    beetle.applyBreak()
}

class Car(val name: String, val type: String, var knRan: Int)  //properties
{
    fun driveCar() //methods
    {
        println("$name car is driving")
    }

    fun applyBreak() {
        println("$name Applied Break")
    }

}