public class Kangaroo extends Animals {
    static final String habitat = "land";
    static final String food = "plants";
    static final int maxWeight = 85;
    static final int sizeOfArea = 300;

    public Kangaroo(String name, String age) {
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
