package com.vaani.hackerrank.graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Node {
    private int value;
    private Status status = Status.Unvisited;
    private List<Node> adjacentNodes = new ArrayList<>();

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Status getStatus() {
        return status;
    }

    public void add(Node node) {
        adjacentNodes.add(node);
    }

    public List<Node> getAdjacentNodes() {
        return adjacentNodes;
    }
}
