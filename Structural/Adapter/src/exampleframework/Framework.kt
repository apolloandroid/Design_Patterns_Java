package exampleframework

object FrameWork {
    @JvmStatic
    fun main(args: Array<String>) {
        val reactJS = ReactJS()
        reactJS.createApplication(JavaScript())

        reactJS.createApplication(Adapter(Java()))
    }

    open class ReactJS {
        fun createApplication(javaScript: JavaScript) = javaScript.writeCode()
    }

    interface ProgrammingLanguage {
        fun writeCode()
    }

    open class JavaScript : ProgrammingLanguage {
        override fun writeCode() {
            println("I am writing code in JavaScript")
        }
    }

    class Java : ProgrammingLanguage {
        override fun writeCode() {
            println("I am writing code in Java")
        }
    }

    class Adapter(private val java: Java) : JavaScript() {
        override fun writeCode() {
            java.writeCode()
        }
    }
}