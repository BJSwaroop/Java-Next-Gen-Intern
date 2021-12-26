package Snake_Ladders_Game;
import java.util.*;

class Driver{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dice roll = new RollDice();
        Hashmap<Integer,Integer> jumpers=new Hashmap<Integer,Integer>();
        LinkedList<String> players=new LinkedList<String>();
        // Get player details
        // System.out.print("Enter number of Player: ");
        // int players = sc.nextInt();
        players.add("Swaroop");
        players.add("Trisha");
        
        // Get jumpers 
        jumpers.put(10,20);
        jumpers.put(30,60);
        jumpers.put(60,20);
        jumpers.put(50,10);
        jumpers.put(20,5);

        GameBoard game = new GameBoard()

        sc.close();
    }

}