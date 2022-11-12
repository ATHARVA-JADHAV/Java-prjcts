static void palindrome(int n){
    int digit,rev=0,temp;
    temp=n;
    while (n!=0){
       digit=n%10;
       rev=rev*10+digit;
       n=n/10; 
    }
    if(temp==rev)
    sout("no is palindrome");
    else 
    sout("not palindrome");
}


static void prime(int n){
    int i,flag=o;
    for(i=2;i<=n-1;i++){
        if(n%i==0)
        flag=1;
    }
    if(flag==0){
        sout("is prime");
    }
    else{
    sout("not a prime");
    }
}