package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Interfaces.*;

public class AdminLogin extends JFrame implements ActionListener
{
	private JPanel panel1,panel2;
	private JButton backbtn,adlog;
	private JLabel namel,pass,headlineLabel,img;
	private JPasswordField passfild;
	private JTextField name;
	private Font myfont,font;
	private ImageIcon icon;
	private JCheckBox box;
	
	public AdminLogin()
	{
		super("Admin Login");
		this.setSize(1366,768);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		//panel1
		panel1 = new JPanel();
        panel1.setBounds(0, 0, 746, 768);
        panel1.setLayout(null);
		this.add(panel1);
		
		
		
        //panel2
 
        panel2 = new JPanel();
        panel2.setBounds(746, 0, 620, 768);
        panel2.setBackground(new Color(211,211,211));
        panel2.setLayout(null);
        this.add(panel2);
		
		
		//Fontsize
		myfont=new Font("Arial",Font.BOLD,30);
		font=new Font("Arial",Font.PLAIN,17);
		
		//Label
		headlineLabel=new JLabel("Login to Admin Panel");
		headlineLabel.setBounds(946,35,400,80);
		headlineLabel.setFont(myfont);
		panel2.add(headlineLabel);
		
		namel=new JLabel("Name : ");
		namel.setBounds(951,235,100,26);
		namel.setFont(font);
		panel2.add(namel);
		
		pass=new JLabel("Password : ");
		pass.setBounds(951,330,100,26);
		pass.setFont(font);
		panel2.add(pass);
		
		
		
		//Textfild
		name=new JTextField();
		name.setBounds(1046,220,160,40);
		panel2.add(name);
		
		//Passfild
		passfild=new JPasswordField();
		passfild.setBounds(1046,320,160,40);
		panel2.add(passfild);
		
		//Button
		
		backbtn=new JButton();
		backbtn.setBounds(10,10,50,40);
		backbtn.setContentAreaFilled(false);
		backbtn.setBorderPainted(false);
		backbtn.setIcon(new ImageIcon("Image/return.png"));
		backbtn.addActionListener(this);
		panel1.add(backbtn);
		
		adlog=new JButton("Admin Login");
		adlog.setBounds(1060,400,130,35);
		adlog.addActionListener(this);
		adlog.setFont(font);
		panel2.add(adlog);
		
		//checkbox
		box=new JCheckBox();
		box.setBounds(1210,330,20,20);
		box.addActionListener(this);
		panel2.add(box);
		
		icon=new ImageIcon("Image/adminlog.jpg");
		img=new JLabel(icon);
		img.setBounds(0,0,746,768);
		panel1.add(img);
		
		
		
		
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
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
		
		if(ae.getSource()==backbtn)
		{
			Login l1=new Login();
			l1.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==adlog)
		{
			if(name.getText().isEmpty()||passfild.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill Up All");
			}
			
			else
			{
			String namel=name.getText();
			String pass=passfild.getText();
			
			AdminAccount acc=new AdminAccount();
			
			if(acc.getAdminAccount(namel,pass)==true)
			{
			
			JOptionPane.showMessageDialog(null,"Login Successful.");
			
			Adminpanel a1=new Adminpanel();
			a1.setVisible(true);
			this.setVisible(false);
		   }
		   
		   else{
			   JOptionPane.showMessageDialog(null,"Account does't exist.");
		   }
		   
		}
		
	}
}
}