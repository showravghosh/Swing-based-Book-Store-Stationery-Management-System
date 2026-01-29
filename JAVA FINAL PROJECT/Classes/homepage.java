package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class homepage extends JFrame implements ActionListener
{
	private ImageIcon img;
	private JLabel userLabel1,userLabel2,userLabel3,imgLabel;
	private JButton stBtn, oldBtn, newBtn,welBtn,logout;
	private JPanel panel1,panel2;
	private Color myColor;
	private Font myFont;

	public homepage()
	{
		
        this.setSize(1366, 768);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panel 
		panel1 = new JPanel();
        panel1.setBounds(0,0,600,768);
        panel1.setBackground(new Color(0, 0, 255));
        panel1.setLayout(null);
        this.add(panel1);
        
        panel2 = new JPanel();
        panel2.setBounds(600,0,766,768);
        panel2.setBackground(new Color(250, 250, 250));
        panel2.setLayout(null);
        this.add(panel2);
        
		//Font
		myFont = new Font("Arial Narrow", Font.BOLD, 29);
	
		
		//Label
		userLabel1 = new JLabel("Explore Our Stationary Products");
		userLabel1.setBounds(195, 70, 406, 90);
		userLabel1.setForeground(new Color(255, 117, 24));
		userLabel1.setFont(myFont);
		panel2.add(userLabel1);
		
		
		userLabel2 = new JLabel("Explore Our Old Novel Books");
		userLabel2.setBounds(245, 260, 406, 90);
		userLabel2.setForeground(new Color(255, 117, 24));
		userLabel2.setFont(myFont);
		panel2.add(userLabel2);
		
		
		
	    userLabel3 = new JLabel("Explore Our New Books");
		userLabel3.setBounds(245,470, 406, 90);
		userLabel3.setForeground(new Color(255, 117, 24));
		userLabel3.setFont(myFont);
		panel2.add(userLabel3);
		
		//Button with image
		stBtn = new JButton();
		stBtn.setIcon(new ImageIcon("Image/stationery.jpg"));
		stBtn.setBounds(308, 170, 150, 100);
		stBtn.setBackground(Color.PINK);
		stBtn.addActionListener(this);
		panel2.add(stBtn);
		
		
		oldBtn = new JButton();
		oldBtn.setIcon(new ImageIcon("Image/old-book.jpg"));
		oldBtn.setBounds(308, 370, 150, 100);
		oldBtn.setBackground(Color.PINK);
		oldBtn.addActionListener(this);
		panel2.add(oldBtn);
		
		
		newBtn = new JButton();
		newBtn.setIcon(new ImageIcon("Image/new-book.jpg"));
		newBtn.setBounds(308, 570, 150, 100);
		newBtn.setBackground(Color.PINK);
		newBtn.addActionListener(this);
		panel2.add(newBtn);
		
		
		logout=new JButton("Log Out");
		logout.setBounds(650,10, 100,30);
		logout.setContentAreaFilled(false);
		logout.setBorderPainted(false);
		logout.setForeground(Color.RED);
		logout.addActionListener(this);
		panel2.add(logout);
		
		
		
		
		//For welcome headline
		welBtn = new JButton();
		welBtn.setIcon(new ImageIcon("Image/welcome.jpg"));
		welBtn.setBounds(0, 0, 766, 70);
		welBtn.setContentAreaFilled(false);
		welBtn.setBorderPainted(false);
		welBtn.setBackground(Color.PINK);
		panel2.add(welBtn);
		
		//panel1 photo
		img = new ImageIcon("Image/foto.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		panel1.add(imgLabel);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==logout)
		{
			Login l1=new Login();
			l1.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==newBtn)
		{
			Newbook n1=new Newbook();
			n1.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==oldBtn)
		{
			Oldbook o1=new Oldbook();
			o1.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==stBtn)
		{
			Stationary s1=new Stationary();
			s1.setVisible(true);
			this.setVisible(false);
		}
		
		
		
	}
}