package TCS_NQT_Questions.aa_Arrays;
import java.util.*;

public class af_RearrangeInIncreasingDecreasing {
    public static void main(String args[]) {
        int arr[] = {2,5,3,1,6,4,7,9};
        int n =arr.length;
        Arrays.sort(arr);

        for(int i=0; i<n/2; i++){
            System.out.print(arr[i]);
        }

        for(int i=n-1 ; i>=n/2; i--){
            System.out.print(arr[i]);
        }

    }

}
