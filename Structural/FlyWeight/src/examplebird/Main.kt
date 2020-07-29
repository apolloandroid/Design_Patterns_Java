package examplebird

import examplebird.bird.BirdFactory

object Main {
    private val colors = arrayOf("Red", "Orange", "Blue", "Yellow")

    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 0..20) {
            val angryBird = BirdFactory.getAngryBird(getRandomColor())
            angryBird.draw()
        }
    }

    private fun getRandomColor(): String {
        return colors[(Math.random() * colors.size).toInt()]
    }
}