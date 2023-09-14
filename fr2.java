import java.awt.*;
class f extends Frame 
{
    f()
    {
        MenuItem mi1=new MenuItem("java");
        MenuItem mi2=new MenuItem("Python");
        MenuItem mi3=new MenuItem("Python");
        MenuItem mi4=new MenuItem("Python");
        Menu m1=new Menu("Language");
        Menu m2=new Menu("FrontEnd");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(m2);
        m2.add(mi3);
        m2.add(mi4);
        MenuBar mb1=new MenuBar();
        mb1.add(m1);
        setMenuBar(mb1);
    }
}
class fr2
{
    public static void main(String str[])
    {
        f f1=new f();
        f1.setTitle("Menu");
        f1.setSize(400,400);
        f1.setVisible(true);
    }
}