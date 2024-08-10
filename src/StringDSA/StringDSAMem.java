package StringDSA;

public class StringDSAMem {
    public static void main(String[] args) {
        String name = "Swaroop";
        String lastname = "Chavan";

        int len = name.length();
        System.out.println(len);

        System.out.println();
        String str = name + " " + lastname;
        System.out.println(str);

        String str2 = name.concat(" " + lastname);
        System.out.println(str2);

        char a1 = name.charAt(3);
        System.out.println(a1);

        String str3 = name.substring(1, 3);
        System.out.println(str3);
        System.out.println(name.equals(lastname));

        String fullname = "My Name is Swaroop Chavan";
        boolean isPresent = fullname.contains("is");
        System.out.println(fullname);

        System.out.println(isPresent);

        System.out.println(fullname.indexOf('N'));
        String fullname2 = fullname.replace("N", "n");
        System.out.println(fullname2);

        String[] str5=name.split("r");
        System.out.println(str5[0]+" ");
        System.out.println(str5[1]);


    }
}
