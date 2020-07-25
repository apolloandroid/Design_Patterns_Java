package examplekotlin

data class VideoFile(
        val name: String,
        val codectype: String = name.substring(name.indexOf(".") + 1)
)