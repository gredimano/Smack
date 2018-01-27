package com.redredimano.smack.Model

/**
 * Created by red on 27/01/2018.
 */
class Channel(val name: String, val description: String, val id: String) {

    override fun toString(): String {
        return "#$name"
    }
}