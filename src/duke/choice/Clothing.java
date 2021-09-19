package duke.choice;

public class Clothing {

    private final double MINIMUM_PRICE = 10;
    private final double TAX_RATE = 0.2;

    private String description;
    private double price;
    private String size = "M";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + price * TAX_RATE;
    }

    public void setPrice(double price) {
        this.price = (price < MINIMUM_PRICE) ? MINIMUM_PRICE : price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "MINIMUM_PRICE=" + MINIMUM_PRICE +
                ", TAX_RATE=" + TAX_RATE +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}