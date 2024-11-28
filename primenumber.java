public class primenumber {
    public static void main(String[] args) {
        int prime = 59;
        int count = 0;
        for (int i = 1; i <= prime; i++) {
            if (prime % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("The prime number");
        } else {
            System.out.println("Not a prime number");
        }
        System.out.println("count = " + count);
    }
}