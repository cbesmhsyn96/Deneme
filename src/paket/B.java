package paket;

public class B extends A{
    protected String isim = "rrrrrrrrrrr";
    private int deger = 45;
    public void setDeger(int deger){
        this.deger = deger;
    }
    @Override
    public int getDeger() {
        return deger;
    }

    public void gosterBB(){
        System.out.println("B isim ==> "+isim);
        System.out.println("A isim ==> "+super.isim);
    }

    public void ff(){
        super.dd();
        System.out.println("A sınıfı private tipindeki deger degiskenine erişim");
        System.out.println("A sınıfı deger ==> "+super.getDeger());
    }

    public void gg(){
        System.out.println(super.isim);
        super.getDeger();
        super.dd();
    }
}
