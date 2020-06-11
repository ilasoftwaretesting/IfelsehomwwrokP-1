import java.util.Scanner;

public class Leapyear2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Enter any year to check if is it leap year or not ");
        x = sc.nextInt();

        if (x % 4 == 0)
            System.out.println("check is it leap year");
        else
            System.out.println("check it not leap year");
    }

}