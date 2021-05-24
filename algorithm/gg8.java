package algorithm;

import java.awt.*;

import javax.swing.*;

public class gg8 {
	
	public static void main(String[] args) {
			
			  //constructions of objects
		      JFrame frame = new JFrame("Demo Frame");
		      JPanel panel = new JPanel();
		      JLabel label = new JLabel("Demo Label!");
		     
		      panel.setLayout(null);
		      frame.setLayout(null);
		      
		      
		      // additions
		   
		      frame.getContentPane().add(label);
//		      frame.add(panel);
//		      panel.add(label);
		      
		      //adjust sizes and change locations
		      Dimension size = label.getPreferredSize();
		      label.setBounds(150, 100, size.width, size.height);
		      frame.setSize(500, 300);
		      
		      
		      

//		      panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		      frame.setVisible(true);
		  
	}
	

}
