package TCS_NQT_Questions.aa_Arrays;

public class ae_FrequencyOfEachElement {
    public static void main(String args[]) {
        int arr[] = {2,1,8,1,1};
        int n =arr.length;

        findOccurance(arr,n);
    }

    public static void findOccurance(int arr[], int n){
        boolean visited[] = new boolean[n];

        for(int i=0 ; i<n ; i++){

            if(visited[i] == true)
                continue;

            int count = 1;
            for(int j=i+1 ; j<n ; j++){

                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+ count );
        }
    }
}
