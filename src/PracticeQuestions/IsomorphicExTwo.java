package PracticeQuestions;

public class IsomorphicExTwo {

    public static boolean isIsomorphic(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] map = new int[256];

        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            int ch1Index = ch1;
            int ch2Index = ch2;

            if (map[ch1Index] == -1) {
                map[ch1Index] = ch2Index;
            } else if (map[ch1Index] != ch2Index) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicExTwo obj = new IsomorphicExTwo();
        System.out.println(obj.isIsomorphic("src", "abk"));
    }
}
