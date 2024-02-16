public class A extends B { // A sınıfında önce B gelir
    public int a1;
    public int a2;

    public A(){
        System.out.println("Şu anda A classının içerisindeyiz.");
    }

    public A(int a1, int a2) {
       /* this.a1 = a1;
        this.a2 = a2;   */
        super(a1,a2);
    }
    public void goster(){
        System.out.println("A nesnesini test etmek için");
    }
    public void aSinifininMethodu(){
        System.out.println("A sınıfının içindeki metottayız");
        super.bSifininMethodu();  // üst classa git
    }
    public void animalSound() {
        System.out.println(" hav hav hav hav");
    }

}
