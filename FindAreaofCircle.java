import java.util.Scanner;

public class FindAreaofCircle {
    public static void main(String[] args) {
        // finding area of circle
        // formula for are of circle is pie X R^2
        double pi = Math.PI;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Radius = ");
        int Rad = scan.nextInt();
        double Area = pi * (Rad * Rad);
        System.out.println("Area of a Circle = " + Area);
        scan.close();

    }
}