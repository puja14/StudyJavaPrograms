package TCS_NQT_Questions.ab_Numbers;
import java.util.*;

public class ac_PrimeOrNot {
    public static boolean isPrime(int n){

        for(int i=2; i<n; i++){
            if(n%i == 0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter Number: ");
        Scanner sc =new Scanner(System.in);
        int no = sc.nextInt();
        if(no == 0 || no == 1){
            System.out.println("No is Prime");
        }
        else{
            boolean result = isPrime(no);
            if(result == true)
                System.out.println("Number is prime");
            else
                System.out.println("Number is not Prime");
        }
    }

}
