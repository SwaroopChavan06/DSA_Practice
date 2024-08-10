package StringDSA;

public class StringtoInteger {
    public static void main(String[] args) {

        String Number = "23 23 23 23 23 23 34 42";

        String[] num = Number.split(" ");

        int[] ans = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            ans[i] = Integer.parseInt(num[i]);
            System.out.print(ans[i] + " ");
        }
    }
}