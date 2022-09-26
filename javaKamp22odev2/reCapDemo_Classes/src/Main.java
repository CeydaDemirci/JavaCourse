public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Cikar(3, 5);
        int sonuc2 = dortIslem.Bol(10, 2);
        int sonuc3 = dortIslem.Carp(5, 4);
        int sonuc4 = dortIslem.Topla(7, 8);

        System.out.println("Çıkarma sonucu: " + sonuc);
        System.out.println("Bölme sonucu: " + sonuc2);
        System.out.println("Çarpma sonucu: " + sonuc3);
        System.out.println("Toplama sonucu: " + sonuc4);
    }
}