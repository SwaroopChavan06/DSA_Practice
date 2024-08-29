package Algorithms;

public class trainCost
{
    static int arrivalDepartureTime(int arrival[], int departure[]){
        int i=0, j=0, cursum=0;
        int maxsum=0;
        while (i<arrival.length && j<departure.length){
            if (arrival[i] <=departure[j]){
                cursum++;
                if(cursum>maxsum){
                    maxsum=cursum;
                }
                i++;
            }else{
                cursum--;
                j++;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arrival[]={12,15,19,20,25};
        int departure[]={14,20,23,22,26};
        int ans = arrivalDepartureTime(arrival, departure);
        System.out.println(ans);
    }
}