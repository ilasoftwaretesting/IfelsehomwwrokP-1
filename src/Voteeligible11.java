
import java.util.Scanner;

class voteeligible11 {

    public static void main(String []args) {

        Scanner sc = new Scanner (System.in);
        System.out.println(" what is your age?");
        int age = sc.nextInt();

        if (age >=18)
            System.out.println("you are eligible for vote.");
        else
            System.out.println ("you are not eligible for vote.");



    }


}
