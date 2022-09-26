public class Main {
    public static void main(String[] args) {

       /*1-*/ Product product = new Product(1, "etek", "kadın kısa etek", 69.99, 3);
       /*2-*/   product.setId(2);
                product.setName("Etek");
                product.setDescription("kadın kısa etek");
                product.setPrice(69.99);
                product.setStockAmount(5);
                product.getKod();
            //1 ve 2 durumundan istenilen de kullanılbilir çünkü bir parametreli bir de parametresiz metot yazıldı.

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}