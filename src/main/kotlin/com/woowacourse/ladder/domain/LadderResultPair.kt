package com.woowacourse.ladder.domain

class LadderResultPair {
    private val pairs = HashMap<String, String>()

    fun addPair(participant: String, destination: String) {
        pairs.put(participant, destination)
    }

    fun getMatchDestination(participant: String): String {
        return pairs.get(participant)
            ?: throw IllegalArgumentException("Matching destination is not found: $participant")
    }
}
