package examplekotlin.server

import examplejava.middleware.Middleware

class Server {
    private val users = HashMap<String, String>()
    lateinit var middleware: Middleware

    fun logIn(email: String, password: String): Boolean {
        if (middleware!!.check(email, password)) {
            println("Authorization have been successful!")
            return true
        }
        return false
    }

    fun register(email: String, password: String) {
        users[email] = password
    }

    fun hasEmail(email: String) = users.containsKey(email)

    fun isValid(email: String?, password: String) = users[email] == password
}