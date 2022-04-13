package example;

public class TestStatic {


    public static class B {

    }
    void a( int a) {

    }
    public class C {
        public class D{

        }
    }
    public static void main(String[] args) {
        TestStatic o = new TestStatic();
        TestStatic.B tc = new TestStatic.B();
        TestStatic.C a = new TestStatic().new C();
    }
}
