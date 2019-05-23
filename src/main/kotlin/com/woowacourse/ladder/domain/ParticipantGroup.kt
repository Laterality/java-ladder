package com.woowacourse.ladder.domain

class ParticipantGroup(s: String) {
    private val participants: List<Participant>

    init {
        participants = s.split(",")
            .map { it -> Participant(it) }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ParticipantGroup

        if (participants != other.participants) return false

        return true
    }

    override fun hashCode(): Int {
        return participants.hashCode()
    }
}
