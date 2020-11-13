package net.boardgames.sal;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakesAndLaddersSinglePlayerTests {

    @Test
    public void shouldMoveForward() throws Exception {

        SnakesAndLaddersSinglePlayer snakesAndLaddersSinglePlayer = new SnakesAndLaddersSinglePlayer();

        snakesAndLaddersSinglePlayer.move(4);

        assertEquals("You moved to space 4", snakesAndLaddersSinglePlayer.getMessage());

        snakesAndLaddersSinglePlayer.move(3);
        assertEquals("You moved to space 7", snakesAndLaddersSinglePlayer.getMessage());

        assertEquals(7, snakesAndLaddersSinglePlayer.currentLocation());
    }

    @Test
    public void shouldHandleTheFirstLadder() throws Exception {

        SnakesAndLaddersSinglePlayer snakesAndLaddersSinglePlayer = new SnakesAndLaddersSinglePlayer();

        snakesAndLaddersSinglePlayer.move(3);

        assertEquals("You hit a ladder it took you to 37", snakesAndLaddersSinglePlayer.getMessage());

        assertEquals(37, snakesAndLaddersSinglePlayer.currentLocation());
    }

    @Test
    public void shouldHandleTheSecondtLadder() throws Exception {

        SnakesAndLaddersSinglePlayer snakesAndLaddersSinglePlayer = new SnakesAndLaddersSinglePlayer();

        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(2);

//        assertEquals("You moved 3 spaces forward", snakesAndLaddersSinglePlayer.getMessage());

        assertEquals(32, snakesAndLaddersSinglePlayer.currentLocation());
    }

    @Test
    public void shouldHandleTheThirdLadder() throws Exception {

        SnakesAndLaddersSinglePlayer snakesAndLaddersSinglePlayer = new SnakesAndLaddersSinglePlayer();

        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(3);

        assertEquals(56, snakesAndLaddersSinglePlayer.currentLocation());
    }

    @Test
    public void shouldHandleTheFourthLadder() throws Exception {

        SnakesAndLaddersSinglePlayer snakesAndLaddersSinglePlayer = new SnakesAndLaddersSinglePlayer();

        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(5);

        assertEquals(85, snakesAndLaddersSinglePlayer.currentLocation());
        assertEquals("You hit a ladder it took you to 85", snakesAndLaddersSinglePlayer.getMessage());

    }


    @Test
    public void shouldHandleTheFirstSnake() throws Exception {

        SnakesAndLaddersSinglePlayer snakesAndLaddersSinglePlayer = new SnakesAndLaddersSinglePlayer();

        snakesAndLaddersSinglePlayer.move(5);
        snakesAndLaddersSinglePlayer.move(5);
        snakesAndLaddersSinglePlayer.move(5);

        assertEquals("You hit a snake it took you to 9", snakesAndLaddersSinglePlayer.getMessage());

        assertEquals(9, snakesAndLaddersSinglePlayer.currentLocation());
    }

    @Test
    public void shouldHandleTheSecondSnake() throws Exception {

        SnakesAndLaddersSinglePlayer snakesAndLaddersSinglePlayer = new SnakesAndLaddersSinglePlayer();

        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(6);
        snakesAndLaddersSinglePlayer.move(1);

        assertEquals("You hit a snake it took you to 22", snakesAndLaddersSinglePlayer.getMessage());

        assertEquals(22, snakesAndLaddersSinglePlayer.currentLocation());
    }

//    @Test
//    public void shouldSupportLadders() {
//        assertEquals(1,2);
//    }
//
//    @Test
//    public void shouldSupportSnakes() {
//        assertEquals(1,2);
//    }

//    @Test
//    public void shouldBeAbleToWin() {
//        assertEquals(1,2);
//    }

}
