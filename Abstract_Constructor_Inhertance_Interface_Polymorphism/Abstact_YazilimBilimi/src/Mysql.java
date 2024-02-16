public class Mysql extends AbstractDatabase{

    @Override
    void update() {
        System.out.println("Mysql Güncellendi........");
    }

    @Override
    void get() {
        System.out.println("Mysql Verileri Alındı.......");
    }
}
