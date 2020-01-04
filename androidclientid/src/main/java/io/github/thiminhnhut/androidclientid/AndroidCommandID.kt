package io.github.thiminhnhut.androidclientid

import java.util.*

class AndroidCommandID private constructor() {

    private var commandID = Random().nextLong()

    private object Holder {
        val instance = AndroidCommandID()
    }

    companion object {
        val instance: AndroidCommandID by lazy { Holder.instance }
    }

    fun createID(): Long {
        commandID = Random().nextLong()
        return commandID
    }

    fun getID(): Long {
        return commandID
    }

    fun isMatch(id: Long): Boolean {
        return commandID == id
    }
}