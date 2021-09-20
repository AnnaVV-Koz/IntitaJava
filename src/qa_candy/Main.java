package qa_candy;


import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Candy[] candy = new Candy[7];

        candy[0] = new Candy("ChupaChups", 5.0, 20.0, 20,"vanil","small",3);
        candy[1] = new Candy("Candy", 10,50,20,"chokolate","middle", 3);
        candy[2] = new Candy( "Chokolate", 30, 80, 50, "Black", "big", 5);
        candy[3] = new Candy("Marshmellow", 35, 15, 12, "Vanil", "small", 3);
        candy[4] = new Candy("Chupa Chups", 10, 30, 20, "color", "small", 5);
        candy[5] = new Candy("Marshmellow", 55, 30, 22, "apple", "small",3);
        candy[6] = new Candy("Marshmellow", 35, 15, 12, "Vanil", "small",2);

        TreeSet<Candy> myCandyArrayList = new TreeSet<Candy>();

        //Confection firstConfection = new Confection("Chokolate", 120, 100, 33);
        //Confection secondConfection = new Confection("Lolipops", 80, 50, 77);
        // Confection thirdConfection = new Confection("Marshmellow", 180, 66, 55);

        myCandyArrayList.add(candy[0]);
        myCandyArrayList.add(candy[1]);
        myCandyArrayList.add(candy[2]);
        myCandyArrayList.add(candy[3]);
        myCandyArrayList.add(candy[4]);
        myCandyArrayList.add(candy[5]);
        myCandyArrayList.add(candy[6]);

        for (Candy c: myCandyArrayList) {
            System.out.println(c.getCost());
        }

        CandyComporator cc = new CandyComporator();
        TreeSet<Candy> c = new TreeSet<Candy>(cc);
        c.add(candy[0]);
        c.add(candy[1]);
        c.add(candy[2]);
        c.add(candy[3]);
        c.add(candy[4]);
        c.add(candy[5]);
        c.add(candy[6]);

        for(Candy  p : c){

            System.out.println(p.getName());
        }


        Confection t = new Confection(candy);
        double w=t.defineWeight(candy);
        System.out.println("Wes "+ Double.toString(w));


        int startSugarContent = 20;
        int endSugarContent = 60;
        System.out.println("Diapazon of sugarContent from "+startSugarContent+" to "+endSugarContent+":");
        //Logic.Diapazon of sugarContent(startSugarContent, endSugarContent);
        Chokolate choco = new Chokolate("chocko",12.3,34,523,"nasta","filling");
        Logiс logiс = new Logiс(candy);
        Logiс.diapazonOfSugarContent(12,34);
    }
}
