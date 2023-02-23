package paket;

public class PaketChild extends PaketParent {
    private String childAd;
    private String getChildSoyad;
    public PaketChild(String ad, String soyad) {
        super(ad, soyad);
        setChildAd(ad);
        setChildSoyad(soyad);
        System.out.println(gosterChildAdSoyad());
    }
    private String gosterChildAdSoyad(){
        return "Child ad :"+getChildAd()+"Child soyad :"+getChildSoyad();
    }
    public String setChildAd(String childAd) {
        return this.childAd = childAd;
    }

    public String setChildSoyad(String getChildSoyad) {
        return this.getChildSoyad = getChildSoyad;
    }

    public String getChildAd() {
        return childAd;
    }
    public String getChildSoyad() {
        return getChildSoyad;
    }
}
