package ua.intita.qa;

public class Shop {

    private final Product[] products;

    public Shop(Product[] products) {
        this.products = products;
    }

    public void getProductsByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product.toString());
            }
        }
    }

    public void getProductsByNamePrice(String name, Product[] prod, int price) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getPrice()<=price ) {
                System.out.println(product.toString());
            }
        }
    }
    public void getProductsByNameStorage(String name, int storage) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getStorage()>=storage ) {
                System.out.println(product.toString());
            }
        }
    }
}
