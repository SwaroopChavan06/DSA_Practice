package StringDSA;

import java.util.Locale;
import java.util.Scanner;

public class PallindromStringOrNot {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str= in.nextLine();
        String str2="";
        str=str.toLowerCase(Locale.ROOT);
        System.out.println(str);
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            str2= ch+str2;
        }
        System.out.println(str2);
        if(str.equals(str2)){
            System.out.println("Palindrom");
        }else {
            System.out.println("Not Palindrom");
        }
    }
}
