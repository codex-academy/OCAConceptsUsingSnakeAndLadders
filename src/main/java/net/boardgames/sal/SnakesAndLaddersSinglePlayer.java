package net.boardgames.sal;

public class SnakesAndLaddersSinglePlayer {

    private int  currentLocation = 0;
    private int lastMovedCount = 0;
    private int totalMoves = 0;
    private String message;

    private Tile[] tiles = new Tile[100];

    public SnakesAndLaddersSinglePlayer() {

        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile(i+1);
        }

        tiles[2] = new Ladder(37);
        tiles[13] = new Ladder(32);
        tiles[26] = new Ladder(56);
        tiles[40] = new Ladder(85);

        // using a ladder as a snake
        tiles[14] = new Snake(9);
        tiles[60] = new Snake(22);

    }

    public void move(int spacesToMove) {

        lastMovedCount = spacesToMove;
        currentLocation += spacesToMove;
        totalMoves++;

        if (currentLocation >= 100) {
            setMessage("This game is over!");
            System.out.println(getMessage());
            return;
        }

        Tile currentTile = tiles[currentLocation -  1];
        currentLocation = currentTile.nextPosition();
        setMessage(currentTile.getMessage(currentLocation));

    }

    private void  setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int currentLocation() {
        return currentLocation;
    }

    public boolean isGameDone() {
        return currentLocation >= 100;
    }

    public int totalMoves() {
        return totalMoves;
    }

}
