import java.util.*;
class Que2{
    public static void main(String[] args) {
        float da,hra,pf,gr_sal,net_sal;
        float cca=240f ,pt=100f;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter emp rollno:");
        int r=a.nextInt();
        System.out.println("enter your basic");
        float f=a.nextFloat();
        System.out.println("enter empname:");
        String w=a.next();

        da=(0.7f)*f;
        hra=(0.3f)*f;
        pf=(0.1f)*f;

        gr_sal=f+da+hra;
        net_sal=gr_sal-cca-pt-pf;

        System.out.println("employee name is:"+w+"\n with roll no"+r);
        System.out.println("your gross salary is:"+gr_sal);
        System.out.println("your net salary is:"+net_sal);
    }
}
