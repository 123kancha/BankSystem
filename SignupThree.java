
package bank.management.system;
import javax.swing.*;
import java.awt.*;
//import java.sql.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener{
    //long random;
    
    JButton submit,cancel;
    JRadioButton r1,r2,r3,r4;
    String formno;//signone oe signtwo ko intermeat krn eke liye isse yh pata chalega ki ek person ki value h
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    //String formno;
    SignupThree(String formno){
       this.formno = formno;
       setLayout(null); 
       
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       
       
       JLabel l1 = new JLabel("Page 3: Account Details");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       l1.setFont(new Font("Raleway",Font.BOLD,22));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       l1.setBounds(280,10,400,25);/*text dikhana kaha h uska address h*/
       add(l1);
      
       
       JLabel type = new JLabel("Account Type:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       type.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       type.setBounds(100,40,200,30);/*text dikhana kaha h uska address h*/
       add(type);
       
       
       r1 = new JRadioButton("Saving Account");/*text likhne ke liye box chahiye*/
       r1.setFont(new Font("Raleway",Font.BOLD,16));
       r1.setBounds(100,80,150,20);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       r1.setBackground(Color.WHITE);
       add(r1);
       
       r2 = new JRadioButton("Fixed Deposite Account");/*text likhne ke liye box chahiye*/
       r2.setFont(new Font("Raleway",Font.BOLD,16));
       r2.setBounds(350,80,250,20);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       r2.setBackground(Color.WHITE);
       add(r2);
       
       r3 = new JRadioButton("Current Account");/*text likhne ke liye box chahiye*/
       r3.setFont(new Font("Raleway",Font.BOLD,16));
       r3.setBounds(100,120,250,20);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       r3.setBackground(Color.WHITE);
       add(r3);
       
       r4 = new JRadioButton("Recurring Deposite Account");/*text likhne ke liye box chahiye*/
       r4.setFont(new Font("Raleway",Font.BOLD,16));
       r4.setBounds(350,120,250,20);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       r4.setBackground(Color.WHITE);
       add(r4);
       
       //button group humara class hota h iska hum ne object banaya taki hum ek radio button ek time select kr sake
       ButtonGroup groupaccount = new ButtonGroup();
       groupaccount .add(r1);
       groupaccount .add(r2); 
       groupaccount .add(r3);
       groupaccount .add(r4);
       
       JLabel card = new JLabel("Card Number:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       card.setFont(new Font("Raleway",Font.BOLD,22));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       card.setBounds(100,150,200,30);/*text dikhana kaha h uska address h*/
       add(card);
       
       JLabel number = new JLabel("XXXX-XXXX-XXXX-4184:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       number.setFont(new Font("Raleway",Font.BOLD,22));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       number.setBounds(330,150,300,30);/*text dikhana kaha h uska address h*/
       add(number);
       
       JLabel carddetail = new JLabel("Your 16 Digit Card Number:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       carddetail.setFont(new Font("Raleway",Font.BOLD,12));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       carddetail.setBounds(100,180,300,15);/*text dikhana kaha h uska address h*/
       add(carddetail);
       
       JLabel pin = new JLabel("PIN:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       pin.setFont(new Font("Raleway",Font.BOLD,22));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       pin.setBounds(100,200,200,30);/*text dikhana kaha h uska address h*/
       add(pin);
       
       JLabel pnumber = new JLabel("XXXX");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       pnumber.setFont(new Font("Raleway",Font.BOLD,22));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       pnumber.setBounds(330,200,300,30);/*text dikhana kaha h uska address h*/
       add(pnumber);
       
       JLabel pindetail = new JLabel("Your 4 Digit Password");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       pindetail.setFont(new Font("Raleway",Font.BOLD,12));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       pindetail.setBounds(100,230,300,15);/*text dikhana kaha h uska address h*/
       add(pindetail);
       
       JLabel services = new JLabel("Service Required:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       services.setFont(new Font("Raleway",Font.BOLD,22));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       services.setBounds(100,280,400,30);/*text dikhana kaha h uska address h*/
       add(services);
       
       
       c1 = new JCheckBox("ATM CARD");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       c1.setBackground(Color.WHITE);
       c1.setFont(new Font("Raleway",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       c1.setBounds(100,330,200,30);/*text dikhana kaha h uska address h*/
       add(c1);
       
       c2 = new JCheckBox("Internet Banking");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       c2.setBackground(Color.WHITE);
       c2.setFont(new Font("Raleway",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       c2.setBounds(350,330,200,30);/*text dikhana kaha h uska address h*/
       add(c2);
       
       c3 = new JCheckBox("Mobile Banking");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       c3.setBackground(Color.WHITE);
       c3.setFont(new Font("Raleway",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       c3.setBounds(100,380,200,30);/*text dikhana kaha h uska address h*/
       add(c3);
       
       c4 = new JCheckBox("EMAIL & SMS Alerts");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       c4.setBackground(Color.WHITE);
       c4.setFont(new Font("Raleway",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       c4.setBounds(350,380,200,30);/*text dikhana kaha h uska address h*/
       add(c4);
       
       c5 = new JCheckBox("Cheque Book");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       c5.setBackground(Color.WHITE);
       c5.setFont(new Font("Raleway",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       c5.setBounds(100,430,200,30);/*text dikhana kaha h uska address h*/
       add(c5);
      
       c6 = new JCheckBox("E-Statement");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       c6.setBackground(Color.WHITE);
       c6.setFont(new Font("Raleway",Font.BOLD,16));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       c6.setBounds(350,430,200,30);/*text dikhana kaha h uska address h*/
       add(c6);
       
       c7 = new JCheckBox("I hereby declares that the above entered details are correct to thr best of Knowledgr");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       c7.setBackground(Color.WHITE);
       c7.setFont(new Font("Raleway",Font.BOLD,12));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       c7.setBounds(100,560,600,30);/*text dikhana kaha h uska address h*/
       add(c7);
       
       
       submit = new JButton("Submit");
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.setFont(new Font("raleway",Font.BOLD,14));
       submit.setBounds(250, 600, 100, 30);
       submit.addActionListener(this);
       submit.addActionListener(this);
       add(submit);
       
       
       cancel = new JButton("Cancel");
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.setFont(new Font("raleway",Font.BOLD,14));
       cancel.setBounds(420, 600, 100, 30);
       cancel.addActionListener(this);
       cancel.addActionListener(this);
       add(cancel);
       
       
       
       
       
      
       getContentPane().setBackground(Color.WHITE);
       setSize(850,820);
       setLocation(350,0);
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae)/*actionlisner ke ander jitne bhi abstract bmethods hote h usko override krna parta h*/
    {
       
      
       if(ae.getSource()== submit){
            String accountType=null;
           if(r1.isSelected()){
              accountType ="Saving Account";
           }else if(r2.isSelected()){
              accountType="Fixed Deposite Acccount";
            }else if(r3.isSelected()){
              accountType ="Current Account";
           }else if(r4.isSelected()){
              accountType="Reccuring Deposite Acccount";
            }
           
           Random random = new Random();
           String cardnumber =""+Math.abs((random.nextLong()% 90000000L)+50409360000000L);
            
           String pinnumber =""+Math.abs((random.nextLong()% 9000L)+1000L);
       
           String facility="";
           if(c1.isSelected()){
              facility=facility+"ATM Card";
           } else if(c2.isSelected()){
              facility=facility+"Internet Banking";
           } else if(c3.isSelected()){
              facility=facility+"Mobile Banking";
           } else if(c4.isSelected()){
              facility=facility+"EMAIL & SMS Alerts";
           }else if(c5.isSelected()){
              facility=facility+"Check Book";
           } else if(c6.isSelected()){
              facility=facility+"E-Statement";
           }
       
       try{
           if(accountType.equals("")){
               JOptionPane.showMessageDialog(null,"Account Type is Required");
               
           }else{
               Conn c = new Conn();
               String query;
               query = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
               
                String query2;
               query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
               
               c.s.executeUpdate(query);
               c.s.executeUpdate(query2);
           
               JOptionPane.showMessageDialog(null,"Card N umber"+ cardnumber + "\n Pin: " + pinnumber);           
           
           }
               
               
               
               //signup3 object
               setVisible(false);
               new Deposit(pinnumber).setVisible(true); 
       }catch(Exception e){
           System.out.println(e);
       }
       
       
       
       
       }else if (ae.getSource()== cancel){
           setVisible(false);
           new Login().setVisible(true);
       }
       
    
    
    
    
    
    }
    
    public static void main(String args[]) {
     new SignupThree("");//.setVisible(true);//create object;   
    }
}

