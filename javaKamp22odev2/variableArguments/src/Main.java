
public class Main {

    public static void main(String[] args) {
        int toplam = topla(2, 3, 4, 8, 0); // arka planda diziye çevirir.
        System.out.println("toplam : " + toplam);
    }
    public static int topla(int... sayilar) { // ... birden fazla olabilir demek. int array gibi çalışıyor.
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;

    }

}