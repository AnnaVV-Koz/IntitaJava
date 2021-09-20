package qa_candy;

import java.util.Arrays;

public class Candy extends Confection implements Comparable<Candy>{
    private int size;
    private String type;
    private String filling;

    public Candy(String name, double cost, double weight, int sugar_content, String filling, String type, int size){
        super(name, cost, weight,sugar_content);
        this.size=size;
        this.type=type;
        this.filling=filling;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "candy=" + Arrays.toString(candy) +
                '}';
    }
    public int compareTo (Candy anotherCandy){
        if( this.getCost() == anotherCandy.getCost()){
            return 0;
        }else if (this.getCost() < anotherCandy.getCost()){
            return -1;
        }else {
            return 1;
        }
    }


}