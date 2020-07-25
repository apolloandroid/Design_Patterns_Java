package kotlinexample.application

class MobileApplication : Application {
    override fun install() {
        println("Поздравляем, мобильное приложение успешно установлено!")
    }

    override fun run() {
        println("Мобильное приложение запущено!")
    }
}