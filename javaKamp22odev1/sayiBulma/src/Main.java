public class Main {
    public static void main(String[] args) {


        int [] sayilar = new int[] {1,2,4,5,8,0};
        int aranacak = 7;
        boolean varMi = false;

        for (int sayi : sayilar){ // sayılar dizisinin tüm elemanlarını gezer.
            if (sayi == aranacak){

                varMi = true;
                break;

            }

        }
        if (varMi){
            System.out.println(aranacak+ " sayısı bu dizide vardır.");
        }
        else {
            System.out.println(aranacak+ " sayısı bu dizide yoktur.");
        }
    }
}