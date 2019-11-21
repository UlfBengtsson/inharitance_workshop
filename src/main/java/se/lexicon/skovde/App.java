package se.lexicon.skovde;

import se.lexicon.skovde.models.Animal;
import se.lexicon.skovde.models.Zebra;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Zebra(4,true, "Louie",883); //Polymorph
        Zebra zebra = new Zebra(4,false, "Marty",823);

        //Zebra a = new Animal("a", 1); //will not work!

        animal.eat();
        zebra.eat();

        System.out.println(zebra.isWhiteOnBlack() ? "Has white stripes on black" : "Has black stripes on white");

        if (animal instanceof Zebra)    // ALWAYS check before you type-cast!!!
        {
            System.out.println(((Zebra)animal).isWhiteOnBlack() ? "Has white stripes on black" : "Has black stripes on white");
        }

    }
}
