package examplekotlin.server

import examplejava.middleware.Middleware

class Server {
    private val users = HashMap<String, String>()
    private lateinit var middleware: Middleware


}