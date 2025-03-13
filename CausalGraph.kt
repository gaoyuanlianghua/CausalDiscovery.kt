package com.example.causaldiscovery

data class CausalGraph(val edges: List<Pair<String, String>>) {
    override fun toString(): String {
        return "CausalGraph(edges=$edges)"
    }

    fun copy(): CausalGraph {
        return CausalGraph(edges.map { it })
    }
}