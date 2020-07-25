package examplechat.chat

class TextChat(override var connection: Boolean = false, override var roomCount: Int = 0) : Chat {
    override fun connect() {
        println("Text Chat")
        super.connect()
    }

    override fun createRoom() {
        println("Text Chat")
        super.createRoom()
    }
}