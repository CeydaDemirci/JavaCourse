public class Main {
    public static void main(String[] args) {

        int number = 45;
        int kalan = number % 2;
        System.out.println("kalan : " + kalan);
        boolean isPrime = true; // ilk başta sayıyı asal kabul eder

        if (number == 1) {
            System.out.println(number+ " sayısı asal değildir ");
            return; // for döngüsüne girmez
        }

        if (number<1) {
            System.out.println("geçersiz sayı ");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(" bölenleri:  " +i);
                isPrime = false; //kalan 0 olursa sayıyı asal değildir olarak kabul eder.
            }
        }
        if (isPrime == true){ // if(isPrime) yazılımı da true olarak kabul eder.
            System.out.println( number+ " sayısı asaldır");
        }
        else {
            System.out.println(number+ " sayısı asal değildir.");
        }
    }
}