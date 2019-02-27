package task22;

public class MemberOfOuterClass {
    static char star = '*';
    static class Inner1 {
        void print() {
            System.out.println(star);
        }
    }
}

