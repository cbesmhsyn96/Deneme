package paket;

public class A extends Soyut{
    protected String isim = "ASDdad";
    private int deger = 35;
    public void setDeger(int deger){
        this.deger = deger;
    }

    public int getDeger() {
        return deger;
    }

    public void goster() {
        super.goster();
    }

    public void dd(){
        System.out.println("sadasdasd");
    }
}
