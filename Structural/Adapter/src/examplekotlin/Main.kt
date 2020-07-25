package examplekotlin

import kotlin.math.pow
import kotlin.math.sqrt


object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val roundPeg = RoundPeg(2.0)
        val roundHole = RoundHole(2.0)
        if (roundHole.fits(roundPeg)) {
            println("Round peg r ${roundPeg.radius} fits Round hole r ${roundHole.radius}.")
        }

        val squarePeg = SquarePeg(2.0)

        val adapter = SquarePegAdapter(squarePeg)
        if (roundHole.fits(adapter)) println("Square peg w ${squarePeg.width} fits int Round hole r ${roundHole.radius}.")
    }

    class RoundHole constructor(val radius: Double) {
        fun fits(peg: RoundPeg) = radius >= peg.radius
    }

    open class RoundPeg (open val radius: Double = 0.0)

    class SquarePeg(val width: Double = 0.0)

    class SquarePegAdapter (private val squarePeg: SquarePeg) : RoundPeg() {
        override val radius: Double
            get() = sqrt((squarePeg.width / 2).pow(2.0) * 2)
    }
}