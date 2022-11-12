import java.util.*;
class Que4{
    public static void main(String args[]){
        int n,choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        n=sc.nextInt();
        System.out.println("Enter choice:\n1.factorial\n2.reverse");
        choice=sc.nextInt();
        switch(choice){
            case 1:factorial(n);
            break;
            case 2:reverse(n);
            break;
            default :System.out.println("invalid choice");
            break;
        }

        static void factorial(int n){
           int i,fact=1;
           for(i=1;i<=n;i++){
            fact = fact*i;
           } 
           System.out.println("Factorial is:"+fact);
        }
        static void reverse(int n){
            int digit;
            int rev=0;
            while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
            }
            System.out.println("The rev of number is:"+rev);
        

    }

}