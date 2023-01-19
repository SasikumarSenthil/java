class primenumber
{
    public static void main(String str[])
    { 
        int a,b,c;
        a=7;
        b=2;
        c=1;
        while((b<a)&&(c!=0))
        {
            c=a%b;
            b++;
            
        }
        if(c!=0)
            {
            System.out.println("Prime number");
            }
        System.out.println("Thank you");
    }
}
