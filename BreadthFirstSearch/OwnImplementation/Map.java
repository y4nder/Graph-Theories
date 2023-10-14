package BreadthFirstSearch.OwnImplementation;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Map {
    private Place startingPlace;
    private MapPlaces map;

    public Map(){
        this.map = new MapPlaces();
        this.startingPlace = map.getStartingPlace();
    }

    public void travel(){
        Queue<Place> queue = new LinkedList<>();
        List<Place> endDestinations = new LinkedList<>();
        queue.add(startingPlace);
        Place currentPlace = null;
        while(!queue.isEmpty()){
            currentPlace = queue.poll();
            if(!currentPlace.isVisited()){
                currentPlace.setVisited(true);
                var listOfneighbors = currentPlace.getNeighbors();
                if(listOfneighbors.size() != 0){
                    queue.addAll(listOfneighbors);
                    System.out.print("From " + currentPlace.getPlaceName() + " to: ");
                    iterateList(listOfneighbors);
                    System.out.println();
                }
                else{
                    endDestinations.add(currentPlace);
                }
            }
        }
        System.out.println("\nfurthest you can get from " + startingPlace.getPlaceName() + "(end vertices): " );
        iterateList(endDestinations);
    }

    public void iterateList(List<Place> list){
        for (Place p : list) {
            System.out.print("(" + p.getPlaceName() + ")");
        }
    }
}
