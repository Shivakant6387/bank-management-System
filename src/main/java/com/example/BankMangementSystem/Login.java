package com.example.BankMangementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class Login extends JFrame implements ActionListener{
	JButton login,signup,clear;
	JTextField cardText;
	JPasswordField pinText; 
	Login(){
		setTitle("AUMATED TELLER MACHINE");
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel labal=new JLabel(i3);
		labal.setBounds(70,10,100,100);
		add(labal);
		JLabel text=new JLabel("Welcome to ATM");
		text.setFont(new Font("osward",Font.BOLD,38));
		text.setBounds(200,40,400,40);
		add(text);
		
		JLabel cardno=new JLabel("CARDNO:");
		cardno.setFont(new Font("Raleway",Font.BOLD,28));
		cardno.setBounds(120,150,150,30);
		add(cardno);
		cardText=new JTextField();
		cardText.setBounds(300,150,250,30);
		cardText.setFont(new Font ("Arial",Font.BOLD,14));
		add(cardText);
		JLabel pin=new JLabel("PIN NO:");
		pin.setFont(new Font("Raleway",Font.BOLD,28));
		pin.setBounds(120,220,250,30);
		add(pin);
		pinText=new JPasswordField();
		pinText.setBounds(300,220,250,30);
		pinText.setFont(new Font ("Arial",Font.BOLD,14));
		add(pinText);
		login=new JButton("SIGN IN");
		login.setBounds(300,300,100,30);
		login.setBackground(Color.black);
		login.setForeground(Color.white);
		login.addActionListener((ActionListener) this);
		add(login);
		clear=new JButton("CLEAR");
		clear.setBounds(430,300,100,30);
		clear.setBackground(Color.black);
		clear.setForeground(Color.white);
		clear.addActionListener((ActionListener) this);
		add(clear);
		 signup=new JButton("SIGN Up");
		signup.setBounds(300,350,230,30);
		signup.setBackground(Color.black);
		signup.setForeground(Color.white);
		signup.addActionListener((ActionListener) this);
		add(signup);
		getContentPane().setBackground(Color.WHITE);
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==clear) {
			cardText.setText("");
			pinText.setText("");
		}else if(ae.getSource()== login) {
			
		}else if(ae.getSource()==signup) {
			
		}
	}
    public static void main( String[] args )
    {
        new Login();
    }
	
}
