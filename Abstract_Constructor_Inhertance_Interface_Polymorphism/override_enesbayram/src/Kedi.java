public class Kedi extends Hayvan {

    @Override
    public void sesVer() {
        System.out.println("Kedi ses ver");
      //  super.sesVer();       // üst sınıfa gitmesi için override açıp bunuda kullanabiliriz. hayvana gider
    }
}
