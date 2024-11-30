import java.util.Scanner;

public class Salarybonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your slaray to get a bonus : ");
        int num = scan.nextInt();
        if (num < 20000) {
            System.out.println("Bonus amount : " + 1500);
            System.out.println("Total amount : " + (num + 1500));
        } else {
            System.out.println("Bonus Amount : " + 2500);
            System.out.println("Total amount : " + (num + 2500));
        }
        scan.close();
    }
}