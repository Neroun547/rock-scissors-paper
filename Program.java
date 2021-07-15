import java.util.Scanner;
import Game.Game;

public class Program {
    public static void main(String args[]){
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("--- Start game ---");
            System.out.println("What your choice (1 - rock, 2 - scissors, 3 - paper. Write 5 to exit");
            var playerChoice = in.nextInt();

            if(playerChoice == 5) {
                in.close();
                break;
            }

            Game game = new Game(playerChoice);
            System.out.println(game.getResult());
        }
    }
}

