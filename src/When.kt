fun main() {
    val animal = "Dog"

    //#1
    //Improve the readability
//    when (animal) {
//        "Dog" -> println("Animal is Dog")
//        "Horse" -> println("Animal is Horse")
//        "Cat" -> println("Animal is Cat")
//        else-> println("Animal Not found")
//    }

    //#2
    //---To use this as a expression
    val result = when (animal) {
        "Dog" -> "Animal is Dog"
        "Horse" -> "Animal is Horse"
        "Cat" -> "Animal is Cat"
        else -> "Animal Not found"
    }
    println(result)


    //#3
    val num = 15
    val output = when (num) {
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "Not in range"

    }
    println(output)

}