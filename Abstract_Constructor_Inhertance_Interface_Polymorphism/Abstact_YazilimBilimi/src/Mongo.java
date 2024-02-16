public class Mongo extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("MongoDB Güncellendi........");
    }

    @Override
    void get() {
        System.out.println("MongoDB Verileri ALındı........");
    }
}
