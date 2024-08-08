import java.util.Scanner;
 
public class Drive {
    public static void main(String[] args) {
        Scanner bP = new Scanner(System.in);

        System.out.println("Enter the buying price:");
        double buying = bP.nextDouble();

        int day = 1;
        double closing = 0.1;
        
        while(true){
            System.out.println("\n");
            System.out.println("Enter closing price:");
            closing = bP.nextDouble();
            if(closing < 0.00) break;
            
            double earning = closing - buying;

            if(earning < 0){
                System.out.println("\n");
                System.out.println("At the end of day " + day + " you lost " + (-earning));
        }
            else if(earning > 0){
                System.out.println("\n");
                System.out.println("Your day " + day + " Earining is " + earning);
        }
            else{
                System.out.println("\n");
                System.out.println("At the end of day " + day + " you made no Earnings ");
            }

            day += 1;
        }
        bP.close();
    }
}

// ad astra per astra
// who are oath keepers