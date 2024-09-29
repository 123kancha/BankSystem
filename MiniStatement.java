
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener {
    String pinnumber;
    MiniStatement(String pinnumber){
        this.pinnumber=pinnumber; 
        setTitle("Mini Statement");
        setLayout(null);
        
        JLabel text = new JLabel();/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
        //setBounds(0,0,900,900);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
        add(text);
        
        JLabel bank = new JLabel("Indian Bank");/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
        bank.setBounds(150,20,100,20);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
        add(bank);
        
        JLabel card = new JLabel();/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
        card.setBounds(20,80,300,20);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
        add(card);
        
        JLabel mini = new JLabel();/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
        mini.setBounds(20,80,300,20);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
        add(mini);
        
        JLabel balance = new JLabel();/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
        balance.setBounds(20,400,300,20);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
        add(balance);
        
        try{
            Conn conn = new Conn();//3 no tables me pin ko update krne ke liye
            ResultSet rs= conn.s.executeQuery("select * from login where pinnumber = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4)+ "xxxxxxxx" + rs.getString("cardnumber").substring(12));
            }
        
        }catch(Exception e){
            System.out.println(e);
        }
         try{
            Conn conn = new Conn();//3 no tables me pin ko update krne ke liye
            int bal = 0;
            ResultSet rs= conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() +"<html>"+ rs.getString("date") + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type")+ " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount")+"<br><br><html>");
                 if(rs.getString("type").equals("Deposit")){//yh bank class se ek ek row dega
                      bal +=Integer.parseInt(rs.getString("amount"));
                 }else{//balacr=es of user
                       bal -=Integer.parseInt(rs.getString("amount"));
                  }  
            }
           balance.setText("Your current account balanc is Rs" + bal);
        }catch(Exception e){
            System.out.println(e);
        }
        mini.setBounds(20,140,400,200);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(400,600);
        setLocation(20,20);
        //setUndecorated(true);
        setVisible(true);
    }
    public static void main(String args[]) {
       new  MiniStatement(" ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
