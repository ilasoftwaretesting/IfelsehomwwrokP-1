
import java.util.Scanner;

public class Cityname10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Input any alphabet from a to f:");
        String city = sc.next();

        if (city.equals("a")){
            System.out.println("aanad");
        }
        else if (city.equals("b")){
            System.out.println("bharuch");
        }
        else if (city.equals("c")){
            System.out.println("chittor");
        }
        else if (city.equals("d")){
            System.out.println("delhi");
        }
        else if (city.equals("e")){
            System.out.println("eluru");
        }
        else if (city.equals("f")){
            System.out.println("faridabad");
        }
        else
            System.out.println("enter valid input a-f, or any other g to z invalid alphabet");


    }

}

