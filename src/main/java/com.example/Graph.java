package com.example;

public interface Graph<V> {
    /**
     * @param vertex
     * @return false if the vertex is already in the graph.
     * @throws NullPointerException if vertex is null.
     */
    boolean addVertex(V vertex);

    /**
     * @param vertex
     * @return true if the vertex was in the graph.
     * @throws NullPointerException if vertex is null.
     */
    boolean removeVertex(V vertex);

    /**
     * @return false if the edge is already in the graph.
     * @throws NullPointerException if either vertices are null.
     * @throws IllegalArgumentException if either vertices are not in the graph..
     */
    default boolean addEdge(V a, V b){
        return addEdge(new Edge<>(a, b));
    }

    default boolean addEdge(V a, V b, Number weight){
        return addEdge(new Edge<>(a, b, weight));
    }

    boolean addEdge(Edge<V> edge);

    /**
     * @return true if the edge was in the graph.
     * @throws NullPointerException if either vertices are null.
     */
    default boolean removeEdge(V a, V b){
        return removeEdge(new Edge<>(a, b));
    }

    boolean removeEdge(Edge<V> edge);

    /**
     * @param vertex
     * @return true if the vertex is in the graph.
     * @throws NullPointerException if the vertex is null.
     */
    boolean containsVertex(V vertex);

    /**
     * @return true if the edge is in the graph.
     * @throws NullPointerException if either vertices are null.
     */
    default boolean containsEdge(V a, V b){
        return containsEdge(new Edge<>(a, b));
    }

    boolean containsEdge(Edge<V> edge);

    /**
     * @return The number of vertices.
     */
    int size();

    Iterable<V> vertices();
}