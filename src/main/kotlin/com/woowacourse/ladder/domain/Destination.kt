package com.woowacourse.ladder.domain

import java.util.*

class Destination(destination: String) {
    private val destination = Optional.of(destination)
        .map(String::trim)
        .filter(String::isNotEmpty)
        .orElseThrow {
            throw IllegalArgumentException("Invalid destination: $destination")
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Destination

        if (destination != other.destination) return false

        return true
    }

    override fun hashCode(): Int {
        return destination.hashCode()
    }

    override fun toString(): String {
        return destination
    }
}
