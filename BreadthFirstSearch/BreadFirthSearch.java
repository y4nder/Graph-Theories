package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadFirthSearch<T> {
    private Vertex<T> staVertex;
    public BreadFirthSearch(Vertex<T> startVertex){
        this.staVertex = startVertex;
    }

    public void traverse(){
        Queue< Vertex<T> > queue = new LinkedList<>();
        Vertex<T> current = null;
        queue.add(staVertex);
        while(!queue.isEmpty()){
            current = queue.poll();
            if(current.isVisited() == false){
                current.setVisitied(true);
                var listOfNeighbors = current.getNeighbors();
                if(listOfNeighbors.size()!=0){
                    queue.addAll(listOfNeighbors);
                    System.out.print("from " + current.getData() + " to ");
                    for (Vertex<T> d : listOfNeighbors) {
                            System.out.print(d.getData() + ", ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("end vertex is " + current.getData());
    }
}
