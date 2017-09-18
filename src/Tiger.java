/**
 * Created by h205p2 on 9/15/17.
 */
public class Tiger {
    //instance vars
    String name;

    public Tiger(String name){
        this.name = name;

    }
    public void sleep(){
        System.out.println(name+" sleeps for 8 hours");
    }

    String favoriteFood = "meat";
    public void eat(String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!!" +name + " wants more " + food);
        }
        else {
            sleep();

        }

    }

}
