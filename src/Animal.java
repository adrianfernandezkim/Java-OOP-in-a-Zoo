/**
 * Created by h205p2 on 9/18/17.
 */
public class Animal {
    static int population;

    //instance vars
    String name;
    String favoriteFood;

    public Animal(String name, String favoriteFood){
        population += 1;
        this.name = name;
        this.favoriteFood = favoriteFood;

    }

    public int populationCount(){
        return population;
    }
    public void sleep(){
        System.out.println(name+" sleeps for 8 hours" );
    }


    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep();
        }

    }


}
