public class Main {
    public static void main(String[] args) {

        //!!!!!!! override: eziyor üst sınıfa gitmesini engelle kendi sınıfındaki metodu çalıştır.

        Hayvan hayvan = new Hayvan();
        hayvan.sesVer();

        Kedi kedi = new Kedi();
        kedi.sesVer();

        Kopek kopek = new Kopek();
        kopek.sesVer();
    }
}