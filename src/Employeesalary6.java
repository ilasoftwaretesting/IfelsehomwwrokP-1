import java.util.Scanner;

class Employeesalary6 {

    public static void main(String[] args) {
        int HRA, TA, DA, PF;

        System.out.println("Enter employee hra,ta,da,pf, bacis and grross salary");
        Scanner sc = new Scanner(System.in);
        int hra = sc.nextInt();
        int ta = sc.nextInt();
        int da = sc.nextInt();
        int pf = sc.nextInt();

        int basic = hra + ta + pf+ da;
        float per = basic / 4f;

        System.out.println(basic);
        System.out.println(per);

        System.out.println("hra and da basic salary");
        if(basic <= 10000) {
        }

    }
}















