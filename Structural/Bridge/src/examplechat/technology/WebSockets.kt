package examplechat.technology

import examplechat.chat.Chat

class WebSockets(override var chat: Chat) : Technology {
    override fun createConnection() {
        println("WebSockets Technology")
        super.createConnection()
    }

    override fun createChatRoom() {
        println("WebSockets Technology")
        super.createChatRoom()
    }
}