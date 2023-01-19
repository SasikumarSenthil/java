class n724
{
    public static void main(String str[])
    {
        int a,b,c,n;
        n=724;
        b=10;
        a=0;
        while(n>0)
        {
            c=n%b;
            n=n/b;
            a=a+c; 
            
        }
        System.out.println(a);
        System.out.println("Thank you");
    }
}
