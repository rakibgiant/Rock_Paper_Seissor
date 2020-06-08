import java.util.Scanner;

public class Player {
    String name;
    int point;
    Scanner input = new Scanner(System.in);
    public  String playerInfo() {
        System.out.println("Welcome to Rock Paper Scissors world!");
        System.out.println("Please Entre Your name: ");
        name = input.nextLine();
        return name;
    }

    public int showHand() {
        System.out.println("Please show your hand:1.Rock 2.paper 3.Scissors(input the related number):");
        Scanner input = new Scanner(System.in);
        int hand= input.nextInt();
        //input.close();
        return hand;

    }
    

}