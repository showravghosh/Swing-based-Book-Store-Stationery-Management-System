package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Interfaces.*;

public class Login extends JFrame implements MouseListener,ActionListener
{
	private JPanel panel1,panel2;
	private JButton ulog,alog,cna;
	private JLabel namel,pass,headlineLabel,ques,img;
	private JPasswordField passfild;
	private JTextField name;
	private Font myfont,font;
	private ImageIcon icon;
	private JCheckBox box;
	
	public Login()
	{
		super("LOGIN");
		this.setSize(1366,768);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		//panel1
		
		panel1 = new JPanel();
        panel1.setBounds(0, 0, 746, 768);
        panel1.setLayout(null);
		this.add(panel1);
		
		icon=new ImageIcon("Image/Login.jpg");
		img=new JLabel(icon);
		img.setBounds(0,0,746,768);
		panel1.add(img);
		
		
		
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
		headlineLabel=new JLabel("Login to Bookish Store");
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
		
		ques=new JLabel("Create a new account.");
		ques.setBounds(1006,540,200,30);
		ques.setFont(font);
		panel2.add(ques);
		
		//Textfild
		name=new JTextField();
		name.setBounds(1046,220,160,45);
		panel2.add(name);
		
		//Passfild
		passfild=new JPasswordField();
		passfild.setBounds(1046,320,160,45);
		panel2.add(passfild);
		
		//Button
		
		ulog=new JButton("User Login");
		ulog.setBounds(921,400,170,40);
		ulog.setFont(font);
		ulog.setForeground(Color.WHITE);
		ulog.setBackground(new Color(25, 113, 255));
		ulog.addActionListener(this);
		ulog.addMouseListener(this);
		panel2.add(ulog);
		
		alog=new JButton("Admin Login");
		alog.setBounds(1106,400,170,40);
		alog.setFont(font);
		alog.setForeground(Color.WHITE);
		alog.setBackground(new Color(25, 113, 255));
		alog.addActionListener(this);
		alog.addMouseListener(this);
		panel2.add(alog);
			
		
		cna=new JButton("Sign in");
		cna.setBounds(1170,540,100,30);
		cna.setFont(font);
		cna.setContentAreaFilled(false);
		cna.setBorderPainted(false);
		cna.setForeground(Color.BLUE);
		cna.addActionListener(this);
		panel2.add(cna);
		
		//checkbox
		box=new JCheckBox();
		box.setBounds(1210,345,20,20);
		box.addActionListener(this);
		panel2.add(box);
		
		
	
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==ulog)
		{
			ulog.setBackground(Color.GREEN);
			ulog.setForeground(Color.BLACK);
		}
		
		else if(me.getSource()==alog)
		{
			alog.setBackground(Color.GREEN);
			alog.setForeground(Color.BLACK);
		}


	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==ulog)
		{
			ulog.setBackground(new Color(25, 113, 255));
			ulog.setForeground(Color.WHITE);
		}
		
		else if(me.getSource()==alog)
		{
			alog.setBackground(new Color(25, 113, 255));
			alog.setForeground(Color.WHITE);
		}
	

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
			
		
		if(ae.getSource()==alog)
		{
			AdminLogin a1=new AdminLogin();
			a1.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==cna)
		{
			Registration r1=new Registration();
			r1.setVisible(true);
			this.setVisible(false);
		}
		if(ae.getSource()==ulog)
		{
			if(name.getText().isEmpty()||passfild.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill Up All");
			}
			
			else
			{
			String namel=name.getText();
			String pass=passfild.getText();
			
			Account acc=new Account();
			
			if(acc.getAccount(namel,pass)==true)
			{
			
			JOptionPane.showMessageDialog(null,"Login Successful.");
			
			homepage h1=new homepage();
			h1.setVisible(true);
			this.setVisible(false);
		   }
		   
		   else
		   {
			   JOptionPane.showMessageDialog(null,"Account does't exist.");
		   }
		   
		}
		
		
	}
	
}
}