package Game;

public class Game {

    private static enum resultModel {
        VAL1 {
            public int getVal(){
                return 3; 
            };
        },

        VAL2 {
            public int getVal(){
                return 1;
            }
        },

        VAL3 {
            public int getVal(){
                return 2;
            }
        };

        public abstract int getVal();
    }

    private static int computerChoice;
    int playerChoice;

    public Game(int x){
        this.playerChoice = x;
    }

    private static void calculateComputerChoice(){
        int startRandom = 1;
        int finishRandom = 3;

        int randomNumber = startRandom + (int)(Math.random() * finishRandom);

        computerChoice = randomNumber;
    }

    public String getResult(){
        calculateComputerChoice();
        if(resultModel.values()[computerChoice - 1].getVal() == this.playerChoice){
            return "You win !";
        } else {
            return "You lose !";
        }
    }
}


