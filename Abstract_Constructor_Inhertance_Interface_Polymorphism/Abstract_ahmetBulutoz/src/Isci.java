public class Isci extends Muhasebe {
    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200  ;
    }

    @Override
    public String toString() {
        return "Isci{" +
                "saatUcreti=" + saatUcreti +
                '}';
    }
}
