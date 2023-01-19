
class reverse
{
    public static void main(String str[])
    {
        int a,c,n,d,b;
        n=724;
        d=0;
        b=0;
        while(n>0)
        {  
            c=n%10;
            d=d*10+c;
            n=n/10;
        }
        while(d>0)
        {
            a=d%10;
            d=d/10;
            b=b*10+a;        
        }
        System.out.println(b); 
        
        System.out.println("  Thank you");
    
    }
}
//