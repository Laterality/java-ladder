package com.woowacourse.ladder.domain

import java.util.*

class Participant(
    name: String
) {
    private val name: String

    init {
        this.name = Optional.of(name)
            .map(String::trim)
            .filter(String::isNotEmpty)
            .filter(this::checkIfOverLength)
            .orElseThrow {
                throw IllegalArgumentException("Invalid participant name: $name")
            }

    }

    private fun checkIfOverLength(name: String): Boolean {
        return name.length <= 5
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Participant

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return name
    }
}
