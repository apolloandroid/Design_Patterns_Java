package examplebird.bird

class BirdFactory {
    companion object {
        val angryBirdsMap = HashMap<String, Bird>()

        fun getAngryBird(color: String): Bird {
            var angryBird = angryBirdsMap[color]
            if (angryBird == null) {
                angryBird = AngryBird(color)
                angryBirdsMap[color] = angryBird
                println("Created angryBird, color: $color")
            }
            return angryBird
        }
    }
}