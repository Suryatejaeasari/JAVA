import java.awt.event.*;
import javax.swing.*;

public class Maths extends JPanel implements ActionListener{
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2;
public Maths(){
l1 = new JLabel("Number: ");
l1.setBounds(100,40,100,20);
t1 = new JTextField();
t1.setBounds(210,40,100,20);
l2 = new JLabel("Number: ");
l2.setBounds(100,80,100,20);
t2 = new JTextField();
t2.setBounds(210,80,100,20);
l3 = new JLabel("Number: ");
l3.setBounds(100,120,100,20);
t3 = new JTextField();
t3.setBounds(210,120,100,20);
b1 = new JButton("Add");
b1.setBounds(100,150,60,50);
b2 = new JButton("Sub");
b2.setBounds(150,150,60,50);

add(l1);
add(l2);
add(l3);
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);

b1.addActionListener(this);
b2.addActionListener(this);
setLayout(null);
}
public void actionPerformed(ActionEvent e){
int a = Integer.parseInt(t1.getText());
int b = Integer.parseInt(t2.getText());
if (e.getSource() == b1){
int s = a+b;
t3.setText(String.valueOf(s));
}
if (e.getSource() == b2){
int s = a-b;
t3.setText(String.valueOf(s));
}
}
public static void main(String[] args){
Maths cal = new Maths();
JFrame frame = new JFrame("Calculator");
frame.getContentPane().add(cal);
frame.setSize(400, 300);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}