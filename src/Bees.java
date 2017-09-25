/**
 * Created by h205p2 on 9/19/17.
 */
public class Bees extends Animal {
    public Bees(String name){
        super(name, "pollen");

    }
    public void sleep(){
        System.out.println(name+" never sleeps");
    }
    public void eat(String food){
        if(!food.equals(favoriteFood)){
            System.out.println("YUCK!!! "+name+" will not eat "+food);
        }
        else{
            super.eat(food);
           sleep();
        }



    }


}
