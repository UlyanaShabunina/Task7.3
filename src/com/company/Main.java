package com.company;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A"); // index 0
        graph.addVertex("B"); // 1
        graph.addVertex("C"); // 2
        graph.addVertex("D"); // 3
        graph.addVertex("E"); // 4
        graph.addVertex("F"); // 5
        graph.addVertex("G"); // 6

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);

        System.out.println("Is graph connected? " + "Result: " + graph.isConnected(0));
    }
}