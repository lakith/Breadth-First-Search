package com.graps;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void traverse(Vertex root){
        Queue<Vertex> vertexQueue = new LinkedList<>();

        root.setVisited(true);
        vertexQueue.add(root);

        while(!vertexQueue.isEmpty()) {
            Vertex readingVertex = vertexQueue.remove();
            System.out.println("Visited Vertex - " + readingVertex);

            for(Vertex v : readingVertex.getAdjancyList()) {
                if(!v.isVisited()) {
                    v.setVisited(true);
                    vertexQueue.add(v);
                }
            }
        }
    }

}
