class printprime
{
    public static void main(String str[]) 
    {
        int a,b,c;
        a=2;
        b=2;
        c=0;
        while((a>0)&&(a<10))
        {   
           c=a%b;
           b++;
            if(c<0)
            {
                System.out.println(a);
            
            }
           while(a!=0)
           {
            a++;
           }
        }
        System.out.println("Thank you");   
    }
}