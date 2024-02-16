public class Main {
    public static void main(String[] args) {
              KumesKuslari kumes1 = new KumesKuslari();
               kumes1.hareket(); // Kümes Kuşları
               kumes1.solunum();
        System.out.println("----------------------------");

               Kuslar kuslar1 = new Kuslar();
               kuslar1.beslenme();
               kuslar1.hareket();
               kuslar1.ureme();
        System.out.println("----------------------------");

               Kuslar kumes2= new KumesKuslari();
                kumes2.hareket();
                kumes2.beslenme();
                kumes2.ureme();
                kumes2.solunum();
        System.out.println(kumes2.gorurMu);
        System.out.println("----------------------------");

               Hayvanlar kumes3 = new KumesKuslari();
               kumes3.hareket();
               kumes3.beslenme();
               kumes3.ureme();
               kumes3.solunum();

        System.out.println("----------------------------");
               Hayvanlar kuslar2=new Kuslar();
               kumes3.hareket();
               kumes3.beslenme();
               kumes3.ureme();
               kumes3.solunum();
        System.out.println("----------------------------");

        Hayvanlar hayvan = new Hayvanlar();
        hayvan.ureme();
    }
}