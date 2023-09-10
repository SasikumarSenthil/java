import java.awt.*;
import java.awt.event.*;
class ca extends Frame implements ActionListener
{   TextArea t1;
    ca()
    {
        t1=new TextArea(100,20);
        add(t1);
        Button b1=new Button();
        add(b1);
    }
    public void actionPerformed(ActionEvent ae)
    {

    }
}
class calci
{
   public static void main(String arg[])
   {
    ca f1=new ca();
    f1.setTitle("CALCULATOR");
    f1.setSize(400, 400);
    f1.setVisible(true);
   }
}
