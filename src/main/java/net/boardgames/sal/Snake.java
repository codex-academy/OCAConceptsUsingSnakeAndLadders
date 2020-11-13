package net.boardgames.sal;

public class Snake extends Tile {

    private int  bottom;

    public Snake(int bottom) {
        super(bottom);
        this.bottom = bottom;
    }

    @Override
    String getMessage(int currentLocation) {
        return "You hit a snake it took you to " + currentLocation;
    }
}
