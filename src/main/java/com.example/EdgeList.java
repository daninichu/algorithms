package com.example;

import java.util.ArrayList;
import java.util.List;

public class EdgeList<V> implements Graph<V>{
    private List<V> vertices = new ArrayList<V>();
    private List<Edge<V>> edges = new ArrayList<>();

    @Override
    public boolean addVertex(V vertex){
        if(vertex == null)
            throw new NullPointerException("vertex is null");
        return !vertices.contains(vertex) && vertices.add(vertex);
    }

    @Override
    public boolean removeVertex(V vertex){
        return vertices.remove(vertex);
    }

    @Override
    public boolean addEdge(Edge<V> edge){
        if(edge == null)
            throw new NullPointerException("edge is null");
        return !edges.contains(edge) && edges.add(edge);
    }

    @Override
    public boolean removeEdge(Edge<V> edge){
        return edges.remove(edge);
    }

    @Override
    public boolean containsVertex(V vertex){
        return vertices.contains(vertex);
    }

    @Override
    public boolean containsEdge(Edge<V> edge){
        return edges.contains(edge);
    }

    @Override
    public int size(){
        return vertices.size();
    }

    @Override
    public Iterable<V> vertices(){
        return vertices;
    }
}