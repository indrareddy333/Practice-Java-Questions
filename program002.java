import java.util.*;

public class program002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the any number to check whether it is even or odd = ");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Odd number");
        }

    }
}