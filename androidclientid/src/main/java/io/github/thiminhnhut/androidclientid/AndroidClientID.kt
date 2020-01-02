package io.github.thiminhnhut.androidclientid

import java.util.*

class AndroidClientID private constructor() {

    private var clientID = UUID.randomUUID().toString()

    private object Holder {
        val instance = AndroidClientID()
    }

    companion object {
        val instance: AndroidClientID by lazy { Holder.instance }
    }

    fun createID(): String {
        clientID = UUID.randomUUID().toString()
        return clientID
    }

    fun getID(): String {
        return clientID
    }

    fun isMatch(id: String): Boolean {
        return clientID == id
    }
}