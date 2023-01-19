public class div4do {
public static void main(String str[])
{
    int a,b;
    a=1;
    b=0;
    do {
        b=a%4;
        if(b==0)
        {
        System.out.println(a);
        }
        a++;
    } while (a<15);
    System.out.println("Thank you");
}
}
