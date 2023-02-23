package paket;

public class Child extends Parent{
    public Child(String ad){
        super(ad);
        System.out.println("Şuan Child sınıfı yapıcu metodu çalıştı  ==> "+ ad);
    }
}
