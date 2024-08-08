package TreeDSA;

import java.util.HashMap;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i< str.length()/2; i++){
            char c=str.charAt(i);
            char e = str.charAt(str.length()-1);
            if (c!=e){
                flag=false;
            }
        }
        System.out.println(flag);

    }
//    public static void main(String[] args) {//anagram
//        String str = "swarup";
//        String str2 = "puraws";
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (char c : str.toCharArray()){
//            map.put(c, 0);
//        }
//        for (char c : str2.toCharArray()){
//            if (map.containsKey(c)){
//                int val = map.get(c);
//                val++;
//            }
//        }
//
//        for (int i :)
//    }
}
