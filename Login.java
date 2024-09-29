
package bank.management.system;
import javax.swing.*;
//frame class h swims ke ander
//swing class ke andr Image class nhi hoti h Image i2 = i1.getImage().getScaledInstance is liye hum awt package ka use krte h*/
import java.awt.*;
import java.awt.event.*;
/*actionerlistenr jo hota h wo java ke awt ke events ke under hota h*/
import java.sql.*;
/*Actionlistener ek interface hota h jo button ko click able bnayega or textfield me jo likhenge wo save hoga*/
public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;/*is button ko hum globaly defined kr rahe h kyu yh constructor ke ander defined tha or hum isko bahar use krna tha or hume actionlisner ke actionPerformed ke ande button ke information ko store krane h*/  
    JTextField cardTextField  ;
    JPasswordField pinTextField;//pasward ko hide krne ke liye
    Login(){
      setTitle("AUTOMATED TELLER MACHINE");
      setLayout(null);/*customlayout banane ke liye hum setbound fun ka use keerte h fir yh layout lega is liye hum setlayout fn se layout off kr denge tb yh coner me sift ho jayega frame me*/
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));/* classleader ke under ek get method hota h jo image ke path(address) ko lata h tab iage show krta h*//* image lagane ke liye ek class used hoti h imageicons*/
      Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);/* imahe ke height width ko kam kene ke liye yh jo getimage method h jaha pr image save h waha se usko utha ke layega*/
      ImageIcon i3 = new ImageIcon(i2); /*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para*/
      // JLabel lable = new JLabel(i1);/*hum ek icons ko directly placed nhi kr skte h isliye yh method ka use krte h*/
      JLabel label = new JLabel(i3);/*Image i2 = i1.getImage().getScaledInstance isme jo i2 object h isko hum JLabel ke ander nhi dal skte h... isliye hume fir ImageIcon ka object bna ke isme i2 ko dalna para or fir i1 ke jgy 13 ko jlable me dalna para*/
      label.setBounds(10,10,100,100);/*((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... setbound fun 4 argumnets leta h....image ko mlogo bnana h toh hum is image ko mframe pe set krwa rahe h toh frame ke lef 1 element ,uper se 2 element, height 3 or 4 width* fir bhi yh cornre me set nhi hota h abhi bhi yh center me h isse set krne ke liye kuch layouts hote h  ((customlayout banane ke liye hum setbound fun ka use keerte h or layout ko off kr ))...... */
      add(label);/*jb hume kisi componet ko frame ke uper placed krna hota h toh hum add function ka used krna prta h uske under object ka dalte h*/
      
      JLabel text = new JLabel("Wetcome to ATM");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
      text.setFont(new Font("Osward",Font.BOLD,38));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
      text.setBounds(200,40,400,40);/*text dikhana kaha h uska address h*/
      add(text);
      
      JLabel cardno = new JLabel("Card No.:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
      cardno.setFont(new Font("Raleway",Font.BOLD,28));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
      cardno.setBounds(120,150,250,30);/*text.setBounds(200,40,400,40) 40+40=80 h isliye 120 se start kiya gaya h...text dikhana kaha h uska address h*/
      add(cardno);
      /*JTextField  or JButton yaha localy defined h isliye is constructor ke bahar globaly defined krna ho ga taki actionlisner iska use kr sake*/
//      JTextField cardTextField = new JTextField();
      cardTextField = new JTextField();/*text likhne ke liye box chahiye*/
      cardTextField.setBounds(300,150,230,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
      cardTextField.setFont(new Font("Arial",Font.BOLD,14));
      add(cardTextField);
      
      JLabel pin = new JLabel("PIN:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
      pin.setFont(new Font("Raleway",Font.BOLD,28));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
      pin.setBounds(120,220,250,30);/*text dikhana kaha h uska address h*/
      add(pin);
      
//      pinTextField = new JTextField();/*text likhne ke liye box chahiye*/
      pinTextField = new JPasswordField();/*text likhne ke liye box chahiye*/
      pinTextField.setBounds(300,220,230,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
      pinTextField.setFont(new Font("Arial",Font.BOLD,14));
      add(pinTextField);
      
      login = new JButton("SIGN IN");
      login.setBounds(300,300,100,30);
      login.setBackground(Color.BLACK);
      login.setForeground(Color.WHITE);
      login.addActionListener(this);/*button under events ko mcatch karne ke liye ki button pe kuch events hua h*/
      add(login);
      
      clear = new JButton("CLEAR");
      clear.setBounds(430,300,100,30);
      clear.setBackground(Color.BLACK);
      clear.setForeground(Color.WHITE);
      clear.addActionListener(this);/*button under events ko mcatch karne ke liye ki button pe kuch events hua h*/
      add(clear);
      
      signup = new JButton("SIGN UP");
      signup.setBounds(300,350,230,30);
      signup.setBackground(Color.BLACK);
      signup.setForeground(Color.WHITE);
      signup.addActionListener(this);/*button under events ko mcatch karne ke liye ki button pe kuch events hua h*/
      add(signup);
      
      getContentPane().setBackground(Color.WHITE);/*pure frame ko uthane ke liye getcontenpane ka use krte h isse hum frame pe color kr sake*/
      setSize(800,470);/* set sixe frame ke dimention ko defined krti h*/  
      setVisible(true);/*yh ek fun h... by default jo frame hota h wo user se hidden hoti h..frame ko show karne ke liye*/
      setLocation(350,100);/*350 left se aage khule or uper se 200... by default frame ka location origin left hota h iski ko yh chnage krne ke liye hum yh method use krte h*/
      
      
      
    }
    public void actionPerformed(ActionEvent ae)/*actionlisner ke ander jitne bhi abstract bmethods hote h usko override krna parta h*/
    {
       if(ae.getSource()== clear) {
           cardTextField.setText("");//blank rakhne ke liye
           pinTextField.setText("");
       }else if(ae.getSource()== login) {
           Conn conn = new Conn();
           String cardnumber= cardTextField.getText();
           String pinnumber= pinTextField.getText();
           String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
           try{
              ResultSet rs = conn.s.executeQuery(query);
              //yaha pe hum check karenge ki data nikl ke aaya h ya na
              if(rs.next()){
                 setVisible(false);
                 new Transactions(pinnumber).setVisible(true);
              }else{
                  JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
              }
               
           }catch(Exception e){
               System.out.println(e);
           }
       
       
       
       }else if(ae.getSource()== signup) {
           setVisible(false);
           new SignupOne().setVisible(true);
       }
    }
    public static void main(String args[]) {
      new Login().setVisible(true); /*objecft banate hi cotructor call hota h or hum object banate hi frame open krna chate h*/  
    }
}
