
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
    //long random;
    JTextField pan,aadhar; 
    JButton next;
    JRadioButton syes, sno,eyes,eno;
    String formno;//signone oe signtwo ko intermeat krn eke liye isse yh pata chalega ki ek person ki value h
    JComboBox religion,category,occupation,education,income;
    SignupTwo(String formno){
       this.formno = formno;
       setLayout(null); 
       
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       
       
       JLabel additionalDetails = new JLabel("Page 2: Additional Details");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       additionalDetails.setBounds(290,80,400,30);/*text dikhana kaha h uska address h*/
       add(additionalDetails);
       
       JLabel name = new JLabel("Religion:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       name.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       name.setBounds(100,140,100,30);/*text dikhana kaha h uska address h*/
       add(name);
       
       //comboboc ke help e hum dropdown box bante h
       //combobox class h swing ke ander isme hume array of sting pass krni hoti h
       String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
       religion = new JComboBox(valReligion);
       religion.setBounds(300,140,400,30);
       religion.setBackground(Color.WHITE);
       add(religion);
       
       
       JLabel fname = new JLabel("Category:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       fname.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       fname.setBounds(100,190,200,30);/*text dikhana kaha h uska address h*/
       add(fname);
       
       String valcategory[] = {"General","OBC","SC","ST","Other"};
       category = new JComboBox(valcategory);
       category.setBounds(300,190,400,30);
       category.setBackground(Color.WHITE);
       add(category);
       
   
       
       JLabel dob = new JLabel("Income:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       dob.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       dob.setBounds(100,240,200,30);/*text dikhana kaha h uska address h*/
       add(dob);
       
       String incomecategory[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto < 10,00,000"};
       income = new JComboBox(incomecategory);
       income.setBounds(300,240,400,30);
       income.setBackground(Color.WHITE);
       add(income);
       
       JLabel gender = new JLabel("Educational:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       gender.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       gender.setBounds(100,290,200,30);/*text dikhana kaha h uska address h*/
       add(gender);
       
       
       
      
       
       JLabel email = new JLabel("Qualification:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       email.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       email.setBounds(100,315,200,30);/*text dikhana kaha h uska address h*/
       add(email);
       
       String educationValues[] = {"Non-Graduation","Graduation","Post-Graduation","Doctrate","Others"};
       education = new JComboBox(educationValues);
       education.setBounds(300,315,400,30);
       education.setBackground(Color.WHITE);
       add(education );
       
      
       
       JLabel marital = new JLabel("Occupation:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       marital.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       marital.setBounds(100,390,200,30);/*text dikhana kaha h uska address h*/
       add(marital);
       
       String occupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
       occupation = new JComboBox(occupationValues);
       occupation.setBounds(300,390,400,30);
       occupation.setBackground(Color.WHITE);
       add(occupation);
       
       
      
       
       JLabel address = new JLabel("PAN Number:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       address.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       address.setBounds(100,440,200,30);/*text dikhana kaha h uska address h*/
       add(address);
       
       pan = new JTextField();/*text likhne ke liye box chahiye*/
        pan.setBounds(300,440,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
        pan.setFont(new Font("raleway",Font.BOLD,14));
       add( pan);
       
       JLabel city = new JLabel("Aadhar Number:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       city.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       city.setBounds(100,490,200,30);/*text dikhana kaha h uska address h*/
       add(city);
       
       aadhar = new JTextField();/*text likhne ke liye box chahiye*/
       aadhar.setBounds(300,490,400,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       aadhar.setFont(new Font("raleway",Font.BOLD,14));
       add(aadhar);
       
       JLabel state= new JLabel("Senior Citizen:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       state.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       state.setBounds(100,540,200,30);/*text dikhana kaha h uska address h*/
       add(state);
       
       
       syes = new JRadioButton("Yes");/*text likhne ke liye box chahiye*/
       syes.setBounds(300,540,100,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       syes.setBackground(Color.WHITE);
       add(syes);
       
       sno = new JRadioButton("No");/*text likhne ke liye box chahiye*/
       sno.setBounds(450,540,100,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       sno.setBackground(Color.WHITE);
       add(sno);
       
       
       
       //button group humara class hota h iska hum ne object banaya taki hum ek radio button ek time select kr sake
       ButtonGroup maritalgroup = new ButtonGroup();
       maritalgroup.add(syes);
       maritalgroup.add(sno);
       
       JLabel pincode = new JLabel("Exisiting Account:");/*flable ke help se hum kuch bhi content likh sake h frame pe*/
       pincode.setFont(new Font("Raleway",Font.BOLD,20));/* setfont method  ko set krna hota h uske ander ek object banana hota h*/
       pincode.setBounds(100,590,200,30);/*text dikhana kaha h uska address h*/
       add(pincode);
       
        
       eyes = new JRadioButton("Yes");/*text likhne ke liye box chahiye*/
       eyes.setBounds(300,590,100,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       eyes.setBackground(Color.WHITE);
       add(eyes);
       
       eno = new JRadioButton("No");/*text likhne ke liye box chahiye*/
       eno.setBounds(450,590,100,30);/*cardno.setBounds(120(yh),150,150(yh),40)=120+150=270 h is liye 300 se start karenge*/
       eno.setBackground(Color.WHITE);
       add(eno);
       
       
       
       //button group humara class hota h iska hum ne object banaya taki hum ek radio button ek time select kr sake
       ButtonGroup emaritalgroup = new ButtonGroup();
       emaritalgroup.add(eyes);
       emaritalgroup.add(eno);
       
       next = new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("raleway",Font.BOLD,14));
       next.setBounds(620, 660, 80, 30);
       next.addActionListener(this);
       add(next);
      
       getContentPane().setBackground(Color.WHITE);
       setSize(850,800);
       setLocation(350,10);
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae)/*actionlisner ke ander jitne bhi abstract bmethods hote h usko override krna parta h*/
    {
       //String formno = "" + random;//long me convert karne ke liye concetenate kiya gaya h
       String sreligion = (String)religion.getSelectedItem();//hume dropboewn se value ko relect krna h isliye hum getselecteditem ka use kr rahe h jo ek methods h..yh ek object ko return krta h  isliye hum type cast krna para string se kyu ki hume string me value chahiye
       String scategory = (String)category.getSelectedItem();
       String sincome = (String)income.getSelectedItem();
       String seducation = (String)education.getSelectedItem();
       String soccupation = (String)occupation.getSelectedItem();
       
       String seniorcitizen=null;
       if(syes.isSelected()){
          seniorcitizen ="Yes";
       }else if(sno.isSelected()){
           seniorcitizen="No";
       }
       
      
       String exisitingaccount=null;
       if(eyes.isSelected()){
           exisitingaccount="Yes";
       }else if(eno.isSelected()){
           exisitingaccount="No";
       }
       
       String span=pan.getText();
       String saadhar=aadhar.getText();
       
       try{
          
               Conn c = new Conn();
               String query;
               query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
     
               c.s.executeUpdate(query);
               
               //signup3 object
               setVisible(false);
               new SignupThree(formno).setVisible(true); 
       }catch(Exception e){
           System.out.println(e);
       }
    
    
    
    
    
    }
    
    public static void main(String args[]) {
     new SignupTwo("").setVisible(true);//create object;   
    }
}

