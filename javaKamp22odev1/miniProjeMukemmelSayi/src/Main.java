public class Main {
    public static void main(String[] args) {

        int number= 6 ;
        int total =0;

        if (number<0){
            System.out.println("geçersiz sayı girdiniz");
            return;
        }
        for (int i =1; i<number; i++){
            if (number %i == 0){
                total=total+i; //tam bölen i değerlerini toplar
                System.out.println("bölen: "+i); // bölen sayıları ekrana yazdırır


            }
        }
        System.out.println("bölenleri toplamı: "+total); //toplam değerini ekrana yazdırır
        if (total == number){
            System.out.println(number+ " sayısı mükemmel sayı");
        }
        else {
            System.out.println(number+ " sayısı mükemmel sayı değildir.");
        }

    }
}