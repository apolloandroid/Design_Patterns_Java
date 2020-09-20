package examplekotlin.middleware

abstract class Middleware {
    private lateinit var next: Middleware
    fun linkWith(next: Middleware): Middleware {
        this.next = next
        return next
    }

    abstract fun check(email: String, password: String): Boolean

    protected open fun checkNext(email: String, password: String): Boolean {
        return if (next == null) true else next.check(email, password)
    }
}