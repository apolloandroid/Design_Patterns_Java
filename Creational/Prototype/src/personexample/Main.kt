package personexample

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val person = Person(readLine(), readLine()!!.toInt(), readLine(), readLine())
        person.ptintroperties()
        val copy = person.copy()
        copy.ptintroperties()
    }
}