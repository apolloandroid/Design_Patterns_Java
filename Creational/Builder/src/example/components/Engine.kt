package example.components

class Engine(val volume: Double, var mileage: Double) {
    var isStarted = false
        private set

    fun on() {
        isStarted = true
    }

    fun off() {
        isStarted = false
    }

    fun go(mileage: Double) {
        if (isStarted) this.mileage += mileage else println("Can not go(), you must start engine first!")
    }

}