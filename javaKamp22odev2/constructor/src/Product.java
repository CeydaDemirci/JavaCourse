public class Product {

    public Product (int id, String name, String description, double price, int stockAmount){ //product'ı yalnızca bu parametreleri verirsek kullandırır.
        System.out.println("yapıcı blok çalıştı");
        this.id=id;
        this.name= name; // parametreden gelen name
        this.price=price;
        this.stockAmount = stockAmount;
        this.description =description;

    }// herbir classın kendi ismiyle bir tane contructor'u vardır.

    public Product(){ // parametresiz metot


    };


    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    //getter bloğu
    public int getId() { // id yazamaz ama okuyabilir demek
        return id;
    }

    //setter bloğu
    public void setId(int id) {
        this.id = id; // this içerisinde bulundugu class demek.

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    public String getKod(){ //değer verilmesini engellemiş oldu
        return this.name.substring(0,1) +id;
    }
}
