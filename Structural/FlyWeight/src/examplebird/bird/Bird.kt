package examplebird.bird

interface Bird {
    fun draw()
}


data class AngryBird(private var color: String) : Bird {
    override fun draw() {
        println("Angry bird: draw, color: $color")
    }
}
