package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;//pakage
//random class  util pachake ke ander hota g
import java.awt.event.*;
import java.sql.*;
public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,pinTextField,stateTextField,cityTextField ,emailTextField,addressTextField ,fnameTextField;
    JButton next;
    JRadioButton male, female,others,married,unmarried,other;
    JDateChooser dateChooser;
    
    SignupOne(){
       
       setLayout(null); 
        
       Random ran = new Random(); /* random no ke liye hum jo 4 nos chahiye application ka sabhi ka alag*/
//       System.out.println(Math.abs((ran.nextLong()%9000L)+1000L));
       random= Math.abs((ran.nextLong()%9000L)+1000L);
       
       JLabel formno = new JLabel("APPLICATION FORM NO. "+random);/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       formno.setFont(new Font("Raleway",Font.BOLD,38));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       formno.setBounds(140,20,600,40);/*text dikhana kaha h uska address h*/
       add(formno);
       
       JLabel personDetails = new JLabel("Page 1: Personal Details");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       personDetails.setFont(new Font("Raleway",Font.BOLD,22));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       personDetails.setBounds(290,80,400,30);/*text dikhana kaha h uska address h*/
       add(personDetails);
       
       JLabel name = new JLabel("Name:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       name.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       name.setBounds(100,140,100,30);/*text dikhana kaha h uska address h*/
       add(name);
       
       nameTextField = new JTextField();/*text likhne ke liye box chahiye*/
       nameTextField.setBounds(300,140,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       nameTextField.setFont(new Font("raleway",Font.BOLD,14));
       add(nameTextField);
       
       JLabel fname = new JLabel("Father's Name:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       fname.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       fname.setBounds(100,190,200,30);/*text dikhana kaha h uska address h*/
       add(fname);
       
       fnameTextField = new JTextField();/*text likhne ke liye box chahiye*/
       fnameTextField.setBounds(300,190,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       fnameTextField.setFont(new Font("raleway",Font.BOLD,14));
       add(fnameTextField);
       
       JLabel dob = new JLabel("Date of Birth:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       dob.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       dob.setBounds(100,240,200,30);/*text dikhana kaha h uska address h*/
       add(dob);
       
       dateChooser = new JDateChooser();/*text likhne ke liye box chahiye*/
       dateChooser.setBounds(300,240,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       dateChooser.setForeground(new Color(105,105,105));
       add(dateChooser);
       
       JLabel gender = new JLabel("Gender:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       gender.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       gender.setBounds(100,290,200,30);/*text dikhana kaha h uska address h*/
       add(gender);
       
       male = new JRadioButton("Male");/*text likhne ke liye box chahiye*/
       male.setBounds(300,290,60,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       male.setBackground(Color.WHITE);
       add(male);
       
       female = new JRadioButton("Female");/*text likhne ke liye box chahiye*/
       female.setBounds(450,290,120,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       female.setBackground(Color.WHITE);
       add(female);
       
       others = new JRadioButton("Others");/*text likhne ke liye box chahiye*/
       others.setBounds(600,290,60,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       others.setBackground(Color.WHITE);
       add(others);
       
       //button group humara class hota h iska hum ne object banaya taki hum ek radio button ek time select kr sake
       ButtonGroup gendergroup = new ButtonGroup();
       gendergroup.add(male);
       gendergroup.add(female);
       gendergroup.add(others);
       
       JLabel email = new JLabel("Email Address:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       email.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       email.setBounds(100,340,200,30);/*text dikhana kaha h uska address h*/
       add(email);
       
       emailTextField = new JTextField();/*text likhne ke liye box chahiye*/
       emailTextField.setBounds(300,340,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       emailTextField.setFont(new Font("raleway",Font.BOLD,14));
       add(emailTextField);
       
       JLabel marital = new JLabel("Marital Status:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       marital.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       marital.setBounds(100,390,200,30);/*text dikhana kaha h uska address h*/
       add(marital);
       
       married = new JRadioButton("Married");/*text likhne ke liye box chahiye*/
       married.setBounds(300,390,100,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       married.setBackground(Color.WHITE);
       add(married);
       
       unmarried = new JRadioButton("Unmarried");/*text likhne ke liye box chahiye*/
       unmarried.setBounds(450,390,100,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       unmarried.setBackground(Color.WHITE);
       add(unmarried);
       
       other = new JRadioButton("Other");/*text likhne ke liye box chahiye*/
       other.setBounds(630,390,100,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       other.setBackground(Color.WHITE);
       add(other);
       
       //button group humara class hota h iska hum ne object banaya taki hum ek radio button ek time select kr sake
       ButtonGroup maritalgroup = new ButtonGroup();
       maritalgroup.add(married);
       maritalgroup.add(unmarried);
       maritalgroup.add(other);
       
       JLabel address = new JLabel("Address:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       address.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       address.setBounds(100,440,200,30);/*text dikhana kaha h uska address h*/
       add(address);
       
       addressTextField = new JTextField();/*text likhne ke liye box chahiye*/
       addressTextField.setBounds(300,440,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       addressTextField.setFont(new Font("raleway",Font.BOLD,14));
       add(addressTextField);
       
       JLabel city = new JLabel("City:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       city.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       city.setBounds(100,490,200,30);/*text dikhana kaha h uska address h*/
       add(city);
       
       cityTextField = new JTextField();/*text likhne ke liye box chahiye*/
       cityTextField.setBounds(300,490,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       cityTextField.setFont(new Font("raleway",Font.BOLD,14));
       add(cityTextField);
       
       JLabel state= new JLabel("State:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       state.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       state.setBounds(100,540,200,30);/*text dikhana kaha h uska address h*/
       add(state);
       
       stateTextField = new JTextField();/*text likhne ke liye box chahiye*/
       stateTextField.setBounds(300,540,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       stateTextField.setFont(new Font("raleway",Font.BOLD,14));
       add(stateTextField);
       
       JLabel pin = new JLabel("Pin Code:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       pin.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       pin.setBounds(100,590,200,30);/*text dikhana kaha h uska address h*/
       add(pin);
       
       pinTextField = new JTextField();/*text likhne ke liye box chahiye*/
       pinTextField.setBounds(300,590,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       pinTextField.setFont(new Font("raleway",Font.BOLD,14));
       add(pinTextField);
       
       next = new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("raleway",Font.BOLD,14));
       next.setBounds(620, 660, 80, 30);
       next.addActionListener(this);
       add(next);
      
       getContentPane().setBackground(Color.WHITE);
       setSize(900,800);
       setLocation(350,10);
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae)/*actionlisner ke ander jitne bhi abstract bmethods hote h usko override krna parta h*/
    {
       String formno = "" + random;//long me convert karne ke liye concetenate kiya gaya h
       String name = nameTextField.getText();//name me se value nikalne ke liye hum gettext function ka use krte h
       String fname = fnameTextField.getText();//name me se value nikalne ke liye hum gettext function ka use krte h
       String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();//getdateeditor string type return krta h is liye hume jtextfield lagana para h jo hume date de
       String gender=null;
       if(male.isSelected()){
           gender="Male";
       }else if(female.isSelected()){
           gender="Female";
       }else if(others.isSelected()){
           gender="Others";
       }
       String email = emailTextField.getText();
       String marital=null;
       if(married.isSelected()){
           gender="Married";
       }else if(unmarried.isSelected()){
           gender="Unmarried";
       }else if(other.isSelected()){
           gender="Other";
       }
       String address=addressTextField.getText();
       String city=cityTextField.getText();
       String state=stateTextField.getText();
       String pin=pinTextField.getText();
    
       try{
           if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is Required");//joption pane se hum alert create krte h   
           }else{
               Conn c = new Conn();
               String query;
               query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
     
               c.s.executeUpdate(query);
               
               //next pe click karte hi signup two khulne ke liye
//               
               new SignupTwo(formno).setVisible(true);
               setVisible(false);
           }   
       }catch(Exception e){
           System.out.println(e);
       }
    
    
    
    
    
    }
    
    public static void main(String args[]) {
     new SignupOne().setVisible(true);//create object;   
    }
}
