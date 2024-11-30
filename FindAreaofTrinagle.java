import java.util.Scanner;

public class FindAreaofTrinagle {
    public static void main(String[] args) {
        // Find the area of triangle
        // formula - 1/2 * B * H
        float breadth, height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Breadth and Height = ");
        System.out.print("Breadth = ");
        breadth = scan.nextInt();
        System.out.print("Heigth = ");
        height = scan.nextInt();
        float Triangle = (breadth * height) * 1 / 2;
        System.out.println("The Area of Traingle = " + Triangle);
        scan.close();
    }

}