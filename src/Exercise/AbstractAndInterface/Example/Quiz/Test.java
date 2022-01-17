package Exercise.AbstractAndInterface.Example.Quiz;

public class Test {
    public static void main(String[] args) {
        Hinh h2 = new TamGiac();
        Hinh h3 = new ChuNhat();
        Hinh h1 = new Tron();
//        Hinh h2 = new DaGiac();
        Hinh h5 = h1;
//        DaGiac h4 = h2;
        Tron h6 = (Tron) h1;
        h2 = h3;
    }
}
