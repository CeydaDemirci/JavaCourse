public class Main {
    public static void main(String[] args) {
    sayiBulmaca(); // bir metodu çağırabilmek için kullanıldı


    }
    public static void sayiBulmaca(){  // fonksiyon yazarak kendini tekrarlama engellenmiş olur
        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            mesajVer("sayi mevcuttur: " +aranacak);// metot olarak verildi
        }
        else {
            mesajVer("sayi mevcut değildir: " +aranacak);        }
    }

    public static void mesajVer(String mesaj){ // parametreli metot örneğidir.

        System.out.println(mesaj); // bir mesaj oluşturuldu ve mesaj metot olarak çağırıldı

    }
}