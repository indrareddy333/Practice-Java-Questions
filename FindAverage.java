import java.util.Scanner;

public class FindAverage {
    public static void main(String[] Avg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three number to find Average of Three Numbers");
        System.out.print("First number = ");
        int num1 = scan.nextInt();
        System.out.print("second number = ");
        int num2 = scan.nextInt();
        System.out.print("third number = ");
        int num3 = scan.nextInt();
        int Avaerage = (num1 + num2 + num3) / 3;
        System.out.println("The Average of Three numbers are = " + Avaerage);
        scan.close();

    }
}