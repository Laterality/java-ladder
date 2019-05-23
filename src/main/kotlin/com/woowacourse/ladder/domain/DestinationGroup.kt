package com.woowacourse.ladder.domain

class DestinationGroup(s: String) {
    private val destinations: List<Destination>

    init {
        destinations = s.split(",")
            .map { it -> Destination(it) }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DestinationGroup

        if (destinations != other.destinations) return false

        return true
    }

    override fun hashCode(): Int {
        return destinations.hashCode()
    }

    override fun toString(): String {
        val sb = StringBuilder().append("DestinationGroup ")
        sb.append(destinations.joinToString(", ", "[ ", " ]") { it -> it.toString() })
        return sb.toString()
    }

}
