package Algorithms;

public class searchingLinearProgram {
    public static void main(String[] args) {
        int[] arr = {10, 50, 90, 70, 80};
        int target = 90;
        int size = arr.length;
        boolean flag= false;
        int m=0;
        for (int i = 0; i<size; i++){
            if(arr[i]==target){
                flag=true;
                m=i;
                break;
            }
        }
        if(flag){
            System.out.println("Element Present at "+m);
        }else {
            System.out.println("Element Not Found");
        }
    }
}
