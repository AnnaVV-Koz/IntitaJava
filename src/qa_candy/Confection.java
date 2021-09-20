package qa_candy;

public class Confection {
    private String name;
    private double cost;
    private double weight;
    private int sugar_content;

    public Candy[] candy;

    public Confection(String name, double cost, double weight, int sugar_content) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.sugar_content = sugar_content;

    }
    public Confection(Candy[] candy){
        this.candy=candy;
    };

    public double defineWeight(Candy[] candy){
        double s=0;
        for(int i=0;i<candy.length;i++){
            s=s+candy[i].getWeight();
        }
        return s;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSugar_content() {
        return sugar_content;
    }

    public void setSugar_content(int sugar_content) {
        this.sugar_content = sugar_content;
    }
}
