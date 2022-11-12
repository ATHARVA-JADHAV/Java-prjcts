import java.util.*;

interface vehicle{
    void speed();
    void gear();
}

class car implements vehicle{
    public void speed(){
        System.out.println("the speed of car is 200 ");
    }
    public void gear(){
        System.out.println("number of gears is 6");
    }
}
class bike implements vehicle{
    public void speed(){
        System.out.println("top speeed of bike is 170");
    }
    public void gear(){
        System.out.println("total gears is 4");
    }
}
class bicycle implements vehicle{
    public static void(){
        System.out.println("top speed ");
    }
    public staatic void(){
        System.out.println("total gear12");
    }
}
class Que9{
    public static void main(String args[]){
        car a=new car();
        a.speed();
        a.gear();

        bike b=new bike();
        b.speed();
        b.gear();

        bicycle c=new bicycle();
        c.speed();
        c.gear();


    }
}