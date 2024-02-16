public abstract class AbstractDatabase {
      public void add(){   //Her class için aynı olanlar miras alsın gibi
          System.out.println("Eklendi");
      }
      public void delete(){  //Her class için aynı olanlar miras alsın gibi
        System.out.println("Silindi");
    }

      abstract void update();  // Her class a özgü olmalı demek ayır ayrı
      abstract void get();    // Her class a özgü olmalı demek ayır ayrı


}
