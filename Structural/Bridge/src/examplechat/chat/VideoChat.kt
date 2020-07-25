package examplechat.chat

class VideoChat(override var connection: Boolean = false, override var roomCount: Int = 0) : Chat {
    override fun connect() {
        println("VideoChat")
        super.connect()
    }

    override fun createRoom() {
        println("VideoChat")
        super.createRoom()
    }
}