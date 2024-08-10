package StringDSA;

public class StringBuilderExampler {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append("Hii");
        sb.append(" ");
        sb.append("How are You?");
        System.out.println(sb.toString());

        sb.insert(4, "Swaroop ");
        System.out.println(sb.toString());

        sb.replace(4, 11,"Chavan");
        System.out.println(sb.toString());



    }
}
