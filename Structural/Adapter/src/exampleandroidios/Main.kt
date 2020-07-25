package exampleandroidios

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val iosActivity = IOSActivity()
        iosActivity.drawView(IOSView())
        println()
        val adapter = Adapter(AndroidView())
        iosActivity.drawView(adapter)
    }

    class IOSActivity {
        fun drawView(view: IOSView) {
            println("IOS View Drawing")
            view.create()
            println("IOS View Drew")
        }
    }
}

open class IOSView {
    open fun create() {
        println("IOS View created!")
    }
}

class AndroidView {
    fun create() {
        println("Android View created!")
    }
}

class Adapter(private val androidView: AndroidView) : IOSView() {
    override fun create() {
        androidView.create()
    }
}
