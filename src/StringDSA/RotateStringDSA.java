package StringDSA;

public class RotateStringDSA {

    public static void main(String[] args) {
        String word = "swaroop";
        String word1 = "pooraws";

        StringBuilder str = new StringBuilder(word);
        str.reverse();

        System.out.println();

        if (str.toString().equals(word1)) {
            System.out.println("String is Same");
        } else {
            System.out.println("String is not same");
        }

        System.out.println(str.toString());
    }
}
