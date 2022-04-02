
class Car (var brand: String, var model: String, var year: Int) {
    //fungsi class
    fun drive() {
        println("Ngeeng")
    }


    //class dengan parameter
    fun speed(maxSpeed: Int) {
        println("Max speed is :" + maxSpeed)
    }



}
fun main () {
    var c1 = Car("Ford", "Mustang", 1969)
    val c2 = Car("BMW", "X5", 1999)
    val c3 = Car("Tesla", "Model 5", 2020)

    c1.drive()
    c1.speed(200)
}
