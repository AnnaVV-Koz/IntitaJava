package ua.intita.qa;

public class Product {

    private int id;
    private String name;
    private int ups;
    private String manufacturer;
    private int price;
    private int storage;
    private int amount;

    public Product (int id, String name, int ups, String manufacturer, int price, int storage, int amount)
    {
        this.id = id;
        this.name = name;
        this.ups = ups;
        this.manufacturer = manufacturer;
        this.price = price;
        this.storage = storage;
        this.amount = amount;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUps() {
        return ups;
    }

    public void setUps(int ups) {
        this.ups = ups;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ups=" + ups +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                ", amount=" + amount +
                '}';
    }
    public static void listOfProductofName(Product[] prod,String name){
        for (Product num: prod){
            if (num.name==name) {
                System.out.println(num.name);
            }
        }
    }
}
