package StringDSA;

public class StringRotation {
    public static void main(String[] args) {

        String word1 = "swaroop";
        String word2 = "roopswa";

        boolean ans = false;
        char[] arr = word1.toCharArray();


        for (int j = 0; j < arr.length; j++) {

            StringBuilder sc = new StringBuilder();
            char firstValue = arr[0];
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = firstValue;

            for(int k = 0 ; k < n;k++){
                sc.append(arr[k]);
            }

            String word = sc.toString();

            if(word.equals(word2)){
                ans = true;
                break;
            }
        }
        System.out.println(ans);
    }
}