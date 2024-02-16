public class Personel { // personel abstract kullandık çünkü obje oluşturulmayacak.
    static final String sirketIsmi="Yildiz Celik";  // static heryerden ulaşmak final da değiştirilemez
    static final String sirketAdresi="Ankara / Türkiye";
    protected String isim="Deger Girilmemis";
    protected String soyisim="Deger Girilmemis";
    protected String tcNo="Deger Girilmemis";
    protected String telefon="Deger Girilmemis";
    protected String iseBaslamaTarihi="Deger Girilmemis";
    protected String sigortaNo="Deger Girilmemis";
    static int personelSayac=1000;
    protected  String personelNo;
    protected String personelNo()
       {
         personelSayac++;
         String no=personelSayac+"";
         return no;
       }

}
