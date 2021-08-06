package ua.intita.qa;

public class Shop {

    private final Product[] products;

    public Shop(Product[] products) {
        this.products = products;
    }

    public void getProductsByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product.getName());
            }
        }
    }
}
