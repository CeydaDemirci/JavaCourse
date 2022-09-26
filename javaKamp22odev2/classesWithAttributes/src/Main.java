public class Main {
    public static void main(String[] args) {
    Product product = new Product();
    product.id =2;
    System.out.println("ürün id: "+product.id);
    product.name = "Etek";
    System.out.println("ürün: "+product.name);
    product.description = "kadın kısa etek";
    System.out.println("açıklaması:" +product.description);
    product.price = 69.99 ;
    System.out.println("ürün fiyatı : "+product.price+ " TL");
    product.stockAmount = 5;
    System.out.println("stok miktarı :" +product.stockAmount );

    ProductManager productManager =  new ProductManager();
    productManager.Add(product);


    }
}