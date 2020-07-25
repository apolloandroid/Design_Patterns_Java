package developerexample

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val developer = Developer(readLine(), readLine(), readLine(), readLine()!!.toDouble(), readLine())
        developer.printProperties()
        val copy = developer.copy() as Developer
        copy.printProperties()
        with(copy) {
            name = "Vladimir"
            language = "Swift"
            education = "Higher technical"
            experience = 8.0
            platform = "iOS"
            printProperties()
        }
        developer.printProperties()
    }
}