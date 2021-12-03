public class Ostrich extends Animals {

    static final String habitat = "land";
    static final String food = "plants";
    static final int maxWeight = 140;
    static final int sizeOfArea = 150;

    public Ostrich(String name, String age) {
        super(name, age);
    }

    @Override
    public String eat(String food) {
        if (this.food.equals(foodForWild)) {
            return "I will not eat!";
        } else {
            return "I will eat!";
        }
    }
}
