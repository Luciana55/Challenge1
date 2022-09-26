package logic;

public class GiantTortoise extends Animal {

    /* attributes */
    private int age;

    /* contructors */
    public GiantTortoise() {
    }

    public GiantTortoise(int age, String species, String name, String numberLegs, String gender) {
        super(species, name, numberLegs, gender);
        this.age = age;
    }

    /* getter & setters */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* methods */
    public String ageStage() {
        var a = "The tortoise is young.";
        var b = "The tortoise is old.";
        var c = "The tortoise is middle-age.";
        if (age < 50) {
            return a;
        } else if (age > 100) {
            return b;
        } else {
            return c;
        }

    }

    public String currentAge() {
        return "This tortoise is " + age + " years old.";
    }

    @Override
    public void description() {
        setDescription();
        this.description = getDescription() + ", " + currentAge() + " " + ageStage() + "}";
    }
}
