package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Stationary extends JFrame implements ActionListener
{
	private JPanel panel1,panel2;
	private JButton btn1,btn2,btn3,btn4,backbtn,logout;
	private JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,img;
	private Font myfont,font;
	private ImageIcon icon;
	
	public Stationary()
	{
		super("Stationary");
		this.setSize(1366,768);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		//panel1
		
		panel1 = new JPanel();
        panel1.setBounds(0, 0, 1366, 270);
        panel1.setBackground(new Color(79, 117, 68));
        panel1.setLayout(null);
		this.add(panel1);
		
		
		//panel2
 
        panel2 = new JPanel();
        panel2.setBounds(0, 0, 1366, 498);
        panel2.setBackground(new Color(211,211,211));
        panel2.setLayout(null);
        this.add(panel2);
		
		//font
		myfont=new Font("Arial",Font.BOLD,20);
		font=new Font("Arial",Font.PLAIN,17);
		
		//Button
		btn1=new JButton("Bangla");
		btn1.setIcon(new ImageIcon("Image/geometry260x250.jpg"));
		btn1.setBounds(100,330,250,250);
		btn1.addActionListener(this);
		panel2.add(btn1);
		
		btn2=new JButton("English");
		btn2.setIcon(new ImageIcon("Image/SSC260x250.jpg"));
		btn2.setBounds(400,330,250,250);
		btn2.addActionListener(this);
		panel2.add(btn2);
		
		btn3=new JButton("Math");
		btn3.setIcon(new ImageIcon("Image/pencilbox260x250.jpg"));
		btn3.setBounds(700,330,250,250);
		btn3.addActionListener(this);
		panel2.add(btn3);
		
		btn4=new JButton("Java");
		btn4.setIcon(new ImageIcon("Image/watercolour260x250.jpg"));
		btn4.setBounds(1000,330,250,250);
		btn4.addActionListener(this);
		panel2.add(btn4);
		
		backbtn=new JButton();
		backbtn.setBounds(10,10,50,40);
		backbtn.setContentAreaFilled(false);
		backbtn.setBorderPainted(false);
		backbtn.setIcon(new ImageIcon("Image/return.png"));
		backbtn.addActionListener(this);
		panel1.add(backbtn);
		
		logout=new JButton("Log Out");
		logout.setBounds(1250,10,100,30);
		logout.setContentAreaFilled(false);
		logout.setBorderPainted(false);
		logout.setForeground(Color.RED);
		logout.addActionListener(this);
		panel1.add(logout);
		
		//Label
		lab1=new JLabel("Geometry Box");
		lab1.setBounds(100,600,250,50);
		panel2.add(lab1);
		
		lab2=new JLabel("Stationery Items");
		lab2.setBounds(100,670,250,50);
		panel2.add(lab2);
		
		lab3=new JLabel("Combo Box For SSC");
		lab3.setBounds(400,600,250,50);
		panel2.add(lab3);
		
		lab4=new JLabel("Stationery Items");
		lab4.setBounds(400,670,250,50);
		panel2.add(lab4);
		
		lab5=new JLabel("Pencil Box");
		lab5.setBounds(700,600,250,50);
		panel2.add(lab5);
		
		lab6=new JLabel("Stationery Items");
		lab6.setBounds(700,670,250,50);
		panel2.add(lab6);
		
		lab7=new JLabel("Water Color");
		lab7.setBounds(1000,600,250,50);
		panel2.add(lab7);
		
		lab8=new JLabel("Stationery Items");
		lab8.setBounds(1000,670,250,50);
		panel2.add(lab8);
		
		//Image panel1
		icon=new ImageIcon("Image/Discount.png");
		img=new JLabel(icon);
		img.setBounds(0,0,1366,270);
		panel1.add(img);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==backbtn)
		{
			homepage h1=new homepage();
			h1.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==logout)
		{
			Login l1=new Login();
			l1.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==btn1)
		{
			product9 p9=new product9();
			p9.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==btn2)
		{
			product10 p10=new product10();
			p10.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==btn3)
		{
			product11 p11=new product11();
			p11.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==btn4)
		{
			product12 p12=new product12();
			p12.setVisible(true);
			this.setVisible(false);
		}
	
	}
}