import java.util.Scanner;

class GuessingGame {
    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int n = (int) (Math.random() * 100) + 1;
        int g = 0;
        int c = 0; //guess count
        
        System.out.print("I've picked a random number betweeen 1 and 100. Can you guess it?");
        System.out.println("");
        //get user input
        while (g != n){        
            System.out.print("What is your guess: ");
            g = sc.nextInt();
            c++;
            if (g > n) System.out.println("Too high...");
            if (g < n) System.out.println ("Too low...");
        }
        
        System.out.println("Good job! It only took you " + c + " tries");
    }
}