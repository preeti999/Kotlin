import javax.naming.NameParser

fun main() {
    val car = AutoMobile("Car", 4, 5, "petrol")
    val car2 = AutoMobile("Car2", "petrol")


//    car.hasAirBags
//    var p1 = Persons("A", 3)
//    println(p1.name)
//    println(p1.age)


}


//class AutoMobile(val name: String, val tyres: Int, val maxSeating: Int, hasAirBags: Boolean) { //Primary constructor
//    init {
//        println("$name is created")
//    }
//    var hasAirBags=hasAirBags
//
//    init {
//        println("Second initializer block")
//    }
//
//    fun drive() {}
//    fun applyBreaks() {}
//}


//Secondary constructor
class AutoMobile(val name: String, val tyres: Int, val maxSeating: Int, val engineType: String) {
    init {
        println("$name is created")
    }

    init {
        println("Second initializer block")
    }

    constructor(nameParam: String, engineParam: String) :
            this(nameParam, 4, 5, engineParam)

    fun drive() {}
    fun applyBreaks() {}
}


//
//class Empty {}
//
//class Persons(nameParam: String, ageParam: Int) { //Default constructor
//    val name: String = "$nameParam - Clan"
//    var age: Int = ageParam
//}