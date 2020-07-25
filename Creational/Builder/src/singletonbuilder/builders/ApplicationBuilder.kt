package singletonbuilder.builders

import singletonbuilder.applications.Application

object ApplicationBuilder : Builder {
    lateinit var name: String
    var version: Double = 0.0
    var developersQuantity: Int = 0
    lateinit var operatingSystem: String
    lateinit var language: String

    override fun defineVersion(version: Double) {
        this.version = version
    }

    override fun defineName(name: String) {
        this.name = name
    }

    override fun defineDevelopersQuantity(developersQuantity: Int) {
        this.developersQuantity = developersQuantity
    }

    override fun defineOperatingSystem(operatingSystem: String) {
        this.operatingSystem = operatingSystem
    }

    override fun defineLanguage(language: String) {
        this.language = language
    }

    override fun getResult() = Application(name, version, developersQuantity, operatingSystem, language)
}