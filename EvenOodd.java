import java.util.Scanner;

public class EvenOodd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to find whether Even or Odd = ");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        scan.close();
    }
}