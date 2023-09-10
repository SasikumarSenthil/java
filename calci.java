import java.awt.*;
import java.awt.event.*;
class ca extends Frame implements ActionListener
{   TextField t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    ca()
    {
        t1=new TextField(42);
        add(t1);
        b1=new Button("+");
        b2=new Button("-");
        b3=new Button("X");
        b4=new Button("/");
        b5=new Button("1");
        b6=new Button("2");
        b7=new Button("3");
        b8=new Button("4");
        b9=new Button("5");
        b10=new Button("6");
        b11=new Button("7");
        b12=new Button("8");
        b13=new Button("9");
        b14=new Button("0");
        b15=new Button("=");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        setLayout(new FlowLayout());
        Color c1=new Color(255,0,210);
        setBackground(c1);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            t1.setText("+");
        }
        if(ae.getSource()==b2)
        {
            t1.setText("-");
        }
        if(ae.getSource()==b3)
        {
            t1.setText("X");
        }
        if(ae.getSource()==b4)
        {
            t1.setText("/");
        }
        if(ae.getSource()==b5)
        {
            t1.setText(1+"");
        }
        if(ae.getSource()==b6)
        {
            t1.setText(2+"");
        }
        if(ae.getSource()==b7)
        {
            t1.setText(3+"");
        }
        if(ae.getSource()==b8)
        {
            t1.setText(4+"");
        }        
        if(ae.getSource()==b9)
        {
            t1.setText(5+"");
        }
        if(ae.getSource()==b10)
        {
            t1.setText(6+"");
        }
        if(ae.getSource()==b11)
        {
            t1.setText(7+"");
        }
        if(ae.getSource()==b12)
        {
            t1.setText(8+"");
        }
        if(ae.getSource()==b13)
        {
            t1.setText(9+"");
        }
        if(ae.getSource()==b14)
        {
            t1.setText(0+"");
        }
        if(ae.getSource()==b15)
        {
            t1.setText("e");
        }
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
