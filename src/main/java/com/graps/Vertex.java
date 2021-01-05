package com.graps;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private List<Vertex> adjancyList;
    private boolean visited;

    public Vertex(String name) {
        this.name = name;
        this.adjancyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjancyList() {
        return adjancyList;
    }

    public void setNeighbour(Vertex neighbour) {
        this.adjancyList.add(neighbour);
    }

    @Override
    public String toString() {
        return name;
    }
}
