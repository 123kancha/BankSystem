
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber){
      this.pinnumber=pinnumber; 
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);/* imahe ke height width ko kam kene ke liye yh jo getimage method h jaha pr image save h waha se usko utha ke layega*/
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
        image.setBounds(0,0,900,900);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
        text.setFont(new Font("system",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
        text.setForeground(Color.WHITE);
        text.setBounds(200,300,700,35);/*text dikhana kaha h uska address h*/
        image.add(text);  //image ke upr text box dikhane ke liye hum image se 
        
      deposit = new JButton("Deposit");
      deposit .setBounds(170,415,150,30);
      deposit .addActionListener(this);/*button under events ko mcatch karne ke liye ki button pe kuch events hua h*/ 
      add(deposit );
      
      withdrawl = new JButton("Cash withdrawl");
      withdrawl .setBounds(355,415,150,30);
      withdrawl .addActionListener(this);
      add(withdrawl );
      
      fastcash = new JButton("Fast Cash");
      fastcash .setBounds(170,450,150,30);
      fastcash .addActionListener(this);
      add(fastcash );
      
      ministatement = new JButton("Ministatement");
      ministatement .setBounds(355,450,150,30);
      ministatement .addActionListener(this);
      add(ministatement );
      
      pinchange = new JButton("Pin Change");
      pinchange .setBounds(170,485,150,30);
      pinchange .addActionListener(this);
      add(pinchange );
      
      
      balanceenquiry = new JButton("balance Enquiry");
      balanceenquiry .setBounds(355,485,150,30);
      balanceenquiry .addActionListener(this);
      add(balanceenquiry );
      
      exit = new JButton("Exit");
      exit .setBounds(355,520,150,30);
      exit .addActionListener(this);
      add(exit );
      
//       deposit .setBackground(Color.BLACK);
//      deposit .setForeground(Color.WHITE);
//      


       getContentPane().setBackground(Color.WHITE);
       setSize(900,900);
       setLocation(300,0);
      // setUndecorated(true);//yeh image ke uper menu hata deta h mtlb margin ko
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== exit){
            System.exit(0);
        }else if(ae.getSource()== deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()== withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()== fastcash){
            setVisible(false);
            new FashCash(pinnumber).setVisible(true);
        }else if(ae.getSource()== pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()== balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource()== ministatement){
            //setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
        
    }
            
    public static void main(String args[]) {
        new Transactions("");
    }
}
