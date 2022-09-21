public class Main {

    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {     //şartın öznesi yazıldı
            case 'A':       // durumlar

                System.out.println("A ile geçtiniz");
                break;       // kodu kırar ve çıkar
            case 'B':

                System.out.println("B ile geçtiniz");
                break;
            case 'C':

                System.out.println("C ile geçtiniz");
                break;
            case 'D':

                System.out.println("D ile geçtiniz");
                break;
            case 'F':
                System.out.println("kaldınız");
                break;

            default: // verilen caseler dışında bir değer girilmesi durumunda kullanıldı
                System.out.println("geçersiz not bilgisi girdiniz!");
        }

    }
}