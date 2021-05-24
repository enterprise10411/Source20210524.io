package ButtonsAndListeners;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;


public class TestFontSize implements ActionListener{
	/*
	Jframe copy,Jpanel,setsize	
		
		adjust sizes
		set color and paint
		
		set basic parameter
		
		add button,mouseactionlistener, and variable changes with each click
		
		methods to use:setfont,settext,drawstring
		*/
	JFrame frame;
	JPanel panel;
	JButton b1,b2;
	JLabel l1,l2;
	Font ff;
	int size=18;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFontSize t=new TestFontSize();
		t.f0();
		
		
	}


	public void f0() {// frame and panel
		frame=new JFrame();// ha,instance variable



		frame.setTitle("Font size");


		frame.setSize(400, 400);

		
		
		frame.setLocation(500, 80);
		

		frame.setLayout(null);


		frame.setBackground(Color.white);

		f1();

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	
	public void f1() {// labels and buttons



		b1=new JButton("increase");//"increase"
		b2=new JButton("decrease");//"decrease"

		b1.addActionListener(this);
		b2.addActionListener(this);
		 frame.getContentPane();


		 //adjust size and locations
		b1.setSize(100, 40);
		b2.setSize(100, 40);

		b1.setLocation(45, 155);
		b2.setLocation(180, 155);



		b1.setBackground(Color.cyan);b1.setOpaque(true);
		b2.setBackground(Color.green);b2.setOpaque(true);


		ff=new Font("X", Font.PLAIN, size);
		l1=new JLabel(ff.getName(),JLabel.CENTER);
		l2 = new JLabel(size+"", JLabel.CENTER);


	
		
		 l1.setPreferredSize(new Dimension(50, 70));
		 l2.setPreferredSize(new Dimension(50, 70));
		 
	   
		 l1.setBounds(140, 50, 50, 90);;// label get to set this vertical allignment with flowout manager
		 l2.setBounds(190, 50, 50, 90);

		l1.setBackground(Color.orange);l1.setOpaque(true);
		l2.setBackground(Color.cyan);l2.setOpaque(true);
		
		
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(l1);
		frame.getContentPane().add(l2);
		
	}

	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {


		if (e.getSource().equals(b1)) {
			l1.setFont(new Font("X", Font.ITALIC, ++size));
			l2.setText(size+"");
		}// change size,set size or repaint

		if (e.getSource().equals(b2)&&size>=1) {			
			l1.setFont(new Font("X", Font.ITALIC, --size));
			l2.setText(size+"");
			System.out.println(size);
		}

	}

	
}
