public class B extends C{ //B sınıfında önce C sınıfı gelir.
    public int b1;
    public int b2;
    public B() {
        System.out.println("Şuanda B classının içerisindeyiz");
    }
    public B(int b1){
        this.b1=b1;
    }
   public B(int b1,int b2){
        this.b1=b1;
        this.b2=b2;
   }

    public void bSifininMethodu(){
        System.out.println("B sınıfının içindeki methottayız");
    }
    public void animalSound() {
        System.out.println("miyav miyav hır hır");
    }
}


