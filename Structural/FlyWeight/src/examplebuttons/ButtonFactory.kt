package examplebuttons


class ButtonFactory {
    companion object {
        private val buttonFlyWeights: HashMap<String, ButtonFlyWeight> = HashMap()
        fun getButtonFlyWeight(text: String): ButtonFlyWeight {
            var result: ButtonFlyWeight? = buttonFlyWeights[text]
            if (result == null) {
                result = ButtonFlyWeight(text)
                buttonFlyWeights[text] = result
            }
            return result
        }

        fun printButtonFlyWeightSize() {
            println("${buttonFlyWeights.size}")
        }
    }
}