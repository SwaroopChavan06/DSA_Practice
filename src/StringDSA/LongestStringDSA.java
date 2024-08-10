package StringDSA;

import java.util.Scanner;
public class LongestStringDSA {

    public static int LongestStringDSA(String s) {
        StringBuilder str = new StringBuilder();
        int maxLength = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            int index = str.indexOf(String.valueOf(c));
            if (index != -1) {
                str = new StringBuilder(str.substring(index + 1));
            }
            str.append(c);
            maxLength = Math.max(maxLength, str.length());
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("The length of the longest substring without repeating characters is: " + LongestStringDSA(s));
    }
}