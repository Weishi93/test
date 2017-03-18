import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Wei Shi on 2017/3/18.
 */
public class ListToArrayTest {
/*
 * List.toArray() 可以把List变成数组，里面可以传个参数，表明把转到这个数组里面。
 * 需要注意的是，如果给的这个数组容量小于list.size()，那么toArray()会返回一个新的数组。
 * 如果给的数组容量大于等于List.size()，就会把list的内容放进这个数组里面，多余的空位填充Null
 */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        String[] words = new String[4];

        System.out.println(Arrays.toString(list.toArray(words)));
        System.out.println(Arrays.toString(words));
    }


}
