package TCS_NQT_Questions.ab_Numbers;
import java.util.*;

public class aa_PalindromeNumber {

    static int reverseNumber(int X) {
        int Y = 0;
        while (X > 0) {
            //Extract the last digit
            int digit = X % 10;
            //Appending last digit
            Y = Y * 10 + digit;
            // Shrinking X by discarding the last digit
            X = X / 10;
        }
        return Y;
    }
    public static void main(String[] args) {

        int number;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int temp = number;
        int revNumber = reverseNumber(number);
        if (revNumber == temp) {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }

    }
}

