package examplesocket

object SocketExample {

    @JvmStatic
    fun main(args: Array<String>) {
        val americanPlug = AmericanPlug()
        val socket = AmericanSocket()
        socket.getElectricity(americanPlug)

        val russianPlug = RussianPlug()
        val adapter = Adapter(russianPlug)
        socket.getElectricity(adapter)
    }

    class AmericanSocket {
        fun getElectricity(plug: AmericanPlug) {
            plug.takeElectricity()
        }
    }

    open class AmericanPlug {
        open fun takeElectricity() {
            println("Let there be light American Plug")
        }
    }

    class RussianPlug {
        fun takeElectricity() {
            println("Let there be light Russian Plug")
        }
    }

    class Adapter(val russianPlug: RussianPlug) : AmericanPlug() {

        override fun takeElectricity() {
            russianPlug.takeElectricity()
        }
    }
}