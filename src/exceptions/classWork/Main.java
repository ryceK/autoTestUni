package exceptions.classWork;

public class Main {
    public static void main(String[] args) {
        Candy barb = new Candy("Barbariska", Shape.ELLYPSE, Color.RED);
        Candy karam = new Candy("Karamelka", Shape.CIRCLE, Color.YELLOW);

//        try {
//            System.out.println(Search.searhCandy(barb));
//        } catch (CandyNotFoundException e) {
//            e.printStackTrace();
//        }

//        try {
//            System.out.println(Search.searhCandy(karam));
//        } catch (CandyNotFoundException e) {
//            e.printStackTrace();
//        }

        searchCandyWithHandle(barb);
        searchCandyWithHandle(karam);
    }

    private static void searchCandyWithHandle(Candy candy){
        try {
            System.out.println(Search.searhCandy(candy));
        } catch (CandyNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
