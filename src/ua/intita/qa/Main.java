package ua.intita.qa;

public class Main {
    public void main(String[] args) {
        Product[] prod = new Product[6];
        prod[0] = new Product(1, "cake", 12345678, "Roshen", 300, 3, 1);
        prod[1] = new Product(2, "candy", 33455656, "Svitoch", 200, 60, 5);
        prod[2] = new Product(3, "biscuit", 12435678, "Svitoch", 150, 4, 1);
        prod[3] = new Product(4, "lollipops", 12789678, "Konti", 120, 70, 1);
        prod[4] = new Product(5, "marshmallow", 14345678, "Solodka Mriya", 240, 5, 6);
        prod[5] = new Product(6, "chocolate", 12333678, "Roshen", 300, 140, 1);
    }
}
