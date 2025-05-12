import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

class factdemo1 extends JFrame implements ActionListener
{
	JButton b1;
	JLabel l1,l2;
	JTextField t1,t2;
	public factdemo1()
	{
	setTitle("Factorial");
	  l1=new JLabel("Enter the number ");
	  t1=new JTextField(20);
	  l2=new JLabel("Factorial");
	  t2=new JTextField(20);
	  b1=new JButton("Click");
	setSize(400,400);
	setLayout(new FlowLayout());
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b1);
	b1.addActionListener(this);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
public void actionPerformed(ActionEvent e)
 {
int num=Integer.parseInt(t1.getText());
	if(e.getSource()==b1)
	{
	int fact=1,i;
	for(i=num;i>=1;i--)
	fact=fact*i;
	
	t2.setText(String.valueOf(fact));
	}
 }

public static void main(String args[])
 {
factdemo1 f=new factdemo1();
 }
}
