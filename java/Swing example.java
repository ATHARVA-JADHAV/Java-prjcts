import javax.swing.*;
class Gui{
    public static void main(String args[]){
        JFrame f=new JFrame("Textfield example");
        JTextField t1,t2,t3,t4;
        Jlabel l1,l2,l3,l4;
        l1=new JLabel("NAME");
        l1.setBounds(40,100,200,30);
        t1=new JTextField();
        t1.setBounds(90,100,200,30);

        l2=new JLabel("STREET");
        l2.setBounds(30,150,200,30);
        t2 = new JTextField();
        t2.setBounds(90, 150, 200, 30);

        l3 = new JLabel("CITY");
        l3.setBounds(50,200,200,30);
        t3 = new JTextField();
        t3.setBounds(90, 200, 200, 30);

        l4 = new JLabel("PINCODE");
        l4.setBounds(30,250,200,30);
        t4 = new JTextField();
        t4.setBounds(90, 250, 200, 30);
        JButton b=new Jbutton("MyInfo");
        b.setBounds(120,300,142,30);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(b);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}