package DynamicPrograming;

public class FibonacciSeries {
//    static int fib(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }

    static int[] fibo(int num){

        int arr[] = new int[num+2];
        arr[0]=0;
        arr[1]=1;
        int n = arr.length;
        for (int i=2; i<n; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }

    public static void main(String[] args) {
        int target = 14;
        int array[] = fibo(target);
        for (int i = 0; i < target; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
///both using recursion and dynamic programing