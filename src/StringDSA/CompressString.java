package StringDSA;

public class CompressString {
    public static void main(String[] args) {
        String str5 = "aabaaccccabb";
        StringBuilder str = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str5.length(); i++) {
            if (i + 1 < str5.length() && str5.charAt(i) == str5.charAt(i + 1)) {
                count++;
            } else {
                str.append(str5.charAt(i));
                str.append(count);
                count = 1;
            }
        }

        System.out.println(str.toString());
    }
}
