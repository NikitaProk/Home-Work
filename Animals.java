public class Animals extends Main {

    private String nameOfAnimal;
    private String dateOfBirth;


    String foodForWild = "meet";
    String foodForHerbivorous = "plants";


    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Animals(String name, String dateOfBirth) {
        this.nameOfAnimal = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String eat(String food) {
        if (food.equals(foodForWild)) {
            return "I will eat!";
        } else {
            return "I will not eat!";
        }
    }
    public int sizeOfZoo () {
        int areaSizeForAll = 0;
        int[] animalsAreaSizes = {Lynx.sizeOfArea * 5,
                Raccoon.sizeOfArea * 4,Kangaroo.sizeOfArea * 2,
                Eagle.sizeOfArea * 7,Ostrich.sizeOfArea * 3,
                Carp.sizeOfArea * 15,Searoach.sizeOfArea *7};
        for (int i = 0; i < animalsAreaSizes.length; i++) {
            areaSizeForAll += animalsAreaSizes[i];
        }
        return areaSizeForAll;
    }
}

