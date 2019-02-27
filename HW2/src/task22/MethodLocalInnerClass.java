package task22;

public class MethodLocalInnerClass {
	void sum() {
        final int x = 10;
        class Inner2 {
            void sum() {
                System.out.println("a = " + (x + x));
            }
        }
        Inner2 inner = new Inner2();
        inner.sum();
    }
}
