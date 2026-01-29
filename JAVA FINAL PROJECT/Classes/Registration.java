package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import Interfaces.*;

public class Registration extends JFrame implements ActionListener
{
	private JPanel panel1,panel2;
	private JButton singup,clear,logb;
	private JLabel label1,namel,email,phone,id,pass,compass,capctha,headlineLabel,gen,img,text;
	private JPasswordField passfild,cpass;
	private JTextField name,emailt,pho,idt,capt;
	private JRadioButton r1,r2;
	private ButtonGroup bg1;
	private Font myfont,font;
	private ImageIcon icon;
	private Random rand;
	private JCheckBox box,cbox;
	private int a,b,result;
	
	public Registration()
	{
		super("Registration");
		this.setSize(1366,768);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		//panel1
		
		panel1 = new JPanel();
        panel1.setBounds(0, 0, 746, 768);
        panel1.setLayout(null);
		this.add(panel1);
		
		icon=new ImageIcon("Image/Registration.jpg");
		img=new JLabel(icon);
		img.setBounds(0,0,746,768);
		panel1.add(img);
		
        //panel2
 
        panel2 = new JPanel();
        panel2.setBounds(746, 0, 620, 768);
        panel2.setBackground(new Color(211,211,211));
        panel2.setLayout(null);
        this.add(panel2);
		
		//font
		myfont=new Font("Arial",Font.BOLD,20);
		font=new Font("Arial",Font.PLAIN,17);
		
		//Label
		headlineLabel=new JLabel("Create Account");
		headlineLabel.setBounds(966,10,300,80);
		headlineLabel.setFont(myfont);
		panel2.add(headlineLabel);
		
		namel=new JLabel("Name : ");
		namel.setBounds(896,100,100,26);
		namel.setFont(font);
		panel2.add(namel);
		
		email=new JLabel("Email : ");
		email.setBounds(896,140,100,26);
		email.setFont(font);
		panel2.add(email);
		
		gen=new JLabel("Gender");
		gen.setBounds(896,180,60,30);
		gen.setFont(font);
		panel2.add(gen);
		
		
		phone=new JLabel("Phone : ");
		phone.setBounds(896,220,100,26);
		phone.setFont(font);
		panel2.add(phone);
		
		id=new JLabel("Id : ");
		id.setBounds(896,260,100,26);
		id.setFont(font);
		panel2.add(id);
		
		pass=new JLabel("Password : ");
		pass.setBounds(896,300,100,26);
		pass.setFont(font);
		panel2.add(pass);
		
		compass=new JLabel("Confirm Password : ");
		compass.setBounds(896,340,170,26);
		compass.setFont(font);
		panel2.add(compass);
		
		capctha=new JLabel("Sum : ");
		capctha.setBounds(896,380,100,26);
		capctha.setFont(font);
		panel2.add(capctha);
		
		text=new JLabel("Already have an account?");
		text.setBounds(1006,620,200,30);
		text.setFont(font);
		panel2.add(text);
		
		//Textfild
		name=new JTextField();
		name.setBounds(1046,100,150,26);
		panel2.add(name);
		
		emailt=new JTextField();
		emailt.setBounds(1046,140,150,26);
		panel2.add(emailt);
		
		
		pho=new JTextField();
		pho.setBounds(1046,220,150,26);
		panel2.add(pho);
		
		idt=new JTextField();
		idt.setBounds(1046,260,150,26);
		panel2.add(idt);
		
		capt=new JTextField();
		capt.setBounds(1046,380,150,26);
		panel2.add(capt);
		
		//Passfild
		passfild=new JPasswordField();
		passfild.setBounds(1046,300,150,26);
		panel2.add(passfild);
		
		cpass=new JPasswordField();
		cpass.setBounds(1046,340,150,26);
		panel2.add(cpass);
		
		//Button
		
		singup=new JButton("Sign up");
		singup.setBounds(921,480,170,30);
		singup.addActionListener(this);
		panel2.add(singup);
		
		clear=new JButton("Clear");
		clear.setBounds(1106,480,170,30);
		clear.addActionListener(this);
		panel2.add(clear);
		
		
		logb=new JButton("Login");
		logb.setBounds(1185,620,100,30);
		logb.setFont(font);
		logb.setContentAreaFilled(false);
		logb.setBorderPainted(false);
		logb.setForeground(Color.RED);
		logb.addActionListener(this);
		panel2.add(logb);
		
		//JRadioButton
		r1=new JRadioButton("Male");
		r1.setBounds(1046,180,80,30);
		r1.setFont(font);
		panel2.add(r1);
		
		r2=new JRadioButton("Female");
		r2.setBounds(1136,180,90,30);
		r2.setFont(font);
		panel2.add(r2);
		
		//ButtonGroup
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		
		//checkbox
		box=new JCheckBox();
		box.setBounds(1210,305,20,20);
		box.addActionListener(this);
		panel2.add(box);
		
		//checkbox
		cbox=new JCheckBox();
		cbox.setBounds(1210,345,20,20);
		cbox.addActionListener(this);
		panel2.add(cbox);
		
		
		rand = new Random();
        a = rand.nextInt(10);
        b = rand.nextInt(10);

        // Captcha
        label1 = new JLabel();
        label1.setText(" " + a + " + " + b + " ");
        label1.setBounds(970, 380, 60, 26);
        label1.setFont(font);
        label1.setForeground(Color.red);
        label1.setBackground(Color.decode("#FFD3D3"));
        label1.setOpaque(true);
        panel2.add(label1);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		String namel=name.getText();
		String pass=passfild.getText();

		
		
		if(ae.getSource()==singup)
		{
			
			
			if(name.getText().isEmpty()||emailt.getText().isEmpty()||pho.getText().isEmpty()||
			idt.getText().isEmpty()||capt.getText().isEmpty()||passfild.getText().isEmpty()||
			cpass.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill Up All");
			}
			
			else if ( !cpass.getText().equals(passfild.getText()))
		    {
		       JOptionPane.showMessageDialog(null,"Password Not Matched.");
		    }
			
			else 
			{
			
			   result = Integer.parseInt(capt.getText());
		       if (result != (a + b)) 
		       {
                  JOptionPane.showMessageDialog(null, "Wrong Captcha.");
               }
			else
			   {
				  Account acc=new Account(namel,pass);
				  acc.addaccount();
				
				  JOptionPane.showMessageDialog(null,"SuccessFully Registered.");
				
				  name.setText("");
				  passfild.setText("");
				
				  Login l1=new Login();
			      l1.setVisible(true);
			      this.setVisible(false);
				
			   }
			}
			
		
			
		}
		
		if(ae.getSource()==box)
		{
		    if(box.isSelected())
			{
				passfild.setEchoChar((char)0);
			}
			else
			{
				passfild.setEchoChar('*');
			}
		}
			
			if(ae.getSource()==cbox)
		{
		    if(cbox.isSelected())
			{
				cpass.setEchoChar((char)0);
			}
			else
			{
				cpass.setEchoChar('*');
			}
			
		}
		
		if(ae.getSource()==clear)
		{
			 clearFields();
		}
		
		if(ae.getSource()==logb)
			{
				Login l1=new Login();
			    l1.setVisible(true);
			    this.setVisible(false);
			}
		
		
		
	}
	public void clearFields()
	{
		
		name.setText("");
		emailt.setText("");
		pho.setText("");
		idt.setText("");
		capt.setText("");
		passfild.setText("");
		cpass.setText("");
		
	}

}