import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
        scan.close();
    }
}