public class Main {

    public static void main(String[] args) {

        double[] mylist = {1.2, 3.5, 4.8, 6.2, 2.6}; //dizi elemanlarını bu şekilde de yazabiliriz.
        double total = 0;
        double maxSayi = mylist[0];
        for (double i : mylist) {
            if (maxSayi < i) { // en büyük sayı olarak aldığımız değer dizideki diğer değerden küçükse yeni en büyük sayi büyük olan değer olarak atanır.
                maxSayi = i;
            }
            total = total + i; // toplama işlemi yapılır.
            System.out.println(i);
        }
        System.out.println("toplam: " + total);
        System.out.println("en büyük sayi: " + maxSayi);
    }
}