package com.example;

public class Edge<V> {
    public final V a, b;
    public final Number weight;

    public Edge(V a, V b){
        this(a, b, 1);
    }

    public Edge(V a, V b, Number weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
    }
}