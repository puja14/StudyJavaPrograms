package aa_Arrays;

public class ab_LargestInArray {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {10,25,2,4,-8};
        int greater = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i]>greater){
                greater = arr[i];
            }
        }
        System.out.println("Greater Number :"+greater);
    }
}
