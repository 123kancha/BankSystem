
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;
//import java.util.Date;

public class PinChange extends JFrame implements ActionListener {
   
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    PinChange(String pinnumber){
       this.pinnumber=pinnumber; 
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);/* imahe ke height width ko kam kene ke liye yh jo getimage method h jaha pr image save h waha se usko utha ke layega*/
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
        image.setBounds(0,0,900,900);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
        add(image);
   
        
        JLabel text = new JLabel("CHANGE YOUR PIN");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
        text.setFont(new Font("system",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
        text.setForeground(Color.WHITE);
        text.setBounds(250,280,500,35);/*text dikhana kaha h uska address h*/
        image.add(text);
        
        
        JLabel pintext = new JLabel("New PIN:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
        pintext.setFont(new Font("system",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
        pintext.setForeground(Color.WHITE);
        pintext.setBounds(165,320,180,25);/*text dikhana kaha h uska address h*/
        image.add(pintext);
        
        pin = new JPasswordField();/*text likhne ke liye box chahiye*/
        pin.setBounds(330,320,180,25);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        image. add(pin);
        
        
        JLabel repintext = new JLabel("Re-Enter New PIN:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
        repintext.setFont(new Font("system",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
        repintext.setForeground(Color.WHITE);
        repintext.setBounds(165,360,180,25);/*text dikhana kaha h uska address h*/
        image.add(repintext);
        
        repin = new JPasswordField();/*text likhne ke liye box chahiye*/
        repin.setBounds(330,360,180,25);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        image. add(repin);
        
        change = new JButton("CHANGE");
        change .setBounds(355,485,150,30);
        change .addActionListener(this);/*button under events ko mcatch karne ke liye ki button pe kuch events hua h*/ 
        image.add(change );
      
        back = new JButton("BACK");
        back .setBounds(355,520,150,30);
        back .addActionListener(this);
        add(back );
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
   }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== change){
                try{
               String npin = pin.getText();
               String rpin = repin.getText();

               if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"Enter PIN does not match");
                    return;
               }
               if(npin.equals("")){
                    JOptionPane.showMessageDialog(null,"please enter new PIN");
                    return;
               }
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null,"please re-enter new PIN");
                    return;
               }
                
               Conn conn = new Conn();//3 no tables me pin ko update krne ke liye
               String query1="update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
               String query2="update login set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"'";
               String query3="update signupthree set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
             
               conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
               conn.s.executeUpdate(query3);
               JOptionPane.showMessageDialog(null,"PIN changed successfully");
                
               
               setVisible(false);
               new Transactions(rpin).setVisible(true);
              
               }catch(Exception e){
                System.out.println(e);

            }
         }else{
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
         }
     }    
   
    public static void main(String args[]) {
       new PinChange("").setVisible(true);
    }
}
