import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is Your Name ? = ");
        System.out.println("Hai " + scan.next() + "! Welcome to Java Class");
        scan.close();
    }
}