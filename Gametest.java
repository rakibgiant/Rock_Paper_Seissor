//import java.util.Scanner;

public class Gametest {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int user_score = 0, com_score = 0;
        Player player1 = new Player();
        player1.playerInfo();
        // System.out.println("Please Entre how many game you wanna Play: ");
        // int gamenum = input.nextInt();
        ComputerTurn player2 = new ComputerTurn();
        player2.playerinfo();
        Game startGame = new Game();
        startGame.gameStart();
        rps2 rps2Object = new rps2();
        rps2Object.rpS2();
        // input.close();
        startGame.result();

    }
}
