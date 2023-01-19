public class dindi {
    public static void main(String str[]) {
        int a,b;
        a=724;
        b=0;
        do {
            b=a%10;
            System.out.println(b);
            a=a/10;
        } while (a>0);
        System.out.println("Thank you");
    }
}
