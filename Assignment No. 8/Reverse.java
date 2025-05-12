import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reverse extends JFrame implements ActionListener {
    JLabel l1,l2;
    JButton b1;
    JTextField t1,t2;
    public Reverse(){
        setTitle("REVERSE");
        setLayout(new FlowLayout());
        l1=new JLabel("Number");
        l2=new JLabel("Result");
        t1=new JTextField(30);
        t2=new JTextField(30);
        b1=new JButton("click");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
    int num=Integer.parseInt(t1.getText());
    int reverse=0;
   
    if(e.getSource()==b1){
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        t2.setText(String.valueOf(reverse)); 
    }
}
public static void main(String[]args){
    Reverse r=new Reverse();
}
    
}
