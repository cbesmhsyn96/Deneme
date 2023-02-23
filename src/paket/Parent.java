package paket;

public class Parent {
    protected String ad;
    public Parent(String ad) {
        this.ad = ad;
        System.out.println("Şuan Parent sınıfı yapıcı metodu çağırıldı ==> "+ad);
    }
}
