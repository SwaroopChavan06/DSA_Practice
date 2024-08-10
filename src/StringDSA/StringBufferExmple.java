package StringDSA;

public class StringBufferExmple {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        sb.append("Hi...");
        sb.append(" ");
        sb.append("SRC!");
        System.out.println(sb.toString());

        sb.insert(2, " AKA Swaroop");
        System.out.println(sb.toString());


    }
}
