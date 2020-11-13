package net.boardgames.sal;

public class Tile {

    private int nextPosition;

    public Tile(int nextPosition) {
        this.nextPosition =  nextPosition;
    }

    public int nextPosition(){
        return nextPosition;
    }

    String getMessage(int currentLocation) {
        return "You moved to space " + currentLocation;
    }

}
