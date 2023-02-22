package paket;

public class Main {
    public static void main(String[] args) {
        ParentSinif lamba = new ParentSinif("Derviş");
        lamba.gosterMethod();
        lamba.soyad = "Özer";
        AltSinif altSinif = new AltSinif("Hüseyin");
    }
}