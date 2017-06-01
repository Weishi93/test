import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by Wei Shi on 3/25/17.
 */
class A {
    void print() {
        System.out.println("This is A.");
    }
}
class B extends A implements C {
    void print() {
        System.out.println("This is B.");
    }
    public void CPrint() {
        System.out.println("This is C Print in B");
        System.out.println(arr.length);
    }
}
class D extends A implements C {
    void print() {
        super.print();
    }
    public void CPrint() {
        System.out.println("This is C Print in D");
        System.out.println(arr.length);
    }
}
public class SubClassTest {
    public static void main(String[] args) {
        A a = new B();
        a.print();
        C c = (C)a;
        C d = new D();
        c.CPrint();
        d.CPrint();
    }
}

interface C {
    int[] arr = new int[2];
    void CPrint();
}
