package aa_Arrays;

public class aa_SmallestInArray {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {100,25,2,4,-8};
        int less = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i]<less){
                less = arr[i];
            }
        }
        System.out.println("Less :"+less);
    }
}
