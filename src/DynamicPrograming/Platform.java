package DynamicPrograming;

import java.util.Arrays;

public class Platform {

    public static int platFormReq(int arv[],int dep[]){

        Arrays.sort(arv);
        Arrays.sort(dep);

        int platFormRed=1;
        int maxPlatFormReq=1;
        int i=1;
        int j=0;
        int n=arv.length;
        while (n>i &&  n>j){

            if(arv[i]<=dep[j]){
                platFormRed++;
                i++;
            }else{
                platFormRed--;
                j++;
            }
            maxPlatFormReq=Math.max(platFormRed,maxPlatFormReq);
        }
        return maxPlatFormReq;


    }


    public static void main(String[] args) {
        int arv[]={12,15,19,20,25,25,26};
        int dep[]={14,20,23,22,26,27,28};

        System.out.println(platFormReq(arv,dep));

    }
}
