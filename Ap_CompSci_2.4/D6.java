import java.util.Scanner;

class D6 {
    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int n = 0; //Number of dice
        int r = 0; //each dice roll
        int t = 0; //total of all dice rolls
        String a = "y"; //start Again
        
        //get user input
        while (a.equals ("y")){
        System.out.print("How many D6's do you want to roll?");
        n = sc.nextInt();
        
        System.out.print("Your rolled: ");
        for (int i = 0; i < n; i++){
            r = (int) (Math.random() * 6) +1;
                t = t + r;
                System.out.print(r + " ");
        }
        System.out.println("");
        System.out.println("Total: " + t);
        System.out.println("");
        
        t = 0;
        System.out.println("Again? [y,n] ");
        a = sc.next();
    }
    }
}