package com.example.BankMangementSystem;
import com.example.*;
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.*;
public class SignupOne extends JFrame implements ActionListener{
	long random;
	JTextField names,fnames, emails,addresses,cityes,pins,states;
	JButton next;
	JDateChooser dateChooser ;
	JRadioButton male,female,others,married,unmarried;
	SignupOne(){
		
		setLayout(null);
		Random ran=new Random();
		long random=Math.abs((ran.nextLong()%9000L)+1000L);
		JLabel formno=new JLabel("Application form no."+random);
		formno.setFont(new Font ("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		JLabel personDetails=new JLabel("Page 1 : Personal Details");
		personDetails.setFont(new Font ("Raleway",Font.BOLD,22));
		personDetails.setBounds(290,80,500,30);
		add(personDetails);
		
		JLabel name=new JLabel("Name :");
		name.setFont(new Font ("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		add(name);
		
		 names=new JTextField();
		names.setFont(new Font("Raleway",Font.BOLD,14));
		names.setBounds(300,140,400,30);
		add(names);
		
		JLabel FName=new JLabel("Father`s Name :");
		FName.setFont(new Font ("Raleway",Font.BOLD,20));
		FName.setBounds(100,190,200,30);
		add(FName);
		
		fnames=new JTextField();
		fnames.setFont(new Font("Raleway",Font.BOLD,14));
		fnames.setBounds(300,190,400,30);
		add(fnames);
		JLabel dob=new JLabel("Date of Birth :");
		dob.setFont(new Font ("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		 dateChooser =new JDateChooser();
		dateChooser.setBounds(300,240,400,30);
		dateChooser.setForeground(new Color(105,105,105));
		add(dateChooser);
		JLabel gender=new JLabel("Gander :");
		gender.setFont(new Font ("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		male=new JRadioButton("MALE");
		male.setBounds(300,290,100,30);
		male.setBackground(Color.white);
		add(male);
		female=new JRadioButton("FEMALE");
		female.setBounds(450,290,100,30);
		female.setBackground(Color.white);
		add(female);
		
		ButtonGroup genderG=new ButtonGroup();
		genderG.add(male);
		genderG.add(female);
		JLabel email=new JLabel("Email Address :");
		email.setFont(new Font ("Raleway",Font.BOLD,20));
		email.setBounds(100,340,200,30);
		add(email);
		
		 emails=new JTextField();
		emails.setFont(new Font("Raleway",Font.BOLD,14));
		emails.setBounds(300,340,400,30);
		add(emails);
		
		JLabel merital=new JLabel("Marital Status :");
		merital.setFont(new Font ("Raleway",Font.BOLD,20));
		merital.setBounds(100,390,200,30);
		add(merital);

		married=new JRadioButton("MARRIED");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried=new JRadioButton("UNMARRIED");
		unmarried.setBounds(450,390,100,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		

		 others=new JRadioButton("OTHER");
		others.setBounds(630,390,100,30);
		others.setBackground(Color.white);
		add(others);
		
		ButtonGroup other=new ButtonGroup();
		other.add(married);
		other.add(unmarried);
		other.add(others);
		
		JLabel address=new JLabel("Address:");
		address.setFont(new Font ("Raleway",Font.BOLD,20));
		address.setBounds(100,440,200,30);
		add(address);
		
		 addresses=new JTextField();
		addresses.setFont(new Font("Raleway",Font.BOLD,14));
		addresses.setBounds(300,440,400,30);
		add(addresses);
		
		JLabel city=new JLabel("City:");
		city.setFont(new Font ("Raleway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
		 cityes=new JTextField();
		cityes.setFont(new Font("Raleway",Font.BOLD,14));
		cityes.setBounds(300,490,400,30);
		add(cityes);
		
		JLabel state=new JLabel("State Name:");
		state.setFont(new Font ("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		states=new JTextField();
		states.setFont(new Font("Raleway",Font.BOLD,14));
		states.setBounds(300,540,400,30);
		add(states);
		
		JLabel pin=new JLabel("Pin Number:");
		pin.setFont(new Font ("Raleway",Font.BOLD,20));
		pin.setBounds(100,590,200,30);
		add(pin);
		
		pins=new JTextField();
		pins.setFont(new Font("Raleway",Font.BOLD,14));
		pins.setBounds(300,590,400,30);
		add(pins);
		
		next =new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SignupOne();

	}
	public void actionPerformed(ActionEvent e) {
		String formno=""+random;//long
		String name=names.getText();
		String fname=fnames.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(male.isSelected()) {
			gender="Male";
		}else if(female.isSelected()) {
			gender="Female";
		}
		String email=emails.getText();
		String marital=null;
		if(married.isSelected()) {
			marital="Married";
		}else if(unmarried.isSelected()) {
			marital="Unmaried";
		}else if(others.isSelected()) {
			marital="Other";
		}
		String address=addresses.getText();
		String city=cityes.getText();
		String state =states.getText();
		String pin=pins.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null,"Name is Required" );
			}else {
				conn c=new conn();
				String query="insert into signup values('"+formno+"','"+name+"',"
				+ "'"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
			c.s.executeUpdate(query);
			}
		}catch(Exception e1) {
			System.out.println(e1);
		}
		
	}

}
