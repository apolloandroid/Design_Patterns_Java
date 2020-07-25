package personexample

class Person(var name: String?, var age: Int, var sex: String?, var job: String?) : Copyable {

    override fun copy(): Person {
        return Person(this.name, this.age, this.sex, this.job)
    }

    fun ptintroperties() {
        println("$name, $age, $sex, $job")
    }
}