import java.util.*;
class Que5{
    public static void main(String args[]){
        int n,choice;
        Sc scanner=new Scanner(System.in);
        System.out.println("enter no:");
        n=sc.nextInt();
        System.out.println("enter choice \n1.Factorial\n2.testarmstrong Number\n");
        choice=sc.nextInt();
        switch(choice){
        case 1:
        factorial(n);
        break;
        case 2:
        testamstrong(n);
        break;
        default:
        System.out.println("invalid choice :");
        break;
        }
    
        static void factorial(int n){
            int i,fact=1;
            for(i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("fact is"+fact);
        } 
        static void testarmstrong(int n){
            int result=0;
            int orig=n;
            while(n!=0){
                int remainder=n%10;
                result=result+remainder*remainder*remainder;
                n=n/10;
              }
              if(orig==result)
                System.out.println("no is armstrong");
              
              else
             
            } System.out.println("no is not armstrong");
        }  
    
    }
    
}