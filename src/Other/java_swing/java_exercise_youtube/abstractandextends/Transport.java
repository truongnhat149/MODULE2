package java_exercise_youtube.abstractandextends;

public abstract class Transport {
    protected String nameCarriage; // loại phương tiện
    protected Manuafacture manuafacturer; // hãng sản xuất

    public Transport(String nameCarriage, Manuafacture manuafacturer) {
        this.nameCarriage = nameCarriage;
        this.manuafacturer = manuafacturer;
    }

    public String getNameCarriage() {
        return nameCarriage;
    }

    public void setNameCarriage(String nameCarriage) {
        this.nameCarriage = nameCarriage;
    }

    public String getNameManuafacturer() {
        return this.manuafacturer.getNameManuafacture();
    }

    void start() {
        System.out.println("-----Start----");
    }

    void acceleration() {
        System.out.println("-----Acceleration----");
    } // tăng tốc

    void stop() {
        System.out.println("Stop");
    }

     abstract double getSpeed();
}
