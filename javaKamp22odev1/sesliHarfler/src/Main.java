public class Main {
    public static void main(String[] args) {

        char harf='B';


        switch (harf) {

            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf+ " kalın sesli harftir");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println(harf+ "ince sesli harftir");
                break;

            default:
                System.out.println("geçersiz harf girdiniz");
                break;
        }
    }
}