import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lynx lynx = new Lynx("Lynxy", "02.12.2012");
        Raccoon raccoon = new Raccoon("Little raccoon", "06.09.2012");
        Kangaroo kangaroo = new Kangaroo("Big boss", "10.10.2014");
        Eagle eagle = new Eagle("Sky storm", "07.08.2020");
        Ostrich ostrich = new Ostrich("Runner", "25.12.2007");
        Carp carp = new Carp("Wet dude", "03.10.2021");
        Searoach searoach = new Searoach("Chika", "30.11.2021");
        Animals animals = new Animals("", "");

        List<Animals> zoo = new ArrayList<>();
        zoo.add(lynx);
        zoo.add(raccoon);
        zoo.add(kangaroo);
        zoo.add(eagle);
        zoo.add(ostrich);
        zoo.add(carp);
        zoo.add(searoach);
        for (Animals n : zoo) {
            System.out.println();
            System.out.println("Name of animal: " + n.getNameOfAnimal()
                    + "; Date of Birth: " + n.getDateOfBirth()
                    + "; Kind of food meet: " + n.eat("meet")
                    + "; Kind of food plants: " + n.eat("plants"));
        }
        System.out.println("\nNeeded area for all animals: " + animals.sizeOfZoo() + " km" + "\u00B2");
    }
}