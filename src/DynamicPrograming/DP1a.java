package DynamicPrograming;
import java.util.HashMap;
import java.util.Map;

public class DP1a {

    private static Map<Integer, Integer> memo = new HashMap<>();

    static int Fib(int n){
        if(n<=0)
            return 0;
        else if(n==1)
            return 1;
        if(!memo.containsKey(n)){
            memo.put(n,Fib(n-1)+Fib(n-2));
        }
      return memo.get(n);

    }

    public static void main(String[] args) {
        int n=13;
        System.out.println(Fib(n));
    }
}
