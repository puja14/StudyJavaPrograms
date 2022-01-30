package TCS_NQT_Questions.aa_Arrays;
import java.util.*;

public class ac_SecondSmallestLargest {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {10,25,2,4,-8};
        Arrays.sort(arr);
        System.out.println("Second Smallest : "+arr[1]);
        System.out.println("Second Largest: "+arr[n-2]);
    }
}
