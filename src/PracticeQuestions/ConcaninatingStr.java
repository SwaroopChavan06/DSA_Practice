package PracticeQuestions;

public class ConcaninatingStr {
    static boolean checkstr(String str, String A, String B){
        if (A.concat(B).equals(str)){
            return true;
        }else if (B.concat(A).equals(str)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String S = "srcsrc";
        String A = "src";
        String B = "src";
        System.out.println(checkstr(S, A, B));


        if(A.length()>B.length()){
            System.out.println(A.length());
        }else if(A.length()<B.length()){
            System.out.println(B.length());
        }else {
            System.out.println(" ");
        }

    }
}
