package qa_candy;

 class Logiс {
    private  static Candy[] candy;

    public Logiс(Candy[] candy){
        this.candy=candy;
    }

    public static void diapazonOfSugarContent(int startSugarContent, int endSugarContent){
        for (Candy sweet : candy){
            //if((sweet.getSugar_content() >= startSugarContent)&(sweet.getSugar_content() <= endSugarContent)){
            System.out.println(sweet.getName()+' '+Integer.toString(sweet.getSugar_content())+' ');
            //}
        }
    }
}
