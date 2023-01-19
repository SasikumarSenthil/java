public class dsod {
    public static void main(String str[]) {
    int a,b,c;
    a=724;
    b=0;
    c=0;
    do {
        b=a%10;
        a=a/10;
        c+=b;
    } while (a>b);     
    System.out.println(c);
    System.out.println("Thank you");
    }
    
}
