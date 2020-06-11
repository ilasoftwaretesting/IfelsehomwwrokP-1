
import java.util.Scanner;

class Oddorevan1 {

    public static void main(String []args) {

        Scanner sc = new Scanner (System.in);

        int x;

        System.out.println("Enter an integer number to check if it is odd or even ");
        x = sc.nextInt( );

        if (x % 2 == 0 )
             System.out.println("entered an even number.");
        else
             System.out.println ("entered an odd number.");



    }


}
