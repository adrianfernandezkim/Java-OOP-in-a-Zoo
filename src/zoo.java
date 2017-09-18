/**
 * Created by h205p2 on 9/15/17.
 */
public class zoo {
    public static void main(String[] args){
        zoo zoo = new zoo();

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }


    
    //sleep
    public void sleep(String name){
        System.out.println(name+" sleeps for 8 hours");
    }
    //food and eat
    String favoriteFood = "bacon";

    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!!" +name + " wants more " + food);
        }
        else {
            sleep(name);
        }

    }


}
