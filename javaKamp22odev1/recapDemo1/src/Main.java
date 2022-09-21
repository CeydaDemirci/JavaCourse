public class Main {

    public static void main(String[] args) {

        int sayi1 = 25;
        int sayi2 = 17;
        int sayi3 = 5;
        int buyukSayi = sayi1;

        if (buyukSayi<sayi2) {
            buyukSayi = sayi2;

        }
        else if (buyukSayi<sayi3){
            buyukSayi = sayi3;

        }

        System.out.println("en büyük sayı : " +buyukSayi);
    }

}