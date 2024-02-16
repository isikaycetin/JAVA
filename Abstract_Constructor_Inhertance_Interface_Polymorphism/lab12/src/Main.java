public class Main {

    public static int bolme(int d, int n)
    throws ArithmeticException
    {
        return d / n;
    }

    public static void main(String[] args) {
        System.out.println("Sonuc : ");
        //  int sonuc= bolme(5,0);

       int sonuc=0;
        try {
           sonuc = bolme(5, 0);
        } catch (Exception ex) {
            System.out.println("Hata : " + ex.getMessage());
            throw new RuntimeException("Çalışma zamanı hatası oluştu!!");
        } finally {
            System.out.println("sonuc :"+ sonuc);
        }
    }
}