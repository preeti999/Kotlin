fun main() {
    //Parameter less constructor
//    val ob=Calculater()
//    println(ob.add(2,4))

    val p1 = Person1("preeti", 23)
    println(p1.age)
    p1.age = 23
    p1.age = -12
    println(p1.name)

}

class Person1(nameParam: String, ageParam: Int) {
    var name: String = nameParam
        //Getter
        get() {
            println("Name Gatter is called")
            return field.toUpperCase()
        }

    var age: Int = ageParam
        //Setter
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Age can't be nagative")
            }
        }

    var email: String = ""
        get() = field
        set(value) {
            field = value
        }
}


//-----------------------------------------------------------------------------//
//class Calculater{   //Default Constructor
//
//    //To avoid the run time errors you need to give some initial values to the variable
//    //when user don't know the initial value then we can declear the variable as *lateinit var*
//    // lateinit var -> always be var type
//    lateinit var message:String
//
//    fun add(a:Int,b:Int):Int{
//        return a+b
//    }
//    fun multifly(a:Int,b:Int):Int{
//        return a*b
//    }
//}

//---------------------------------------------------------------------------//