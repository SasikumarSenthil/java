public class drev {
    public static void main(String str[]) {
    int a,b,c,d,e;
    a=724;
    c=0;
    e=0;
    do {
    b=a%10;
    c=c*10+b;  
    a=a/10;
    } while (a>0);
    do {
        d=c%10;
        e=e*10+d;
        d=d/10;
        System.out.println(e);
    } while (c>0);
    
    System.out.println("Thank you");        
    }
    
}
