/**
 * Created by Wei Shi on 5/7/17.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Test for "final" keyword.
 * Final class cannot be subclassed.
 * Final method cannot be overidden
 */
public class FinalTest {
    static final List list = new ArrayList();
    public static void main(String[] args) {
//        list = new ArrayList(); // error, cannot change the value of a final variable
        list.add(1); // but could change the content of this final reference
    }
}

final class FinalClass {
    public final void print() {
        System.out.println("This is a message from FinalClass");
    }
}
//class subclass extends FinalClass { // error, cannot extend from final class
//    @Override
//    public void print() { // error, cannot override final method
//
//    }
//}