package paket;

public class Parent {
    private String ad;
    private String soyad;
    public Parent(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad(){
        return soyad;
    }

    public String setAd(String ad){
        return this.ad = ad;
    }

    public String setSoyad(String soyad){
        return this.soyad = soyad;
    }
}