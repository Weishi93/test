import java.util.HashSet;

/**
 * Created by Wei Shi on 5/23/17.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("A");
        String s2 = new String("A");
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("A");
        System.out.println(set.add(s1));
        System.out.println(set.add(s2));
        HashSet<StringBuilder> sbSet = new HashSet<>();
        System.out.println(sbSet.add(sb1));
        System.out.println(sbSet.add(sb2));
    }
}
