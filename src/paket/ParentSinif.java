package paket;

public class ParentSinif {
    private String ad;
    protected String soyad = "Akcan";
    public ParentSinif(String ad) {
        this.ad = ad;
        //System.out.println("Lamba sınıfı ad "+this.ad);
    }
    public void gosterMethod(){
        System.out.println("Lamba ad "+ ad);
    }
}