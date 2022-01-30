package TCS_NQT_Questions.aa_Arrays;

public class ag_SumOfElements {
    public static void main(String args[]) {
        int arr[] = {2,5,3,1,6,4,7,9}, sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.print("The Sum is: " +sum);
    }

}
