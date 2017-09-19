/**
 * Created by h205p2 on 9/19/17.
 */
public class Unicorn extends Animal {
    public Unicorn(String name){
        super(name, "marshmallows");
        this.name = name;
    }
    public void sleep(){
        System.out.println(name+" sleeps in a cloud");
    }
    public void eat(String food){
        super.eat(food);
        sleep();
    }
}
