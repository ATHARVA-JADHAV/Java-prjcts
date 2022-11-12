import java.util.*;
class Three extends Thread{
    public void run(){
        for(int i=0;i<=9;i++){
            try{
                sleep(200);
            }
            catch (exception e){

            }
            System.out.println("3*"+i+"="+3*i);
        }
    }
}
class Five extends Thread{
    public void run(){
        for(int i=0;i<=9;i++){
            try{
                sleep(200);
            }
            catch (exception e){

            }
            System.out.println("5*"+i+"="+5*i);
        }
    }
}
class Seven extends Thread{
    public void run(){
        for(int i=0;i<=9;i++){
            try{
                sleep(200);
            }
            catch (exception e){

            }
            System.out.println("7*"+i+"="+7*i);
        }
    }
}
class Que12{
    public static void main(String args[]){
        Three t=new Three{};
        Five f=new Five();
        Seven s=new seven();
        t.start();
        f.start();
        s.start();
        
    }
}