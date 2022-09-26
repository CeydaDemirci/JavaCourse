public class Product {
    // getter ve setter
    // get -> almak
    //set -> değer vermeye yarar
    // private sadece tanımlandığı metotta geçerlidir.
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
