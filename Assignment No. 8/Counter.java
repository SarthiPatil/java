import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class Counter extends JFrame implements ActionListener {
    JLabel l1;
    JTextField t1;
    JButton b1,b2,b3;
    Counter(){
        setTitle("Count");
        setLayout(new FlowLayout());
        l1=new JLabel("Counter");
        t1=new JTextField(30);
        b1=new JButton("Count up");
        b2=new JButton("Count down");
        b3=new JButton("Reset");
        add(l1);
        add(t1);
        add(b1);add(b2);add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        int num=Integer.parseInt(t1.getText());
        int count;
        if((e.getSource()==b1)){
            count=num+1;
            t1.setText(String.valueOf(count));

        }else if(e.getSource()==b2){
            count=num-1;
            t1.setText(String.valueOf(count));
        }else{
            count=0;
            t1.setText(String.valueOf(count));
        }

    }
    public static void main(String []args){
        Counter c=new Counter();
    }
    
}
