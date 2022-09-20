package logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Challenge #1 Object Oriented Challenge
 *
 * @author: Luciana Vidal
 */
public class Challenge1 {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        /* Zoo Characteristics */
 /* Zoo Information */
        zoo.setName("Rainforest");
        zoo.setCity("California");
        zoo.setOperatingHours("9am to 6pm");

        /* Output */
        System.out.println("Welcome to " + zoo.getName() + " " + "zoo from " + zoo.getCity() + ".");
        System.out.println("We are open from " + zoo.getOperatingHours() + ".");
        System.out.println("------------------------------");

        /* Admission Price depending on the current day of the week */
        zoo.dayPrice("Monday");
        System.out.println("------------Create New Animals------------------");

        /* Create animals */

 /* Crocodile */
        Crocodile croco1 = new Crocodile(32, "Fish", 1, "Cuban crocodile", "Thunder", "4", "Male");
        /* Set description of the characteristics */
        croco1.setDescription();
        /* display methods */
        System.out.println(croco1.numberTheets());
        System.out.println(croco1.favFood());

        System.out.println("------------------------------");

        /* Tortoise */
        GiantTortoise giant1 = new GiantTortoise(24, 2, "Aldabra tortoise", "Cherry", "4", "Female");
        /* Set description of the characteristics */
        giant1.setDescription();
        /* display methods */
        System.out.println(giant1.currentAge());
        System.out.println(giant1.ageStage());

        System.out.println("------------------------------");

        /* Giraffe */
        Giraffe gira1 = new Giraffe(4.7, 4, "Giraffa reticulata", "Lemon", "4", "Female");
        /* Set description of the characteristics */
        gira1.setDescription();
        /* display methods */
        System.out.println(gira1.currentHeight());
        System.out.println(gira1.heightCompare());

        Giraffe gira2 = new Giraffe(5.5, 5, "Giraffa camelopardalis", "Blue", "4", "Male");
        /* Set description of the characteristics */
        gira2.setDescription();
        /* display methods */
        System.out.println(gira2.currentHeight());
        System.out.println(gira2.heightCompare());

        System.out.println("------------Add new animals to the zoo----------");


        /* Add created animals to the Zoo*/
        zoo.add(croco1);
        zoo.add(giant1);
        zoo.add(gira1);
        zoo.add(gira2);

        System.out.println("------------------------------");

        /* Remove animal from the zoo */
        zoo.remove(2);
        System.out.println("------------------------------");

        /* Print out how many Animals are currently living in the zoo */
        zoo.quantity();
        System.out.println("------------------------------");

        /* Print out descriptions of all the animals that currently live in the zoo*/
        zoo.animalDescription();

    }

}
