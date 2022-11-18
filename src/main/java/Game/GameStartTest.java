package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStartTest {

    @Test
    void getInstance() {
        Player[] players =  GameStart.gamestart();
        Game.runGame();


    }
}