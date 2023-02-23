package paket2;

import paket.Parent;

public class Main {
    public static void main(String[] args) {
        ChildPaket2 childPaket2 = new ChildPaket2();
        Parent parent = new Parent("Bahaeddin","Canbakan");
        parent.setAd("Hüseyin");
        parent.setSoyad("Akcan");
        System.out.println("Ad "+parent.getAd()+"\nSoyad "+parent.getSoyad());
    }
}
