package TCS_NQT_Questions.ab_Numbers;
import java.util.*;

public class ad_PrimesInRange {
    public static boolean isPrime(int n){

        for(int i=2; i<n/2; i++){
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
            for(int i= 2 ; i<=no ; i++){
                boolean result = isPrime(i);
                if(result == true)
                    System.out.println("No is prime:"+i);
                else
                    System.out.println("No is not Prime:"+i);
            }
        }

    }

}
