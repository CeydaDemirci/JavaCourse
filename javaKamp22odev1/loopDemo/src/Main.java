public class Main {

    public static void main(String[] args) {
    //for loops
        int i; // or for(int i =1; i<10; i++)
        for (i=1; i<10; i++){ // i 10dan küçük olduğu sürece sayaç bir bir artarak döngüye girdi
            System.out.println(i);
        }
        System.out.println("Döngü sonlandı");

        for(int a=1; a<15; a+=2){ // tek sayılari yazdırdı
            System.out.println(a);
        }
        System.out.println("tek sayılar döngüsü sonlandı");

        for(int b=0; b<15; b+=2){ //çift sayılari yazdırdı
            System.out.println(b);
        }
        System.out.println("çift sayılar döngüsü sonlandı");

    // while loops
        int c = 1;
        while(c<10){ // şart sağlanmadığı sürece hiçbir şekilde döngüye girmez
            System.out.println(c);
            c++;
        }
        System.out.println("while döngüsü sonlandı");

    // Do-While loops
        int d=0 ;
        do {            //şart sağlanmasa bile bir kere döngüye girer çünkü önce do içine girip sonra while döngüsüne giriyor.
            System.out.println(d);
            d+=2;

        }while (d<15);
        System.out.println("Do-while döngüsü sonlandı");
    }

}