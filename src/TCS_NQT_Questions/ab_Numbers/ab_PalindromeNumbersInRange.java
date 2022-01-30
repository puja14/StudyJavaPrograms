package TCS_NQT_Questions.ab_Numbers;

public class ab_PalindromeNumbersInRange {
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
        System.out.println("Palindrome Numbers are: ");
        for(int i = 1; i<=200 ; i++){
            int revNumber = reverseNumber(i);
            if (revNumber == i) {
                System.out.print(i+" ");
            }
        }
    }

}
