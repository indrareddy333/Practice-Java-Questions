import java.util.Scanner;

public class UpperORlowerCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().trim().charAt(0);
        if ('A' <= ch && 'Z' >= ch) {
            System.out.println("Upper case letter");
        } else {
            System.out.println("Lower case letter");
        }
        scan.close();
    }

}
