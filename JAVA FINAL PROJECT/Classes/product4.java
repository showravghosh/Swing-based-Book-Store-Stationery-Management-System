package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class product4 extends JFrame implements ActionListener
{
	private ImageIcon img;
	private JLabel headingLabel, takaLabel,proinfoLabel,proinfo2Label,quanLabel,
	        ratLabel,booktypeLabel,imgLabel;
	private JButton proimgBtn, buyBtn,logout,backbtn;
	private JComboBox combo;
	private JPanel panel;
	private Color myColor;
	private Font myFont;
    
	public product4()
	{
		super("product4");
		this.setSize(1366,768);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		myFont = new Font("Cambria", Font.PLAIN, 28);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		headingLabel = new JLabel("Man's Search for Meaning");
		headingLabel.setBounds(600, 190, 1400, 40);
		headingLabel.setFont(myFont);
		panel.add(headingLabel);
		
		
		takaLabel = new JLabel("BDT 350TK ");
		takaLabel.setBounds(610, 380, 270, 40);
		takaLabel.setFont(myFont);
		panel.add(takaLabel);
		
		proinfoLabel = new JLabel(" by Viktor Frankl");
		proinfoLabel.setBounds(610, 230, 290, 40);
		panel.add(proinfoLabel);
		
		proinfo2Label = new JLabel("Originally published in 1946");
		proinfo2Label.setBounds(610, 270, 240, 40);
		panel.add(proinfo2Label);
		
		quanLabel = new JLabel("Quantity");
		quanLabel.setBounds(610, 330, 240, 40);
		panel.add(quanLabel);
		
		ratLabel = new JLabel("5.00 rating");
		ratLabel.setBounds(610, 420, 240, 40);
		panel.add(ratLabel);
		
		booktypeLabel = new JLabel("English Philosophical Book");
		booktypeLabel.setBounds(185, 80, 500, 60);
		booktypeLabel.setFont(new Font("Serif", Font.BOLD, 30));
		panel.add(booktypeLabel);
		
		
		proimgBtn = new JButton();
		proimgBtn.setIcon(new ImageIcon("Image/Man.jpg"));
		proimgBtn.setBounds(100, 180, 450, 400);
		proimgBtn.setBackground(Color.GREEN);
		panel.add(proimgBtn);
		
		
		buyBtn = new JButton("Buy Now");
		buyBtn.setBounds(610, 490, 250, 60);
		buyBtn.setFont(new Font("Serif", Font.BOLD, 30));
		buyBtn.addActionListener(this);
		panel.add(buyBtn);
		
		backbtn=new JButton();
		backbtn.setBounds(10,10,50,40);
		backbtn.setContentAreaFilled(false);
		backbtn.setBorderPainted(false);
		backbtn.setIcon(new ImageIcon("Image/return.png"));
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		logout=new JButton("Log Out");
		logout.setBounds(1250,10,100,30);
		logout.setContentAreaFilled(false);
		logout.setBorderPainted(false);
		logout.setForeground(Color.RED);
		logout.addActionListener(this);
		panel.add(logout);
		
		
		String items[] = {"1", "2", "3", "4", "5"};
		combo = new JComboBox(items);
		combo.setBounds(690, 340, 60, 20);
		panel.add(combo);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==backbtn)
		{
			Newbook n1=new Newbook();
			n1.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==logout)
		{
			Login l1=new Login();
			l1.setVisible(true);
			this.setVisible(false);
		}
		
		if(ae.getSource()==buyBtn)
		{
			Payment p1=new Payment();
			p1.setVisible(true);
			this.setVisible(false);
		}
	}
	
}