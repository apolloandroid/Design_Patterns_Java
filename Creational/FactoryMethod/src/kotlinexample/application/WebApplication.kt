package kotlinexample.application

class WebApplication : Application {
    override fun install() {
        println("Поздравляем, Web-приложение успешно установлено!")
    }

    override fun run() {
        println("Web-приложение запущено!")
    }
}