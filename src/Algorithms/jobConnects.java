package Algorithms;

public class jobConnects {
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 12, 6, 8};
        int k = 4;
        int T = 5;

        int sum =0;
        for(int i = 0; i< arr.length; i++){
            sum +=arr[i];
        }

        int avg= sum/ arr.length;
        int mxtime=1;
        int time= 1;
        int ft=0;

        for (int i = 0; i< arr.length; i++){
            ft = ft+arr[i];
            if (ft>=avg){
              time=ft*T ;
              if(mxtime<time){
                  mxtime=time;
              }
              ft=0;
            }else {
                ft= ft+arr[i];
            }
        }

        System.out.println(mxtime);
    }
}



//Input:  k = 2, T = 5, job[] = {4, 5, 10}
//Output: 50
//
//The minimum time required to finish all the jobs is 50.
//There are 2 assignees available. We get this time by
//assigning {4, 5} to first assignee and {10} to second
//assignee.
//
//        Input:  k = 4, T = 5, job[] = {10, 7, 8, 12, 6, 8}
//Output: 75
//We get this time by assigning {10} {7, 8} {12} and {6, 8}
