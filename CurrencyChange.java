import java.util.Scanner;

public class CurrencyChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the rupees to convert usd = ");
        int rupee = scan.nextInt();
        double usd = rupee * 0.012f;
        System.out.println(usd + "$");
        scan.close();

    }
}