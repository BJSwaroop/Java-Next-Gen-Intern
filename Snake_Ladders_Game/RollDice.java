package Snake_Ladders_Game;
import java.util.Random;

class RollDice implements Dice{
    public int rollDice(){
        Random r = new Random();
        return (r.nextInt(6)+1);
    }
}