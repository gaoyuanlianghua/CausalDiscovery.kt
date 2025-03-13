package com.example.causaldiscovery

object CausalLite {
    fun discover(data: CausalDataset, maxEdges: Int): CausalGraph {
        // 模拟本地轻量级因果发现过程
        val edges = mutableListOf<Pair<String, String>>()
        for (i in data.variables.indices) {
            for (j in i + 1 until data.variables.size) {
                if (edges.size >= maxEdges) break
                edges.add(Pair(data.variables[i], data.variables[j]))
            }
        }
        return CausalGraph(edges)
    }
}