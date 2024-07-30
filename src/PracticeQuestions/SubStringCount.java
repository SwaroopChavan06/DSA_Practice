package PracticeQuestions;


public class SubStringCount {

    static int subString(String S, int x) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {

            for (int j = i + 1; j < S.length(); j++) {
                String substring = S.substring(i, j+1);

                int num = Integer.parseInt(substring);

                if (num > x) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String S = "2222";
        int x = 20;
        System.out.println(subString(S, x));
    }
}