
import java.util.Scanner;

public class Interchangevalue5 {


    public static void main(String[] args) {

        int x, y, interchange;

        System.out.print("Enter Value of x and y");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println ("Before interchange x=x, y = y");
        interchange = x;
        x = y;
        y = interchange;

        System.out.println("After interchang x=y, y=x");
    }

}
