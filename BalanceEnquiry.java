
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JButton back;
    String pinnumber;
    BalanceEnquiry(String pinnumber){
        this.pinnumber=pinnumber; 
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);/* imahe ke height width ko kam kene ke liye yh jo getimage method h jaha pr image save h waha se usko utha ke layega*/
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
        image.setBounds(0,0,900,900);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
        add(image);
        
        
        back = new JButton("BACK");
        back .setBounds(355,520,150,30);
        back .addActionListener(this);
        image.add(back );
        
        
         Conn c = new Conn();
         int balance = 0;
           try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                
                while(rs.next()){
                  if(rs.getString("type").equals("Deposit")){//yh bank class se ek ek row dega
                      balance +=Integer.parseInt(rs.getString("amount"));
                  }else{//balacr=es of user
                       balance -=Integer.parseInt(rs.getString("amount"));
                  }  
                }
           }catch(Exception e){
               System.out.println(e);
           }
           
        JLabel text = new JLabel("Your current Account Balance is Rs"+balance);/*flable ke help se hum kuch bhi content likh sake h frame pe*/
        text.setFont(new Font("system",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,30);/*text dikhana kaha h uska address h*/
        image.add(text);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
         new Transactions(pinnumber).setVisible(true);
     }
    public static void main(String args[]) {
        new BalanceEnquiry("");
    }

}
