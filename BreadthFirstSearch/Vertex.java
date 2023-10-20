package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T>{
    private final T data;
    private boolean isVisited;
    private List<Vertex<T>> neighbors = new LinkedList<>();
    
    public Vertex(T data){
        this.data = data;
    }

    public void setVisitied(boolean isVisited){
        this.isVisited = isVisited;
    }

    public void setNeighbors(List< Vertex<T> > neighbors ){
        this.neighbors = neighbors;
    }

    public List<Vertex<T>> getNeighbors(){
        return neighbors;
    }

    public boolean isVisited(){
        return isVisited;
    }

    public T getData(){
        return data;
    }

    public String toString(){
        return "Vertex(data:" + data + ", Visited:" + isVisited + ")";
    }
}