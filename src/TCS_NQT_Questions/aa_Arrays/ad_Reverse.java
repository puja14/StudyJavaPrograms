package TCS_NQT_Questions.aa_Arrays;

public class ad_Reverse {
    public static void main(String[] args) {
        int n=5;
        int src[] = {10,25,2,4,-8};
        int dest[]=new int[src.length];
        int j=0;
        for(int i=src.length-1; i>=0; i--){
            dest[j]=src[i];
            j++;

        }
        for(int k=0 ; k<dest.length; k++){
            System.out.print(dest[k]+" ");
        }

    }
}
