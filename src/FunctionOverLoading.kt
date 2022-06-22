import kotlin.math.pow

fun main() {
//    println(addition(4,5))
//    println(addition(2.33,7.4))

    var fn = ::addition
    println(fn(1.0, 2.8))

    fn = ::power
    println(fn(2.0, 3.0))
}

fun addition(a: Double, b: Double): Double {
    return a + b
}

//fun addition(a: Double, b: Double): Double {
//    return a+b;
//}

fun power(a: Double, b: Double): Double {
    return a.pow(b)
}