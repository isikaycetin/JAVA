public abstract class Muhasebe extends Personel{ // personel abstract kullandık çünkü obje oluşturulmayacak
    protected int saatUcreti;
    protected int aylikCalismaSuresi;
    protected int maas;

    protected abstract int saatUcreti();
    protected abstract int aylikCalismaSuresi();

    protected int maas(int saatUcreti, int aylikCalismaSuresi){
        int maas= saatUcreti*aylikCalismaSuresi;
        return maas;
    }








}
