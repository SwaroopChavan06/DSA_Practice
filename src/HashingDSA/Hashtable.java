package HashingDSA;
import java.util.Map;

public class Hashtable {
    public static void main(String[] args) {
        java.util.Hashtable<Integer, String > tb = new java.util.Hashtable<>();

        tb.put(10, "konkan");
        tb.put(1, "pune");
        tb.put(12, "goa");
        tb.put(16, "kolhapur");
        tb.put(19, "latur");
        tb.put(25, "mumbai");
        tb.put(56, "ratnagiri");
        tb.put(48, "raygad");

//        tb.remove(12);
        System.out.println(tb.containsKey(56));
        System.out.println(tb.containsValue("konkan"));
        System.out.println(tb);
        System.out.println(tb.size());
        tb.put(48, "maharashtra");
        System.out.println(tb);

        int arr[] = {12, 10, 45, 78, 79 ,46 , 42, 15, 19};

        for(Integer pt : tb.keySet()) {
            System.out.println(pt);
        }
        for(String str : tb.values()) {
            System.out.println(str);
        }

        for (Map.Entry<Integer, String> pt : tb.entrySet()){
            System.out.println(pt.getKey()+" "+pt.getValue());
        }
    }
}
