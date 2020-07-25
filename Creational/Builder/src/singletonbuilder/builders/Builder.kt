package singletonbuilder.builders

import singletonbuilder.applications.Application

interface Builder {
    fun defineVersion(version: Double)
    fun defineName(name: String)
    fun defineDevelopersQuantity(developersQuantity: Int)
    fun defineOperatingSystem(operatingSystem: String)
    fun defineLanguage(language: String)
    fun getResult(): Application
}