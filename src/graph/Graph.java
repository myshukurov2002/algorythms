package graph;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Graph {
    Hashtable<Integer, List<Integer>> adjList;

    public Graph(int v) {
        adjList = new Hashtable<>();
        for (int i = 0; i < v; i++) {
            adjList.put(i, new ArrayList<>());
        }
        
    }
}
