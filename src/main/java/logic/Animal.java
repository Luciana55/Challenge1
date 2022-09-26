package logic;

public abstract class Animal {

    /*  attributes */
    private int id;
    private String species;
    private String name;
    private String numberLegs;
    private String gender;
    protected String description;
    private static int idCounter = 0;

    /* constructors */
    public Animal() {
    }

    public Animal(String species, String name, String numberLegs, String gender) {
        idCounter++;
        this.id = idCounter;
        this.species = species;
        this.name = name;
        this.numberLegs = numberLegs;
        this.gender = gender;
        this.description = description;

    }

    /* getters & setters */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberLegs() {
        return numberLegs;
    }

    public void setNumberLegs(String numberLegs) {
        this.numberLegs = numberLegs;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription() {
        this.description = toString();
    }

    /*methods */
    @Override
    public String toString() {
        return "{" + "Id = " + id + ", Species = " + species + ", Name = " + name + ", Number of legs = " + numberLegs + ", Gender = " + gender;
    }

    public abstract void description();
}
