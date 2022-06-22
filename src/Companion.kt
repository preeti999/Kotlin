fun main() {
    //MyClass.MyObject.functionJoMyClassMAiHai()
    MyClass.functionJoMyClassMAiHai()
    MyClass.AnotherObject.MyClassKeAndarDusraFunction()
    MyClass.ThirdObject.MyClassKeAndarTisraFunction()
}

class MyClass {
     companion object MyObject {
        fun functionJoMyClassMAiHai() {
            println("Hello i am function from MyClass");
        }
    }
    object AnotherObject {
        fun MyClassKeAndarDusraFunction() {
            println("Hello i am function from Another class")
        }
    }

    object ThirdObject {
        fun MyClassKeAndarTisraFunction() {
            println("Hello i am function from Another class")
        }
    }
}

