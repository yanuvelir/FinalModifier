public class Cake {

    private String filling;

    public final double WEIGHT_OF_CAKE;

    public Cake(double weight_of_cake) {
        this.WEIGHT_OF_CAKE = 10;
    }

    @Override
    public String toString() {
        return "Cake weight: " + WEIGHT_OF_CAKE + " grams";
    }
}
