package duke.choice;

import java.util.Comparator;

public class ClothingComporator implements Comparator <Clothing>{

    public int compare(Clothing a, Clothing b){
        return a.getDescription().compareTo(b.getDescription());
    }
}





