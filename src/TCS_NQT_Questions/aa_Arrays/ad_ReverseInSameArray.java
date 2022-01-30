package TCS_NQT_Questions.aa_Arrays;

public class ad_ReverseInSameArray {
    public static void main(String[] args) {
        int n=5;
        int src[] = {10,25,2,4,-8};
        int temp;
        int i=0, j= src.length-1;
        while(i<j){
            temp = src[i];
            src[i] = src[j];
            src[j] = temp;
            j--;
            i++;
        }
        for(int k=0 ; k<src.length; k++){
            System.out.print(src[k]+" ");
        }
    }

}
