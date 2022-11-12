import java.util.*;
class Que3{
    public static void main(String args[]){
        float s1,s2,s3,s4,s5,s_avg;
        s1=Float.parseFloat(args[0]);
        s2=Float.parseFloat(args[1]);
        s3=Float.parseFloat(args[2]);
        s4=Float.parseFloat(args[3]);
        s5=Float.parseFloat(args[4]);

        s_avg=(s1+s2+s3+s4+s5)/ 5;
        System.out.println("Avg speed is:"+s_avg);

        if(s1 >= s_avg)
        System.out.println("biker 1 is qulified");
        if(s2 >= s_avg)
        System.out.println("Biker 2 is qualified");
        if(s3 >= s_avg)
        System.out.println("Biker 3 is qualified");
        if(s4 >= s_avg)
        System.out.println("Biker 4 is qualified");
        if(s5 >= s_avg)
        System.out.println("Biker 5 is qualified");
    }
}