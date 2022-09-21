public class Main {
    public static void main(String[] args) {

        // çok boyutlu diziler

        String[][] sehirler = new String[3][4]; // satır ve sütun olarak yazılır.

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "bursa";
        sehirler[0][2] = "bilecik";
        sehirler[0][3] = "edirne";
        sehirler[1][0] = "kayseri";
        sehirler[1][1] = "konya";
        sehirler[1][2] = "ankara";
        sehirler[1][3] = "nevşehir";
        sehirler[2][0] = "samsun";
        sehirler[2][1] = "giresun";
        sehirler[2][2] = "sinop";
        sehirler[2][3] = "çorum";

        for (int i = 0; i <= 2; i++) {
            System.out.println("++++++++++++++++++++++++++++++");
            for (int j = 0; j <= 3; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

    }

}