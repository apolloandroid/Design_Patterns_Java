package singletonbuilder.applications

data class Application constructor(
        var name: String,
        var version: Double,
        var developersQuantity: Int,
        var operatingSystem: String,
        var language: String) {

    fun printProperties() {
        println("$name $version $developersQuantity, $operatingSystem, $language")
    }
}