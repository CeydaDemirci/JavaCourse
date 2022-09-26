public class Main {
    public static void main(String[] args) {
        // void operasyonlara bir şeyi yapması söylenir.
        // void sonuç olarak hiçbir şey vermez.
        // void olan operasyonları bir değere atayamayız

        String mesaj = "bugun hava cok güzel.";
        String yeniMesaj= sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("eklendi");

    }

    public static void guncelle() {
        System.out.println("eklendi");
        return; // bitir ve metodu devam ettırme demek

    }
    public static int topla(int sayi1, int sayi2) {
        return sayi1+sayi2; // bitir ama sayi1+sayi2 işlemini döndür demek
    }

    public static String  sehirVer() {
    return "Ankara";
    }
}