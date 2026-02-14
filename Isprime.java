
// Find the number is prime or not.
import java.util.*;

public class Isprime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for checking is number prime or not ");
        int number = sc.nextInt();

        if (number == 2) {
            System.out.println("Your Number is Prime ");
        } else {
            boolean Isprime = true;

            for (int i = 2; i <= number - 1; i++) {

                if (number % i == 0) {
                    Isprime = false;
                }
            }
            if (Isprime == true) {
                System.out.println("Your Number is Prime ");
            } else {
                System.out.println("Your Number is Not Prime ");
            }

        }
        sc.close();

    }
}