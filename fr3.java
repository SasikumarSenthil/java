import java.awt.*;
class zz extends Frame
{
    zz()
    {
        
        MenuItem mi1=new MenuItem("Java");
        MenuItem mi2=new MenuItem("Python");
        MenuItem mi3=new MenuItem("CSS");
        MenuItem mi4=new MenuItem("HTML");
        Menu m1=new Menu("Language");
        Menu m2=new Menu("Frontend");
        m1.add(mi1);
        m1.add(mi2);
        m2.add(mi3);
        m2.add(mi4);
        MenuBar mb1=new MenuBar();
        mb1.add(m1);
        mb1.add(m2);
        setMenuBar(mb1);
    }
}
class fr3
{
    public static void main(String str[])
    {
        zz f1=new zz();
        f1.setSize(400,400);
        f1.setTitle("NotePad");
        f1.setVisible(true);
        TextArea ta1=new TextArea(400,400); 
        f1.add(ta1);
    }
}