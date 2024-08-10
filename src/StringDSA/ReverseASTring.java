package StringDSA;

import java.util.Scanner;

public class ReverseASTring {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        String str= in.nextLine();
        String str2="";

        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            str2= ch+str2;
        }

        System.out.println(str2);
    }
}
