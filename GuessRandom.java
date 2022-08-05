import java.util.Scanner;

public class GuessRandom 
{
    public static int randomNum() 
    {
        double x = Math.random();

        int randomNum = (int)(10 * x) + 1;

        return randomNum;
    }
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.println("I'm thinking of a number from 1 to 10. Your guess?");
            int guess = scanner.nextInt();

            int random = randomNum();
            System.out.print("It was " + random + ". ");

            int difference = random - guess;
            System.out.println("You were off by " + difference + ".");
        }
    }
}