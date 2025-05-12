import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Radio extends JFrame implements ActionListener{
    JLabel l1;
    JRadioButton b1,b2;
    JTextField t1;
    public Radio(){
        setTitle("Select Gender");
        setLayout(new FlowLayout());
        l1=new JLabel("Select Gender");
        t1=new JTextField(30);
        b1=new JRadioButton("Male");
        b2=new JRadioButton("Female");
        add(l1);
        add(b1);
        add(b2);
        add(t1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent e){
        String gender = e.getActionCommand(); 
        t1.setText( gender); 
    }
    public static void main(String []args){
        Radio r=new Radio();
    }
    
}
