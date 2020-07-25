package kotlinexample.cars

data class Car(var mark: String, var carCase: String, var seats: Int, var wheels: Int) : Copyable {
    fun printProperties() {
        println("${this.mark} ${this.carCase} ${this.seats} ${this.wheels}")
    }

    override fun copy(): Any = Car(mark, carCase, seats, wheels)
}