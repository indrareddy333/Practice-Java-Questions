import java.util.Scanner;

public class fibb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nth = scan.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        int temp = 0;
        while (count <= nth) {
            temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        System.out.println(temp);
        scan.close();

    }
}
