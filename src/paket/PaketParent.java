package paket;

import com.sun.javaws.IconUtil;

public class PaketParent {
    private String ad;
    private String soyad;
    public PaketParent(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        System.out.println("Parent yapıcısı çalıştı.");
        System.out.println(gosterParentAdSoyad());
    }
    private String gosterParentAdSoyad(){
        return "Parent ad:"+getAd()+"\nParent soyad :"+getSoyad();
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