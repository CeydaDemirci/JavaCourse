public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(2);
        product.setName("Etek");
        product.setDescription("kadın kısa etek");
        product.setPrice(69.99);
        product.setStockAmount(5);
        product.getKod();



        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}