package qa_candy;

public class Chokolate extends Confection{
    private String filling;
    private String type;

    public Chokolate(String name, double cost, double weight, int sugar_content, String filling, String type){
        super(name, cost, weight,sugar_content);
        this.filling=filling;
        this.type=type;
    }
}
