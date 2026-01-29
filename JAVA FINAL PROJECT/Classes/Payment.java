package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Payment extends JFrame implements ActionListener
{
	private JPanel panel1,panel2;
	private JLabel lab1,lab2,lab3,lab4,lab5,img,img2;
	private JTextField tf1,tf2,tf3,tf4;
	private JButton btn1,backbtn;
	private Font font1,font2;
	private ImageIcon icon,icon2;
	
	public Payment()
	{
		super("Payment");
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
		
		//font
		font1=new Font("Arial",Font.BOLD,25);
		font2=new Font("Arial",Font.PLAIN,17);
		
		//Label
		lab1=new JLabel("Online Payment");
		lab1.setBounds(956,70,200,80);
	    lab1.setFont(font1);
		panel2.add(lab1);
		
		lab2=new JLabel("Card number : ");
		lab2.setBounds(850,250,120,35);
		lab2.setFont(font2);
		panel2.add(lab2);
		
		lab3=new JLabel("Name on card : ");
		lab3.setBounds(850,300,120,35);
		lab3.setFont(font2);
		panel2.add(lab3);
		
		lab4=new JLabel("Expiration date : ");
		lab4.setBounds(850,350,140,35);
		lab4.setFont(font2);
		panel2.add(lab4);
		
		
		lab5=new JLabel("CVV : ");
		lab5.setBounds(850,400,120,35);
		lab5.setFont(font2);
		panel2.add(lab5);
		
		//Textfild
		tf1=new JTextField();
		tf1.setBounds(1000,250,170,30);
		panel2.add(tf1);
		
		tf2=new JTextField();
		tf2.setBounds(1000,300,170,30);
		panel2.add(tf2);
		
		tf3=new JTextField();
		tf3.setBounds(1000,350,100,30);
		panel2.add(tf3);
		
		tf4=new JTextField();
		tf4.setBounds(1000,400,100,30);
		panel2.add(tf4);
		
		//Button
		btn1=new JButton("pay");
		btn1.setBounds(1000,480,150,30);
		btn1.setFont(font2);
		btn1.addActionListener(this);
		panel2.add(btn1);
		
		backbtn=new JButton();
		backbtn.setBounds(10,10,50,40);
		backbtn.setContentAreaFilled(false);
		backbtn.setBorderPainted(false);
		backbtn.setIcon(new ImageIcon("Image/return.png"));
		backbtn.addActionListener(this);
		panel1.add(backbtn);
		
	
		
		//Picture
		icon=new ImageIcon("Image/payment.png");
		img=new JLabel(icon);
		img.setBounds(850,180,icon.getIconWidth(),icon.getIconHeight());
		panel2.add(img);
		
		icon2=new ImageIcon("Image/payment 2.jpg");
		img2=new JLabel(icon2);
		img2.setBounds(0,0,746,768);
		panel1.add(img2);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn1)
		{
			String lab2=tf1.getText();
			String lab3=tf2.getText();
			String lab4=tf3.getText();
			String lab5=tf4.getText();
			if(lab2.isEmpty()||lab3.isEmpty()||lab4.isEmpty()||lab5.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill Up All");
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Payment Successful.");
			homepage h1=new homepage();
			h1.setVisible(true);
			this.setVisible(false);
			}
		}
		
		if(ae.getSource()==backbtn)
		{
			homepage h1=new homepage();
			h1.setVisible(true);
			this.setVisible(false);
		}
	}
}