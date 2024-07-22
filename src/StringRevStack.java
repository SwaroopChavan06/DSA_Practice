import java.util.Scanner;
import java.util.Stack;

public class StringRevStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        String rev= "";
        while (!st.isEmpty()) {
            rev = rev + st.pop();
        }

        System.out.println(rev);
    }
}


//write a program to reverse a word in a sentence
