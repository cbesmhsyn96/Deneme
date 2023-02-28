package paket;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.gosterBB();
        b.ff();
        /*
        super keyi özellikleri
        ----------------------------------------------------------------------------------------
        üst sınıftaki metoda erişmek
                         ===================>Erişirken metot içinden erişiliyor.
        üst sınıftaki değişkene erişmek
                         ===================>Erişirken metot içinden erişiliyor.
        üst sınıftaki yapıcı fonksiyona erişmek
                         ======================================> Yapıcı metod içinden erişiliyor.

        Override kuralları
        ----------------------------------------------------------------------------------------
        Üst sınıftaki private metoda override yapılamaz.
        final veya statik metoda override yapılamaz.
        Constructor a override yapılamaz.
        Erişim belirleyicisinin düzeyi genişletilebilir ama daraltılamaz.
        Override' da isim aynı olmalı.
        Override' da metodun dönüş tipi veya parametreleri değiştirilemez.
         */
    }
}
