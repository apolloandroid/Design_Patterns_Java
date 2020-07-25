package examplechat.technology

import examplechat.chat.Chat

interface Technology {
    var chat: Chat
    fun createConnection() {
        chat.connect()
    }

    fun createChatRoom() {
        chat.createRoom()
    }
}