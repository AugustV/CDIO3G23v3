package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStartTest {

    @Test
    void getInstance() {

        GameStart.gamestart();

        System.out.println(GameStart.Getplayernumber());
    }
}