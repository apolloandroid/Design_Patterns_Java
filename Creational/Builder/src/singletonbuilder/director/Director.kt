package singletonbuilder.director

import singletonbuilder.builders.ApplicationBuilder

class Director {

    fun createAndroidApplication(builder: ApplicationBuilder) {
        builder.defineVersion(0.0)
        builder.defineName("Android application")
        builder.defineDevelopersQuantity(2)
        builder.defineOperatingSystem("Android")
        builder.defineLanguage("Kotlin")
    }

    fun createIosApplication(builder: ApplicationBuilder) {
        builder.defineVersion(0.0)
        builder.defineName("iOS application")
        builder.defineDevelopersQuantity(2)
        builder.defineOperatingSystem("iOS")
        builder.defineLanguage("Swift")
    }

    fun createDesktopApplication(builder: ApplicationBuilder) {
        builder.defineVersion(0.0)
        builder.defineName("Desktop application")
        builder.defineDevelopersQuantity(4)
        builder.defineOperatingSystem("Windows")
        builder.defineLanguage("C#")
    }
}