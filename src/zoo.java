/**
 * Created by h205p2 on 9/15/17.
 */
import java.util.ArrayList;
public class zoo {
    public static void main(String[] args){
        zoo zoo = new zoo();

        Tiger tigger = new Tiger("Tigger");


        Bear pooh = new Bear("Pooh");


        Unicorn rare = new Unicorn("Rarity");


        Giraffe gemma = new Giraffe("Gemma");

        Bees stinger = new Bees("Stinger");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(rare);
        animals.add(gemma);
        animals.add(stinger);


        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "bacon");

    }




}
