public class simplifyprime {
    public static void main(String[] args) {
        int num = 23;
        if (num <= 1) {
            System.out.println("neither prime nor compsite");
        }
        int c = 3;
        int count = 0;
        while (c * c <= num) {
            if (num % c == 0) {
                count++;
                System.out.println("Not a Prime Number");
                break;
            }
            c++;
        }
        if (count == 0) {
            System.out.println("Prime Number");
        }

    }
}