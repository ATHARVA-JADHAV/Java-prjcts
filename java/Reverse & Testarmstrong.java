import java.util.*;
class Que1{
    public static void main(String args[]){
        int n, choice;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no:");
        n=sc.nextInt();
        System.out.println("Enter choice:/n1.reverse /n2.armstrong");
        choice=sc.nextInt();
        switch(choice){
            case 1:reverse(n);
            break;
            case 2:testarmstrong(n);
            break;
            default : System.out.println("Invalid choice");
            break;
        
        }

    }

    static void reverse(int n){
        int digit ,rev=0;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("Rev is:"+rev);

    }

    static void testarmstrong(int n){
        int result=0;
        int orig=n;
        while(n!=0){
            int remainder=n%10;
            result=result+remainder*remainder*remainder;
            n=n/10;
        }
        if(result==orig){
            System.out.println("No. is armstrong");
        }
        else
            System.out.println("no. is not armstrong");
        

    }
}

