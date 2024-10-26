package Model;

import java.util.Random;

public class Dice {
    Random random;
    public Dice() {
        random = new Random();
    }
    public int rollDice() {
        return random.nextInt(1,7);
    }
}
