package BreadthFirstSearch.OwnImplementation;

import java.util.LinkedList;
import java.util.List;

public class Place {
    private String placeName;
    private boolean isVisited;
    private List<Place> neighbors = new LinkedList<>();

    public Place(String placeName){
        this.placeName = placeName;
    }

    public void setVisited(boolean x){
        this.isVisited = x;
    }

    public void setNeighbors(List<Place> neighbors){
        this.neighbors = neighbors;
    }

    public String getPlaceName(){
        return placeName;
    }

    public List<Place> getNeighbors(){
        return neighbors;
    }

    public boolean isVisited(){
        return isVisited;
    }
}
