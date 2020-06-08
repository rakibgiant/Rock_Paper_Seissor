import java.util.Random;
import java.util.Scanner;

public class Game {
        int com_score = 0, user_score = 0, count = 0, tie = 0;
        Random rend = new Random();
        Scanner input = new Scanner(System.in);
        ComputerTurn player2 = new ComputerTurn();
        Player player1 = new Player();
        //int chose = player1.showHand();
        //int b = 1;

        public void gameStart() {
                System.out.println("Please Entre how many game you wanna Play: ");
                int gamenum = input.nextInt();
                while (gamenum != 100) {
                        final int rock = 1;
                        final int paper = 2, scissors = 3;
                        int chose = player1.showHand();
                        // if the computer got Rock
                        if (player2.showHand() == rock) {
                                if (chose == rock) {
                                        System.out.println("Rock vs. Rock, ITS A TIE!");
                                        tie++;
                                        System.out.println(player1.name + " Your Score: " + user_score);
                                        System.out.println(player2.name + "'s Score: " + com_score);
                                } else if (chose == paper) {
                                        System.out.println("Rock vs. Paper! You win!");
                                        user_score++;
                                        System.out.println(player1.name + " Your Score: " + user_score);
                                        System.out.println("Computer Score: " + com_score);
                                } else if (chose == scissors) {
                                        System.out.println("Rock vs. Scissors! You lose!");
                                        com_score++;
                                        System.out.println(player1.name + " Your Score: " + user_score);
                                        System.out.println("Computer Score: " + com_score);
                                }
                                // if comp. got paper
                                else if (player2.showHand() == paper) {
                                        if (chose == rock) {
                                                System.out.println("Paper vs. Rock! You lose!");
                                                com_score++;
                                                System.out.println(player1.name + " Your Score: " + user_score);
                                                System.out.println("Computer Score: " + com_score);
                                        } else if (chose == scissors) {
                                                System.out.println("Paper vs. Scissors! You win!");
                                                user_score++;
                                                System.out.println(player1.name + " Your Score: " + user_score);
                                                System.out.println("Computer Score: " + com_score);
                                        } else if (chose == paper) {
                                                System.out.println("Paper vs. Paper! Its a tie!");
                                                tie++;
                                                System.out.println(player1.name + " Your Score: " + user_score);
                                                System.out.println("Computer Score: " + com_score);
                                        }
                                        // if the computer got scissors.
                                        else if (player2.showHand() == scissors) {
                                                if (chose == rock) {
                                                        System.out.println("Scissors vs. Rock! You win!");
                                                        user_score++;
                                                        System.out.println(player1.name + " Your Score: " + user_score);
                                                        System.out.println("Computer Score: " + com_score);
                                                } else if (chose == scissors) {
                                                        System.out.println("Scissors vs. Scissors, ITS A TIE!");
                                                        tie++;
                                                        System.out.println(player1.name + " Your Score: " + user_score);
                                                        System.out.println("Computer Score: " + com_score);
                                                } else if (chose == paper) {
                                                        System.out.println("Scissors vs Paper! You lose!");
                                                        com_score++;
                                                        System.out.println(player1.name + " Your Score: " + user_score);
                                                        System.out.println("Computer Score: " + com_score);
                                                }

                                        }
                                }
                        }
                        if (user_score == gamenum) {
                                System.out.println(player1.name + " U win & finished the Game!!!");
                                break;
                        }
                        if (com_score == gamenum) {
                                System.out.println("Sorry " + player1.name + " U lose & finished the game!!!!");
                                break;

                        }
                }
        }
        public void result(){
                System.out.println("Your Score: "+user_score);
                System.out.println(player2.name+"'s Score: "+com_score);
                System.out.println("Tie matches : "+tie);
                System.out.println("Total Game: "+(user_score+com_score+tie));
        }
}
