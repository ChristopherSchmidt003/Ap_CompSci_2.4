import java.util.Scanner;

class Triangle {
    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        String c = ""; //Character
        int x = 0; //how tall
        
        //get user input
        System.out.print("What character do you want your triangle made of?");
        c = sc.nextLine();
        System.out.println("How tall do you want your triangle?");
        x = sc.nextInt();
        
        for (int i = 0; i <= x; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(c);
            }
            System.out.println("");
        }
        
    }
}