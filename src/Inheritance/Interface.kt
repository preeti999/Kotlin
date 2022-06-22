package Inheritance

//Interface is a group of object based on what they can do rather tham what they are
//To use polymorphism in unrelated set of classes(i.e. classes which do not belong to same inheritance hierarchy)

// Common Terminology - Interface is a contract which states that whoever implements that interface has to provide the implementation for the method

// Interface are meant for behaviors. Classes which exhibits that behaviour implements that interface
// Interface can have both abstract and concrete method
// Interface can implement other interfaces and one class can implement many interface but classes can have only one super class

fun main() {
    dragObject(arrayOf(Circle(4.0),Square(4.0),Triangle(2.0,3.0),Player("preeti")))

}

abstract class Shape : Draggable {
    abstract fun area(): Double
}

interface Draggable {
    fun drag()
}

fun dragObject(objects:Array<Draggable>){
    for (obj:Draggable in objects ){
        obj.drag()
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() = println("Circle is dragging")
}


class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }

    override fun drag() = println("Square is dragging")
}

class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun drag() = println("Triangle is dragging")
}

class Player(val name: String):Draggable{
    override fun drag() = println("$name is dragging")

}