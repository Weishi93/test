/**
 * Created by Wei Shi on 3/25/17.
 */
class A {
    void print() {
        System.out.println("This is A.");
    }
}
class B extends A{
    void print() {
        System.out.println("This is B.");
    }
}
public class SubClassTest {
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}
