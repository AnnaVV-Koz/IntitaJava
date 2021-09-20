package qa_candy;

import java.util.Comparator;

public class CandyComporator implements Comparator <Candy> {

    public int compare(Candy a, Candy b){
        return a.getName().compareTo(b.getName());
    }



}
