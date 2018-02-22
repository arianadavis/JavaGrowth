import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class myframe1 extends JFrame implements ActionListener
{
    JButton b1,b2;
    JTextField tx,tx1;
    JLabel l1,l2,l3;
    Container c;
    myframe1()
    {
        c=getContentPane();
        c.setBackground(Color.gray);
        c.setLayout(null);

        l1=new JLabel("Enter any number:");
        l1.setBounds(50,50,120,50);
        c.add(l1);

        tx=new JTextField();
        tx.setBounds(200,50,150,30);
        c.add(tx);

        l2=new JLabel("Answer:");
        l2.setBounds(50,150,50,50);
        c.add(l2);

        tx1=new JTextField();
        tx1.setBounds(200,150,150,30);
        c.add(tx1);

        b1=new JButton("Evaluate");
        b1.addActionListener(this);
        b1.setBounds(125,275,150,50);
        c.add(b1);

    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        int no;
        if(str=="Evaluate")
        {
            no=Integer.parseInt(tx.getText());
            if(no%2==0)
            {
                tx1.setText(no+" is an even number");
                
            }
            else
            {
                tx1.setText(no+" is an odd number");
                
            }
        }
        if(str=="Cancel")
        {
            System.exit(0);
        }
    }

}

class EvenOrOddSwing
{
    public static void main(String args[])
    {
        myframe1 f=new myframe1();

        f.setTitle("Even & Odd");
        f.setSize(400,400);
        f.setVisible(true);
    }
}