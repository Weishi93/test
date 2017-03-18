/**
 * Created by Wei Shi on 2017/3/17.
 */
public class InnerClassTest {
    class Inner {
        void printHello() {
            System.out.println("Hello from Inner");
        }
    }
    static class StaticInner {
        void printHello() {
            System.out.println("Hello from Static Inner");
        }
    }


    void printHello() {
        System.out.println("Hello from Outer");
    }
    public static void main(String[] args) {
        InnerClassTest test = new InnerClassTest();
        Inner i = test.new Inner();
        StaticInner si = new StaticInner();

        i.printHello();
        test.printHello();
        si.printHello();
    }

}
