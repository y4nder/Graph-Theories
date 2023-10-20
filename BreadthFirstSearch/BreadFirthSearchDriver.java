package BreadthFirstSearch;

import java.util.Arrays;
public class BreadFirthSearchDriver {
    public static void main(String[] args){
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);
        Vertex<Integer> v7 = new Vertex<>(7);

        v0.setNeighbors(Arrays.asList(v1, v4));
        v1.setNeighbors(Arrays.asList(v2, v3, v5));
        v2.setNeighbors(Arrays.asList(v4, v3, v6));
        v3.setNeighbors(Arrays.asList(v7));
        v4.setNeighbors(Arrays.asList(v3));
        v5.setNeighbors(Arrays.asList(v7));
        v6.setNeighbors(Arrays.asList(v7));

        System.out.println("breadthfirst searching...");
        BreadFirthSearch<Integer> bfs = new BreadFirthSearch<>(v0);
        bfs.traverse();
    }
}
