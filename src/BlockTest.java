/**
 * Created by Wei Shi on 6/27/17.
 */
public class BlockTest {
    public static void main(String[] args) {
        int x = 1;
        {
            int m = 3;
        }
        System.out.println(x);
        System.out.println(m); // ERROR
    }
}
