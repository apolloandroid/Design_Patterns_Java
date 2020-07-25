package examplechat

import examplechat.chat.Chat
import examplechat.chat.TextChat
import examplechat.chat.VideoChat
import examplechat.technology.Technology
import examplechat.technology.WebRTC
import examplechat.technology.WebSockets

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        testTechnology(VideoChat())
        testTechnology(TextChat())
    }

    private fun testTechnology(chat: Chat) {
        var technology: Technology = WebRTC(chat)
        technology.createChatRoom()
        technology.createConnection()

        technology = WebSockets(chat)
        technology.createChatRoom()
        technology.createConnection()
    }
}