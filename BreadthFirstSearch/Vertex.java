package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T>{
    private final T data;
    private boolean isVisited;
    private List< Vertex<T> > neighbors = new LinkedList<>();
    
    public Vertex(T data){
        this.data = data;
    }

    public void setVisitied(boolean isVisited){
        this.isVisited = isVisited;
    }
}