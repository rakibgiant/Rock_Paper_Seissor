import java.util.Scanner;

public class rps2 {
    public int rpS2() {
        Scanner sage = new Scanner(System.in);
        System.out.println("Play again? Y(8), N(9)?");
        int yes = 8;
        int input;
        input = sage.nextInt();
        switch(input){
            case 1:
            System.out.println("Rock,Paper,Scissors!");
            break;
            case 2:
            System.out.println("Thanks for playing!");
            break;
        }
        /*if (input == yes) {
            System.out.println("Rock,Paper,Scissors!");

        } else {
            System.out.println("Thanks for playing!");
        }*/

        sage.close();
        return input;

    }

}
