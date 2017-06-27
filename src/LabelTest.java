/**
 * Created by Wei Shi on 6/27/17.
 */
public class LabelTest {
    public static void main(String[] args) {
        label: {
            System.out.println("This is a label.");
            break label;
            System.out.println("This does not print.");
        }
    }

}
