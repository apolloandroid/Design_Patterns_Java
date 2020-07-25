package examplechat.technology

import examplechat.chat.Chat

class WebRTC(override var chat: Chat) :Technology {
    override fun createConnection() {
        println("WebRTC Technology")
        super.createConnection()
    }

    override fun createChatRoom() {
        println("WebRTC Technology")
        super.createChatRoom()
    }
}