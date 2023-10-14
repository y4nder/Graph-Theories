package BreadthFirstSearch.OwnImplementation;

import java.util.List;

public class MapPlaces {
    private Place startingPlace;

    public MapPlaces(){
        Place p0 = new Place("RM");
        Place p1 = new Place("Esperanza");
        Place p2 = new Place("Molave");
        Place p3 = new Place("Pagadian");
        Place p4 = new Place("Dipolog");
        Place p5 = new Place("Mahayag");
        Place p6 = new Place("Ozamiz");
        Place p7 = new Place("Cebu");

        p0.setNeighbors(List.of(p1, p3));
        p1.setNeighbors(List.of(p2));
        p2.setNeighbors(List.of(p5, p6));
        p6.setNeighbors(List.of(p4, p7));

        this.startingPlace = p0;
    }

    public Place getStartingPlace(){
        return startingPlace;
    }
}
