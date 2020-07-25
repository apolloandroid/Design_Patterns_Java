package examplephone

object PhoneExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val phone = Phone()
        val typeC = TypeC()
        phone.charge(typeC)
        val usb2 = USB2()
        val adapter = Adapter(usb2)
        phone.charge(adapter)
    }

    class Phone {
        fun charge(usb: TypeC) {
            usb.connect()
            println("Phone is charging")
        }
    }

    open class TypeC {
        open fun connect() {
            println("TypeC is connecting!")
        }
    }

    class USB2 {
        fun connect() {
            println("USB2 is connecting!")
        }
    }

    class Adapter(private val usb2: USB2) : TypeC() {
        override fun connect() = usb2.connect()
    }
}