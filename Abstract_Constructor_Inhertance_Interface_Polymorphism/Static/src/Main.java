public class Main {
    public static void main(String[] args) {
        //Static
        /*Static tanımı:nesne oluşturmandan direk class ın adıyla çağımak
        ör:Ogrenci.bilgi()   */
       //Static Method Kullanımı

       Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setId(5L);
        ogrenci1.setAd("Enes");
        ogrenci1.setSoyad("Bayram");
        ogrenci1.numara=1220505031;
        System.out.println(ogrenci1.numara);
        System.out.println(ogrenci1.getAd());
        System.out.println("------------------");
        ogrenci1.ogrenciBilgileri();
        System.out.println("------------------");
        // Eğer  numaraya static dersek 2. nesnede aynı numaraya ulaşır null değerini vermez.
      Ogrenci ogrenci2 = new Ogrenci();
        System.out.println(ogrenci2.numara);
        System.out.println(ogrenci2.getAd());

    }
}