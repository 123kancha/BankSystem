package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    JTextField amount;
    JButton withdrawl ,back;
    String pinnumber;
    Withdrawl (String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);/* imahe ke height width ko kam kene ke liye yh jo getimage method h jaha pr image save h waha se usko utha ke layega*/
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
        image.setBounds(0,0,900,900);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
        add(image);
        
        JLabel text = new JLabel("Enetr the amount you want to Withdrawl ");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
        text.setFont(new Font("system",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,20);/*text dikhana kaha h uska address h*/
        image.add(text);
        
         amount = new JTextField();/*text likhne ke liye box chahiye*/
         amount.setBounds(170,350,320,25);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
         amount.setFont(new Font("Raleway",Font.BOLD,22));
         add(amount);
        
         withdrawl  = new JButton("Withdraw");
         withdrawl  .setBounds(355,485,150,30);
         withdrawl  .addActionListener(this);/*button under events ko mcatch karne ke liye ki button pe kuch events hua h*/ 
         add(withdrawl  );
      
         back = new JButton("Back");
         back .setBounds(355,520,150,30);
         back .addActionListener(this);
         add(back );
        
        getContentPane().setBackground(Color.WHITE);
       setSize(900,900);
       setLocation(300,0);
      // setUndecorated(true);//yeh image ke uper menu hata deta h mtlb margin ko
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== withdrawl ){
            String number= amount.getText();
            Date date = new Date();
            if(number.equals("")){
              JOptionPane.showMessageDialog(null,"Please enter the amount you want to Withdrawl ");
            }
            else{
                try{
                Conn conn = new Conn();
           //String cardnumber= cardTextField.getText();
           //String pinnumber= pinTextField.getText();
                
               String query;
               query = "insert into bank values(pinnumber,'"+date+"',withdrawl ,'"+number+"')";
                
                JOptionPane.showMessageDialog(null,"Rs "+number+" Withdrawl  Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true); 
                }
                catch(Exception e){
                    System.out.println(e);
                }
                
            }
        }else if(ae.getSource()== back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);        }
    }
    public static void main(String args[]) {
        new Withdrawl ("");
    }
}
