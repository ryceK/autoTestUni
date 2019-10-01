package exceptions.classWork;

public class Search {
    private static final Color COLOR = Color.YELLOW;
    private static final Shape SHAPE = Shape.CIRCLE;

    public static String searhCandy(Candy candy) throws CandyNotFoundException{
        if (COLOR.equals(candy.getColor()) && SHAPE.equals(candy.getShape())){
            return candy.getName();
        } else throw new CandyNotFoundException(String.format("Candy with color %s and shape %s was not found",
                COLOR.toString().toLowerCase(),
                SHAPE.toString().toLowerCase()));
    }
}
