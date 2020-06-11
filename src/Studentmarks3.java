import java.util.Scanner;

public class Studentmarks3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("student name");
        String name = sc.next();

        System.out.println("student roll number");
        int rollno = sc.nextInt();

        System.out.println("students marks subject 1 to 3,");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int total = s1 + s2 + s3;
        float per = total / 3f;
        /* Calculate percentage */

        System.out.println(total);
        System.out.println(per);

        System.out.println("grade");
        if (per >= 80){
            System.out.println("A+");
        }

        else if (per >= 60 == per<80){
            System.out.println("A");
        }

        else if (per >= 50 == per<60){
            System.out.println("B");
        }

        else if (per >= 35 == per<50){
            System.out.println("c");
        }
        else
        {
            System.out.println("false");

        }
    }
}







