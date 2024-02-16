public class Ogrenci {
    private Long id;
    private String ad;
    private String soyad;
    public int numara;

    public static void goster(){

    }

    //Static bir metod içerisinde static olmayan hiçbir şeye erişemeyiz.(değişken,metot)
 /* public static void numaraYazdir(){
      System.out.println("Numara : "+ numara);
    } */
    public void ogrenciBilgileri(){
        System.out.println("id : "+ getId());
        System.out.println("ad : "+ getAd());
        System.out.println("soyad : "+ getSoyad());
        //  numaraYazdir();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}

