public class Main {
    public static void main(String[] args) {
       /*  1. Bir classı yüzlerce class miras alabilir fakat bir class şadece bir kişiyi miras alabilir.
           2. Protected erişin belirleyici nedir ?
           3. Yapıcı metotların çalışma yapısı nasıl oluyor ?
           4. this, super,
              super():
               1.En üstte olmalı
               2.Yapıcı metot içinde kullanılmalı
            5.meth0d override kavramı nedir ?                                 */

        Hayvan hayvan = new Hayvan();  // hayvan classından da erişebliriz
        hayvan.nefesAl();
        System.out.println("---------------------");

        Kopek kopek = new Kopek();
        kopek.nefesAl();
        System.out.println("--------------------------");

        /* Overloading: aynı isim farklı signature ile aynı class a birden fazla  method oluşturma imkanı*/
        /* Overridng: parent class da var olan bir method un child class da oluşturulan aynı isim ve signature a
        sahip bir method tarafından geçersiz kılınmasıdır.
          --> Overriding de methodlar da aşağı inme çocuğa inme vardır ama variablelrde yoktur
                örnek:yöntem() bunda iner ----- neferAlır bunda yukarı doğru

          */

        //Her zaman en üstte olan gelir.Ağaç modeli gibi
       /* A a = new A(5, 8);
        a.aSinifininMethodu();
        System.out.println("------------------");
        System.out.println("B değişkeni-1 :" + a.b1);
        System.out.println("B değişkeni-2 :" + a.b2);
        System.out.println("------------------");
        System.out.println("------------------");
         */
        System.out.println("---------------------------------------");
      C myAnimal = new C();
        System.out.println("---------------------------------------");
      B myDog = new B();
        System.out.println("---------------------------------------");
        A myCat = new A();
        System.out.println("---------------------------------------");

        A a = new A();
        a.bSifininMethodu();

    }
}