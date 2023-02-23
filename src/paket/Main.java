package paket;
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Hüseyin","Akcan");
        System.out.println("Ad "+parent.getAd()+ "\nSoyad "+parent.getSoyad());
    }
}