public class Carp extends Animals {
    static final String habitat = "waterfowl";
    static final String food = "meet and plants";
    static final int maxWeight = 4;
    static final int sizeOfArea = 8;

    public Carp(String name, String age) {
        super(name, age);
    }

    @Override
    public String eat(String food) {
        if (this.food.contains(foodForWild) || this.food.contains(foodForWild)) {
            return "I will eat!";
        } else {
            return "I will not eat!";
        }
    }
}
