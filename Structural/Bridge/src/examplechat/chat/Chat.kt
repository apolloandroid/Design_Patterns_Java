package examplechat.chat

interface Chat {
    var connection: Boolean
    var roomCount: Int
    fun connect() {
        connection = true
        println(connection)
    }

    fun createRoom() {
        roomCount++
        println(roomCount)
    }
}