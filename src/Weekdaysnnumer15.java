

import java.util.Scanner;

public class Weekdaysnnumer15 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter week days(1-7)");

        int x;
        x=sc.nextInt();

        if (x == 1)
            System.out.println("monday");

        else if (x == 2)
            System.out.println("tuesday");

        else if (x == 3)
            System.out.println("weadnsday");

        else if (x == 4)
            System.out.println("thursday");

        else if (x == 5)
            System.out.println("friday");

        else if (x == 6)
            System.out.println("saturday");

        else if (x == 7)
            System.out.println("sunday");

        else

            System.out.println("Invalid Input! Please enter week number between 1-7.");
    }

}





