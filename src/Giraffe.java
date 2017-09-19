/**
 * Created by h205p2 on 9/19/17.
 */
public class Giraffe extends Animal {
    String name;
    public Giraffe(String name){
        super(name, "leaves");
        this.name = name;
    }
    public void eat(String food){
        if(!food.equals(favoriteFood)){
            System.out.println("YUCK!!! "+name+" will not eat "+food);
        }
        else{
            super.eat(food);
            super.sleep();
        }



    }


}
