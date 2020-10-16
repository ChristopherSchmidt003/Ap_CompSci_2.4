import java.util.Scanner;

class RunningTally {
    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double n = 0; //number entered
        double t = 0; //total
        
        //get user input
        System.out.println("Let's add some numbers! [type a negative number to quit");
        System.out.println("");
        
        while (n >= 0) {
            t = t + n;
            System.out.print("Add: ");
            n = sc.nextDouble();
        }
        
        System.out.print("Total: " + t);
        
    }
}