package LayoutManagers;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestProgress implements  ActionListener{// extends action listener?
// create object and adding==putting layout£¬ and locations,-----setting siz-e-
//	------painting ----visible close
	// setting!=chaning	
		
//		 JLabel b0;
			int i=0;
	 static ArrayList <JLabel>gg3=new ArrayList();
	     
	
	static JLabel b0=new JLabel("110%");
	static JLabel b1=new JLabel("100%");
	static JLabel b2=new JLabel("90%");
	static JLabel b3=new JLabel("80%");
	static JLabel b4=new JLabel("70%");
	static JLabel b5=new JLabel("60%");
	static JLabel b6=new JLabel("50%");
	static JLabel b7=new JLabel("40%");
	static JLabel b8=new JLabel("30%");
	static JLabel b9=new JLabel("20%");
	static JLabel b10=new JLabel("10%");
	static JLabel b11=new JLabel("progress metre:");
	
	
	static TestProgress t1=new TestProgress();


	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		//construct related objects
		
	    ArrayList <Object>gg=new ArrayList();
		JFrame pm1 = new JFrame("progress metre");
		JPanel pa1=new JPanel();//panel ==container,canvas
//		JLabel b0=new JLabel("0",JLabel.SOUTH);
		Button re=new Button("return");
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
//		panelA.setLayout(new BoxLayout(panelA, BoxLayout.Y_AXIS));
		panelB.setLayout(new BoxLayout(panelB, BoxLayout.Y_AXIS));
//		panelB.add(new JButton("return "));
		panelB.add(re);
		panelB.add(new JLabel("  "));
//		panelB.add(b0);gg3.add(b0);
		panelB.add(b1);gg3.add(b1);
		panelB.add(b2);gg3.add(b2);
		panelB.add(b3);gg3.add(b3);
		panelB.add(b4);gg3.add(b4);
		panelB.add(b5);gg3.add(b5);
		panelB.add(b6);gg3.add(b6);
		panelB.add(b7);gg3.add(b7);
		panelB.add(b8);gg3.add(b8);
		panelB.add(b9);gg3.add(b9);
		panelB.add(b10);gg3.add(b10);
		panelB.add(new JLabel("  "));
		panelB.add(b11);gg3.add(b11);
//		panelB.add(new JButton("button1"));
//		
//		panelB.add(new JButton("button 2"));
		panelA.add(panelB);
		
	
		
		// set layout and size
		re.addActionListener(t1);
		pm1.add(BorderLayout.EAST,panelA );
		pm1.add(BorderLayout.CENTER,pa1);
//		pa1.add(b0);
		
		pm1.setLayout(new FlowLayout());
		pa1.setLayout(null);// important
		
	     //adjusting size
		 pm1.setSize(400,400);
	     pa1.setPreferredSize(new Dimension(150, 100));//dimension manager
	     re.setSize(170, 170);
//	     re.setLocation(1000, 1000);
	
	     //paint color
	     pm1.setBackground(Color.white);
	     b0.setBackground(Color.red);b0.setOpaque(true);
	     b1.setBackground(Color.red);b1.setOpaque(true);
	     b2.setBackground(Color.red);b2.setOpaque(true);
	     b3.setBackground(Color.red);b3.setOpaque(true);
	     b4.setBackground(Color.red);b4.setOpaque(true);
	     b5.setBackground(Color.red);b5.setOpaque(true);
	     b6.setBackground(Color.red);b6.setOpaque(true);
	     b7.setBackground(Color.red);b7.setOpaque(true);
	     b8.setBackground(Color.red);b8.setOpaque(true);
	     b9.setBackground(Color.red);b9.setOpaque(true);
	     b10.setBackground(Color.red);b10.setOpaque(true);
	     b11.setBackground(Color.white);b11.setOpaque(true);
	     
	     pm1.setVisible(true);
	     pm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		 ArrayList <JPanel>gg2=new ArrayList();
//		 addition(gg2);
		// TODO change color

		try {
			gg3.get(i).setBackground(Color.green);i++;
			b11.setText(gg3.get(i).getText());
		} catch (Exception e2) {// turned label's text == b11's text
			System.out.println(" reaches zero");
			b11.setText("0%");
			// TODO: handle exception
		}
	
	}


//	public void addition(ArrayList<JPanel> gg2) {
//		// TODO Auto-generated method stub
//		gg2.add(gg2);//add an object with above addition
//	}

}
