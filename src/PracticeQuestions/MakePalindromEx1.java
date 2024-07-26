package PracticeQuestions;

public class MakePalindromEx1 {

    int MakePalindrome(String str) {

        int count = 0, i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                if ((str.charAt(i) == str.charAt(j - 1)) || (str.charAt(j) == str.charAt(i + 1)))
                    count++;
                else
                    count += 2;

                if (str.charAt(i) == str.charAt(j - 1))
                    j--;
                else if (str.charAt(j) == str.charAt(i + 1))
                    i++;
                else {
                    i++;
                    j--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MakePalindromEx1 obj = new MakePalindromEx1();
        System.out.println(obj.MakePalindrome("aebcbda"));
    }
}
