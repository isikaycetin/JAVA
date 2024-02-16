public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // klonlama
        // derin ve
        // sığ kopyalama
        // equals: == ile aynıdır eşit eşit demektir
        // toString: onjeyi string fomksiyonuna çevirir.
        insan ali = new insan();
        insan ahmet=ali;     // Shallow copy = sığ kopyalama
        ali.boy=180;
        System.out.println(ahmet.boy);
          if (ali==ahmet){
              System.out.println("Eşittir");
          }
          if (ali.equals(ahmet)){
              System.out.println("Eşittrrri");
          }
        System.out.println("-----------------------");
          ogrenci ayse = new ogrenci();
          ayse.boy=160;
          ogrenci fatma= ((ogrenci)ayse.kopyala()); // Deep Copy = derin kopyalama
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        fatma.boy=190;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);

        System.out.println(ayse);
        System.out.println(ayse.hashCode());
    }
}