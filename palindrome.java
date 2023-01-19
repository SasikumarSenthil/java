class palindrome
{
    public static void main(String str[])
    {
        int a,b,c,d;
        a=727;
        b=0;
        d=a;
        while(a>0)
        {
            c=a%10;
            b=b*10+c;
            a=a/10;
        }   
        if(d==b)
        {
            System.out.println("Palindrome");
        }
       
        
        System.out.println("Thank you");
    }
}
