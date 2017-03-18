import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wei Shi on 2017/2/11.
 */
public class test {
    public static void main(String[] args) {
//        System.out.println(1233);
//        List<String> list = new ArrayList<>();
//        list.add("hi");
//        list.add(" there");
//        String[] array = new String[list.size()];
//        array = list.toArray(array);
//        for (String s : array) {
//            System.out.println(s);
//        }
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        System.out.println(test.remove(new Integer(3)));
        System.out.println(test);
    }
}
