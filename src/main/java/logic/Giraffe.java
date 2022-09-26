package logic;

public class Giraffe extends Animal {

    /* attributes */
    private double height;

    /* constructors */
    public Giraffe() {
    }

    public Giraffe(double height, String species, String name, String numberLegs, String gender) {
        super(species, name, numberLegs, gender);
        this.height = height;
    }

    /* getters & setters */
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /* methods */
    public String currentHeight() {
        return "This giraffe current height is " + height + " mts.";
    }

    public String heightCompare() {

        if (getGender().equals("Female") && height > 4.6) {
            return "This giraffe height is above the average for a female giraffe.";
        } else if (getGender().equals("Female") && height == 4.5) {
            return "This giraffe height is average for a female giraffe.";
        } else if (getGender().equals("Female") && height < 4.5) {
            return "This giraffe height is below the average for a female giraffe.";
        } else if (getGender().equals("Male") && height > 5.5) {
            return "This giraffe height is above the average for a male giraffe.";
        } else if (getGender().equals("Male") && height == 5.5) {
            return "This giraffe height is average for a male giraffe.";
        } else {
            return "This giraffe height is below the average for a male giraffe.";

        }

    }

    @Override
    public void description() {
        setDescription();
        this.description = getDescription() + "\n" + currentHeight() + " " + heightCompare() + "}";
    }
}
