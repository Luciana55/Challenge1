package logic;

public class Crocodile extends Animal {

    /* attributes */
    private int numTheeth;
    private String favFood;

    /* constructors */
    public Crocodile() {
    }

    public Crocodile(int numTheeth, String favFood, int id, String species, String name, String numberLegs, String gender) {
        super(id, species, name, numberLegs, gender);
        this.numTheeth = numTheeth;
        this.favFood = favFood;
    }


    /* getters & setters */
    public int getNumTheeth() {
        return numTheeth;
    }

    public void setNumTheeth(int numTheeth) {
        this.numTheeth = numTheeth;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    /* methods */
    public String favFood() {
        return '{' + "Favourite food = " + favFood + '}';
    }

    public String numberTheets() {
        return "This cocodrile has " + numTheeth + " theeths.";
    }
}
