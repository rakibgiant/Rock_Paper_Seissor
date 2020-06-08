import java.util.Random;
import java.util.Scanner;

public class ComputerTurn {
    String name;
    int point;
    Random rend = new Random();
    Scanner input = new Scanner(System.in);
    public String playerinfo(){
        System.out.println("Hi This is computer. ");
        System.out.println("Select whitch player you wanna play with: ");
        System.out.println("\t \t 1. Bill Gates");
        System.out.println("\t \t 2. Jack Ma ");
        System.out.println("\t \t 3. Steve Jobes");
        int chose = input.nextInt();
        switch(chose){
            case 1: 
            System.out.println("You Choise Bill Gates ");
            name="Bill Gates";
            break;
            case 2: 
            System.out.println("You Choise Jack Ma ");
            name="Jack Ma";
            break;
            case 3: 
            System.out.println("You Choise Steve Jobes ");
            name="Steve Jobes";
            break;
        }
        return name;
    }
    public int showHand(){
        int randomNumber = rend.nextInt(3) + 1;
        return randomNumber;
        
    }
    
}