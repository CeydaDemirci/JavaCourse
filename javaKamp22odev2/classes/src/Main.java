public class Main {

    public static void main(String[] args) {
        // classların uygulanması
        // classlar referans tiptir. (referance type)
        //classlarda Pascal Case kullanılır

        CustomerManager customerManager = new CustomerManager();//class çağırımı
        CustomerManager customerManager2 = new CustomerManager();
        customerManager=customerManager2; // artık customerManager ve customerManager2 aynı nesnede
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

    }
}


