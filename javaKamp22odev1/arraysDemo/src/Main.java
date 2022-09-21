import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] ogrenciler = new String[3]; // string[3] kaç elemanlı olacağını gösteriyor. 0,1,2. index
        ogrenciler[0]= "Ceyda";
        ogrenciler[1]= "Dilan";
        ogrenciler[2]= "Ayla" ;

        for (int i=0; i<ogrenciler.length; i++){ //ogrenciler.lengh öğrenciler dizisinin uzunluğundan küçük olmasını gösterir

            System.out.println(ogrenciler[i]);
        }
        System.out.println("---------------");

        for (String ogrenci:ogrenciler){// öğrenciler dizisindeki her bir elemanı gezer

            System.out.println(ogrenci);
        }
    }
}