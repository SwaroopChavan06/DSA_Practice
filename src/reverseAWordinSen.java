import java.util.Scanner;
import java.util.Stack;

public class reverseAWordinSen {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = "hello how are you";
            Stack<Character> st = new Stack<Character>();
            String rev= "";

            for (int i = 0; i < str.length(); i++) {
               if (str.charAt(i)!=' ') {
                   st.push(str.charAt(i));
               }else {
                   while (!st.isEmpty()) {
                       rev = rev + st.pop();
                   }
               }
               rev = rev + " ";
            }

            while (!st.isEmpty()) {
                rev = rev + st.pop();
            }

            System.out.println(rev);
        }
}


//write a program to reverse a word in a sentence
//Input-> How are you
//Output-> woH era uoynn