import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principle Amount = ");
        float P = scan.nextInt();
        System.out.print("Enter Rate of Interest(%) = ");
        float R = scan.nextFloat();
        System.out.print("Enter Time Period(year) = ");
        float T = scan.nextInt();
        float Si = ((P * R * T) / 100);
        System.out.println("Simple Interest = " + Si + "%");

    }
}