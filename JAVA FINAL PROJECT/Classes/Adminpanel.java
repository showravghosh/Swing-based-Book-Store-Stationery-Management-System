package Classes;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import Interfaces.*;

public class Adminpanel extends JFrame implements ActionListener 
{
    private JLabel namel, phonl, sall,titel,titel2,admintitle,img,img2,adminN,adminP;
    private JTextField namet, phont, salt,adminNT;
	private JPasswordField adminPT;
    private JButton add,add2,delete,update,backbtn,logout;
    private JPanel panel;
    private JTable table;
    private JScrollPane pane;
	private Font font,myfont;
	private ImageIcon icon;
    private JTableHeader header;
	private JCheckBox box;
	
	
    public Adminpanel() 
	{
        super("Table");
        this.setSize(1366,768);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
		
		
		font = new Font("Cambria", Font.PLAIN, 18);
		myfont = new Font("Cambria", Font.PLAIN, 24);

        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
		
		titel=new JLabel("Employ Information");
		titel.setBounds(210,108,300,60);
		titel.setFont(myfont);
		panel.add(titel);
		
		titel2=new JLabel("Add Employ");
		titel2.setBounds(850,100,300,60);
		titel2.setFont(myfont);
		panel.add(titel2);

        namel = new JLabel("Name");
        namel.setBounds(740,160,150,30);
		namel.setFont(font);
        panel.add(namel);

        phonl = new JLabel("Phone no");
        phonl.setBounds(740, 230, 150, 30);
		phonl.setFont(font);
        panel.add(phonl);

        sall = new JLabel("Salary");
        sall.setBounds(740,300,150,30);
		sall.setFont(font);
        panel.add(sall);
		
		admintitle = new JLabel("Add New Admin");
		admintitle.setBounds(850,460,300,35);
		admintitle.setFont(myfont);
		panel.add(admintitle);
		
		sall = new JLabel("Admin Name");
        sall.setBounds(740,500,150,30);
		sall.setFont(font);
        panel.add(sall);
		
		sall = new JLabel("password");
        sall.setBounds(740,570,150,30);
		sall.setFont(font);
        panel.add(sall);

        namet = new JTextField();
        namet.setBounds(740,190,150,30);
        panel.add(namet);

        phont = new JTextField();
        phont.setBounds(740,260,150,30);
        panel.add(phont);

       
		salt = new JTextField();
        salt.setBounds(740,330,150,30);
        panel.add(salt);
		
		adminNT = new JTextField();
        adminNT.setBounds(740,530,150,30);
        panel.add(adminNT);
		
		adminPT = new JPasswordField();
        adminPT.setBounds(740,600,150,30);
        panel.add(adminPT);
		
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
    
        add = new JButton("Add");
        add.setBounds(900,224,120,35);
		add.setBackground(Color.LIGHT_GRAY);
        add.addActionListener(this);
        panel.add(add);

        delete = new JButton("Delete");
        delete.setBounds(900,290,120,35);
		delete.setBackground(Color.LIGHT_GRAY);
        delete.addActionListener(this);
        panel.add(delete);
		
		update=new JButton("Update");
		update.setBounds(1025,250,115,35);
		update.setBackground(Color.LIGHT_GRAY);
		update.addActionListener(this);
        panel.add(update);
		
		add2 = new JButton("Add");
        add2.setBounds(900,560,120,35);
		add2.setBackground(Color.LIGHT_GRAY);
        add2.addActionListener(this);
        panel.add(add2);
		
		//checkbox
		box=new JCheckBox();
		box.setBounds(890,605,20,20);
		box.addActionListener(this);
		panel.add(box);
		
		
		

        String[][] row = {{"Sojib", "01711", "250000"},
                {"Rohim", "01859", "300000"},
                {"Korim", "01559", "350000"}};

        String[] column = {"Employ Name", "Phone", "Salary"};

        table = new JTable(new DefaultTableModel(row, column));
        table.setBounds(210,160,500,496);
        panel.add(table);
		
		table.setRowHeight(30);
		
		header=table.getTableHeader();
		header.setFont(font);
		header.setBackground(new Color(192,192,192));

        pane = new JScrollPane(table);
        pane.setBounds(210,160,500,496);
        panel.add(pane);
		
		icon=new ImageIcon("Image/Editedpic.jpg");
		img2=new JLabel(icon);
		img2.setBounds(0,0,1370,770);
		panel.add(img2);
		
    }

    public void actionPerformed(ActionEvent ae) 
	{
		
		if(ae.getSource()==box)
		{
		    if(box.isSelected())
			{
				adminPT.setEchoChar((char)0);
			}
			else
			{
				adminPT.setEchoChar('*');
			}
		}
		
		if(ae.getSource()==logout)
		{
			AdminLogin a1=new AdminLogin();
			a1.setVisible(true);
			this.setVisible(false);
		}
		
		if (ae.getSource() == backbtn)
		{
			Login l1=new Login();
			l1.setVisible(true);
			this.setVisible(false);
		}
		
        if (ae.getSource() == add) 
		{
           if (namet.getText().isEmpty() || phont.getText().isEmpty() || salt.getText().isEmpty()) 
		   {
               JOptionPane.showMessageDialog(null, "Fill Up All Fields");
           }
		else 
		{
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String[] rowData = {namet.getText(), phont.getText(), salt.getText()};
            model.addRow(rowData);

            namet.setText("");
            phont.setText("");
            salt.setText("");
        }
        }
		
		else if (ae.getSource() == delete) 
		{
            int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) 
		{
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(selectedRow);
        }
		else 
		{
            JOptionPane.showMessageDialog(null, "Select a row to delete");
        }
        }
		
		else if (ae.getSource() == update) 
		{
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) 
		{
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setValueAt(namet.getText(), selectedRow, 0);
        model.setValueAt(phont.getText(), selectedRow, 1);
        model.setValueAt(salt.getText(), selectedRow, 2);

        namet.setText("");
        phont.setText("");
        salt.setText("");
    } 
	else 
	{
        JOptionPane.showMessageDialog(null, "Select a row to update");
    }
}

		
		if(ae.getSource()==add2)
		{
			String name=adminNT.getText();
			String pass=adminPT.getText();
			
           if (adminNT.getText().isEmpty() || adminPT.getText().isEmpty()) 
		   {
		   JOptionPane.showMessageDialog(null,"Fill Up All Fields");
		   }
		   else 
		{
			AdminAccount acc=new AdminAccount(name,pass);
				acc.addaccount();
				
            JOptionPane.showMessageDialog(null,"Successfully Registed!");
			
			
				adminNT.setText("");
				adminPT.setText("");
			
			AdminLogin a1=new AdminLogin();
			a1.setVisible(true);
			this.setVisible(false);
        }
        
		}
    }

   
    
}
