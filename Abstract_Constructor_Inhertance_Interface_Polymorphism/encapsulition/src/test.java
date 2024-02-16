public class test {

    // constructor ile atama yöntmei ya da getter setter kullananbilirlz.
    private Long id;
    private String isim;
    private  String soyisim;
    private  int maas;

    public test(Long id, String isim, String soyisim, int maas) {
        this.id=id;
        this.isim=isim;
        this.soyisim=soyisim;
        this.maas=maas;
    }

    public test() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIsim() {
        return isim;
    }
    public boolean setIsim(String isim) {
        this.isim = isim;
    }
    public String getSoyisim() {
        return soyisim;
    }
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
    public int getMaas() {
        return maas;
    }
    public void setMaas(int maas) {
        if (maas<=1500 && maas>=7000){
            this.maas=maas;
        }

    }
}
