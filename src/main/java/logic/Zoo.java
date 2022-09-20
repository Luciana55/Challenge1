package logic;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    private String city;
    private String operatingHours;
    private List<Animal> animalList = new ArrayList<Animal>();

    /* constructors */
    public Zoo() {
    }

    public Zoo(String name, String city, String operatingHours) {
        this.name = name;
        this.city = city;
        this.operatingHours = operatingHours;
    }

    /* Getters & Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    /* methods */
    public void quantity() {
        System.out.println("There are " + animalList.size() + " animals currently living in the zoo.");
    }

    public void add(Animal newAnimal) {
        animalList.add(newAnimal);
        System.out.println("New animal added");
    }

    private Animal searchId(int id) {
        int i = 0;
        Animal found = null;
        while (i < animalList.size() && this.animalList.get(i).getId() != (id)) {
            i++;
        }
        if (i < animalList.size()) {
            found = this.animalList.get(i);

        }
        return found;
    }

    public Animal remove(int id) {
        Animal deleteFound = searchId(id);
        this.animalList.remove(deleteFound);
        System.out.println("Animal with id " + id + " removed.");
        return deleteFound;

    }

    public void animalDescription() {
        System.out.println("Descriptions of Animals currently in the zoo:");
        for (Animal animal : animalList) {
            System.out.println(animal.getName() + " the " + animal.getSpecies() + ": " + animal.getDescription());
        }
    }

    public void dayPrice(String day) {

        var a = 19.99;
        var b = 9.99;
        var c = 25.99;
        if (day.equals("Monday") || day.equals("Tuesday")) {
            System.out.println("Admission Price: $" + a);
        } else if (day.equals("Wednesday")) {
            System.out.println("Admission Price: $" + b);
        } else if (day.equals("Thursday") || day.equals("Friday")) {
            System.out.println("Admission Price: $ " + a);
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Admission Price: $ " + c);
        } else {
            System.out.println("Please type the day of the week with a capital letter.");
        }

    }
}
