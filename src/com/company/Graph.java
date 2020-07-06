package com.company;

class Graph {
    private int[][] mas; //Матрица смежности
    private Vertex[] vertexList; //Массив вершин графа
    private int curN; //текущее кол-во вершин графа
    private GraphQueue queue = new GraphQueue();

    Graph() {
        // 10 - максимальное количество вершин графа
        vertexList = new Vertex[10];
        mas = new int[10][10];
        curN = 0;
    }

    void addVertex(String name) {
        vertexList[curN++] = new Vertex(name);
    }

    void addEdge(int start, int end) {
        mas[start][end] = 1;
        mas[end][start] = 1;
    }

    private int check(int vertex) {
        for (int i = 0; i < curN; i++) {
            if (mas[vertex][i] == 1 && !vertexList[i].isVisited) {
                return i;
            }
        }

        return -1;
    }

    boolean isConnected(int index) {
        vertexList[index].isVisited = true;
        queue.insert(index);

        int vertex;

        while (!queue.isEmpty()) {
            int temp = queue.remove();

            while ((vertex = check(temp)) != -1) {
                vertexList[vertex].isVisited = true;
                queue.insert(vertex);
            }
        }

        for (int i = 0; i < curN; i++) {
            vertexList[i].isVisited = false;
        }

        return queue.getArraySize() == curN;
    }
}