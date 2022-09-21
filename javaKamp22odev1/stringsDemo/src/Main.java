public class Main {
    public static void main(String[] args) {

        String message = "Bugün günlerden pazartesi"; // string karakter dizisidir.
        System.out.println(message);
        System.out.println("--------------------------------------");

        System.out.println("Cümlenin eleman sayısı : " + message.length()); // cümlenin eleman sayısını verir
        System.out.println("7. elemani: " + message.charAt(6)); // boşluğu da eleman olarak sayıyor.
        // charAt belli bir metinde belli bir karakteri yakalamak için kullanılır.
        System.out.println("--------------------------------------");

        System.out.println(message.concat(" ve yarın salı "));//iki cümle için birleştirme yapar.
        String message2 = message.concat(" ve yarın salı");// yeni bir string oluşturabiliriz.
        System.out.println(message2);
        System.out.println("--------------------------------------");

        System.out.println(message.startsWith("B")); // b ile başlıyor mu kontrol eder. boolean true veya false yazdırır.
        System.out.println(message.startsWith("b")); // java case sensitive bir dil olduğu için false olur
        System.out.println(message2.endsWith("a")); // a ile bitiyor mu kontrol eder.
        System.out.println("--------------------------------------");

        char[] karakterler = new char[5];
        message.getChars(0, 5, karakterler, 0); // 0 dan itibaren 5e kadar karakterlere ata ve karakterlerin 0ıncı indexinden itibaren aktar
        System.out.println(karakterler);
        System.out.println("--------------------------------------");

        System.out.println(message.indexOf('a')); // belirtilen karakterin mesajın içerisinde kaçıncı eleman olduğunu bulmaya yarar. ilk bulduğu a yı verir sonrakıleri önemsemez
        System.out.println(message.lastIndexOf("i")); // aramaya sağdan başlar.
        System.out.println("--------------------------------------");

        System.out.println(message.replace( 'a', '+')); // karakterleri değiştirmek için kullanılır.
        String newMessage = message.replace('n' ,'*'); // yeni bir string değere de atayarak yapabiliriz.
        System.out.println(newMessage);
        System.out.println("--------------------------------------");

        System.out.println(message.substring(2,5)); // mesajın 2. indexinden itibaren 5. indexine kadar parçalar. 5. indexi dahil etmez
        System.out.println("--------------------------------------");

        for (String kelime: message.split(" ")){ // metni belli bir karakter veya karakter dizisine göre parçalar. burada boşluk karakterine göre parçaladı
            System.out.println(kelime);
        }
        System.out.println("--------------------------------------");

        System.out.println(message.toLowerCase()); // mesajı küçük harfe çevirir
        System.out.println(message.toUpperCase()); // mesajı büyük harfe çevirir
        System.out.println("--------------------------------------");

        String message3 = "     Bugün günlerden pazartesi     ";
        System.out.println(message3.trim()); // başındaki ve sonundaki boşlukları kaldırır
    }
}