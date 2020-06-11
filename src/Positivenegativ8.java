import java.util.Scanner;

 class positivenegetiv8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Enter number to check positive or negative? ");
        x = sc.nextInt();

        if (x < 0)
            System.out.println("it is negative");
        else
            System.out.println("it is positve");
    }

}