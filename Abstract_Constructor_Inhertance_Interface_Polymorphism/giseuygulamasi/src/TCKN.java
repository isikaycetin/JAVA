import java.util.Random;

public class TCKN {

    private Long id;
    private  String dogumYeri;
    private  String tckn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public String getTckn() {
        return tckn;
    }
    public void sonucuYazdır(String sonuc){
        System.out.println(sonuc);
    }
     boolean kontrol=true;
    public void setTckn(String tckn) {
         if(tckn.length()==11){          //Uzunluk 11 haneli mi
                   for (int i=0; i<tckn.length(); i++){   //değeleri al karakter va rmı kontrol et
                                  char karakter = tckn.charAt(i);
                                  if (Character.isDigit(karakter)){  // hepsi rakamsa true
                                  kontrol=true;
                              }else {
                                 kontrol=false;
                                 break;
                              }
                   }if(kontrol){
                        Random random= new Random();
                        this.tckn=tckn;
                        int giseNo= random.nextInt(100);  //100 kadar random sayı üret
                        sonucuYazdır("Gise No : " +giseNo);
                    }else {
        ""               sonucuYazdır("Lütfen bütün karakaterleri rakam olacak şekilde giriniz. ! ");
                    }
         }else {
                sonucuYazdır("TCKN 11 haneli olmak zorundadır !");
         }
    }
}
