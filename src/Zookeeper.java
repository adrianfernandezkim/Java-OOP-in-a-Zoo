import java.util.ArrayList;

/**
 * Created by h205p2 on 9/19/17.
 */
public class Zookeeper {
    String name;
    public Zookeeper(String name){
        this.name = name;
    }

    public void feedAnimals(ArrayList<Animal> animals, String food){


        int population = Animal.populationCount();

        System.out.println(name+" is feeding "+food+" to "+ animals.size() +" of "+population +" animals");

        for(int i = 0; i<animals.size(); i++){

            Animal zooby = animals.get(i);
            zooby.eat(food);

        }
    }
}
