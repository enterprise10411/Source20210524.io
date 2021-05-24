package LayoutManagers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/*Calendar get current time,time,transient。。function that updatesit
 * automatic eventhandler。how to get current time
	
*/
public class TestClock {
	
	
	JFrame clock1 = new JFrame("JFrame ");
	
	static Timer t = new Timer(0, null);
	
	public static void main(String[] args) {
		
		  // TODO Auto-generated method stub JFrame clock1=new JFrame(); JPanel p1=new
		
	                 // NON STATIC
		t.setDelay(1000);
		t.start();
		
	}
	
		
	
		
			
			
			
			@Override
			public void k() {
				// TODO Auto-generated method stub
				//define a paintComponents
				JPanel p1=new JPanel();
				
			Calendar now = Calendar.getInstance();
			 SimpleDateFormat formatter = new SimpleDateFormat("y---M---d hhh:mmm:sss");
			System.out.println("1:  "+formatter.format(now.getTime()));
			// get times and put them on the panel 
			 Integer hour=now.get(Calendar.HOUR);
			 Integer minute=now.get(Calendar.MINUTE);
			 Integer second=now.get(Calendar.SECOND);
			 String ampm=(now.get(Calendar.AM_PM)==now.get(Calendar.PM))? "AM":"PM";
		
			 
			 JLabel l1=new JLabel("hour : "+hour.toString(), JLabel.LEFT);
			 l1.setBounds(70, 45, 60, 50);
			 JLabel l2=new JLabel("minute :"+minute.toString(), JLabel.LEFT);
			 l2.setBounds(135, 45, 90, 50);// x,y,horizontal size,vertical size
			 JLabel l3=new JLabel("second :"+second.toString(), JLabel.LEFT);
			 l3.setBounds(230, 45, 75, 50);
			 
			 JLabel l4=new JLabel("AM/PM :"+ampm.toString(), JLabel.LEFT);
			 l4.setBounds(145, 150, 75, 30);
			 clock1.setLocation(400, 100);
			 
			 
			 
			 
			 // adjust size and layout
			 p1.setLayout(null);// important
		     clock1.setSize(400,300);p1.setSize(10,10); 
		     clock1.setLayout(new FlowLayout());;// set layout necessary
		     p1.setPreferredSize(new Dimension(350, 200));
//		     l1.setFont(new Font("Monospaced",Font.BOLD,200));
			 
			 // adding
			 p1.add(l1);//2 arrangements,permutations of code.1.same function together 2.same object together 
		     p1.add(l1);
		     p1.add(l2);//添加的顺序 才决定左右
		     p1.add(l3);//添加的顺序 才决定左右
		     p1.add(l4);//添加的顺序 才决定左右
//		     p1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		     clock1.add(BorderLayout.CENTER,p1);
		 
		
//		     p1.setSize(350, 100);useless?
		     
		     
		     //paint color
		     Color whi=new Color(255,255,255);
		     Color gre=new Color(10,170,100);
		     Color ora=new Color(220,110,0);// 255,255,255white
		     clock1.setBackground(whi);
		     p1.setBackground(gre);
		     l1.setBackground(ora);l1.setOpaque(true);// prevent it from being covered
		     l2.setBackground(ora);l2.setOpaque(true);
		     l3.setBackground(ora);l3.setOpaque(true);
		     l4.setBackground(Color.CYAN);l4.setOpaque(true);
	     // .container contains multiple nodes,
			
			// make it visible
			clock1.setVisible(true); 
			clock1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			try { Thread.sleep(1000); } catch(Exception e2){}
			;;
			}
		//A;CTIVELISTENRER
		
				//some ways to get time
				
	
}