package bigplane;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.*;

/*
�Զ��崰��Ĳ���
1.дһ���࣬�̳�JFRAME                2.дһ�����췽������ʼ�����������
�����췽�������ã����±���ģ�ߣ���������
����Ϸ��̨��������Ϸ��壬������Ϸ�����淨��������ģ��



*/
public class gameframe extends JFrame {
		int g;

		public gameframe() throws Exception {
			super();
			setTitle("ȫ��ɻ���ս");// properties in constructor is inherent for all objects in this class
			
			//adjust size and width
			setSize(800,900);// static methods in JFrame
			
			//adjust locations stuffs
			setVisible(true);
			
			setLocationRelativeTo(null);
			
			setResizable(false);
			
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String[] args) throws Exception {
			
			gameframe gf1=new gameframe();
	//stack stores normal fields,, new�������� heap�������ȡ���ֵ�ԭ�򣺣������� heap���ҵ���
			// name in the stack
			gamepanel gp1=new gamepanel(gf1);
			hero h20=new hero ();
			
			// main method page,execution methods page
			gf1.add(gp1);
			
			gp1.action();
			
			gf1.setVisible(true);//���Ӱ�쵽�� �����ɫ��Ϊʲô��
			
			// forbid changes to size of gaming board
			
		}
}
