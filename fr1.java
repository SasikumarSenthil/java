import java.awt.*;
import java.awt.event.*;

class z extends Frame implements ActionListener
{
    TextField t1;
 z()
 {
    t1=new TextField(20);
    Button b1=new Button("Name");
    b1.addActionListener(this);
    add(t1);
    add(b1);
    
    setLayout(new FlowLayout());
 }
 public void actionPerformed(ActionEvent ae)
 {
    t1.setText("JAVA");
 }
}
class fr1 
{
    public static void main (String str[])
    {
        z f1=new Z();
        f1.setSize(400, 400);
        f1.setTitle("First frame program");
        f1.setVisible(true);
    }
}
