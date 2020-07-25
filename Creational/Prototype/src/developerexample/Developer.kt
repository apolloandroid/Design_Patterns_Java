package developerexample

class Developer(var name: String?,
                var language: String?,
                var education: String?,
                var experience: Double?,
                var platform: String?) : Copyable {
    override fun copy(): Any {
        return Developer(name, language, education, experience, platform)
    }

    fun printProperties() {
        println("Name: $name, language: $language, education: $education, experience: $experience, platform: $platform ")
    }
}