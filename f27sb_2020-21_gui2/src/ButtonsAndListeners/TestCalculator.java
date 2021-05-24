package ButtonsAndListeners;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestCalculator implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2;
	JTextField t1,t2,t3,t4;

	String text="";
	int result;

	Font ff;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCalculator t=new TestCalculator();
		t.g0();

	}


	public void g0() {// frame and panel
		frame=new JFrame();// ha,instance variable


		frame.setTitle("Calculator");


		frame.setSize(400, 300);


		frame.setLocation(500, 80);


		frame.setLayout(null);


		frame.setBackground(Color.white);


		//go,deal with buttons and labels
		g1();
		//go,deal with textfield
		g2();


		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	private void g1() {
		// TODO Auto-generated method stub

		button(b1=new JButton("CLR"));
		button(b2=new JButton("+"));
		button(b3=new JButton("-"));
		button(b4=new JButton("*"));
		button(b5=new JButton("/"));	
		
		l1=new JLabel(result+"");

		frame.getContentPane().add(l1);
		// unique chara set independently
		
		b1.setFont(new Font("CLR", Font.PLAIN, 10));
		b1.setSize(65, 40);
		l1.setSize(65, 40);
		//modify and change locations
		b1.setLocation(50, 155);//set positions of texts inside button
		b2.setLocation(120, 155);
		b3.setLocation(180, 155);
		b3.setVerticalAlignment(SwingConstants.BOTTOM);
		b4.setLocation(240, 155);
		b5.setLocation(300, 155);
		l1.setLocation(250, 30);
		l1.setHorizontalAlignment(SwingConstants.CENTER);

		//change color and paint
		b1.setBackground(Color.orange);b1.setOpaque(true);
		b2.setBackground(Color.cyan);b2.setOpaque(true);
		b3.setBackground(Color.pink);b3.setOpaque(true);
		b4.setBackground(Color.green);b4.setOpaque(true);
		l1.setBackground(Color.white);l1.setOpaque(true);
	}

	public void button(JButton B) {// model of buttons,label		
		B.setFont(new Font(B.getText(), Font.PLAIN, 20));
		B.addActionListener(this);
		frame.getContentPane().add(B);

		B.setSize(50, 40);

	}

	
	

	public void g2() {
		// TODO Auto-generated method stub
		t1=new JTextField();
		t1.requestFocusInWindow();

		frame.getContentPane().add(t1);
		t1.addActionListener(this);
		// create empty JTextField
		t1.setLocation(90, 85);
		t1.setSize(200, 40);


		t1.setBackground(Color.white);

		t1.requestFocusInWindow();
	}

	private void textfield(JTextField T) {
		// TODO Auto-generated method stub

	}

	//	@Override
	public void actionPerformed(ActionEvent e) {
		if (!e.getSource().equals(b1)) {// !=  "="
			JButton bb=(JButton)e.getSource();// e.getsource ==objet
			text=bb.getText();// 原有的数字加上符号
			// 实现 只有同个符号 存在 的运算，让 值发生变化
			
			switch (bb.getText()) {
			case "+":
				result+=Integer.parseInt(t1.getText());
				t1.setText("");
				System.out.println("result:"+result);
				
				break;
			case "-":
				result-=Integer.parseInt(t1.getText());
				break;
			case "*":
				result*=Integer.parseInt(t1.getText());
				break;
			case "/":
				result/=Integer.parseInt(t1.getText());
				break;
			default:
				break;
			}
			l1.setText(result+"");
		
			
			
		
		}
		else {
			System.out.println("CLR");
			
		}

	}
}
