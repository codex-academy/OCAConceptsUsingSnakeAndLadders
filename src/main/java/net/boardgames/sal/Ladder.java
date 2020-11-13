package net.boardgames.sal;

public class Ladder extends Tile {

    private int top;

    public Ladder(int top) {
        super(top);
        this.top = top;

    }

    @Override
    String getMessage(int currentLocation) {
        return "You hit a ladder it took you to " + currentLocation;
    }
}
