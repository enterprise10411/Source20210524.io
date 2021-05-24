package bigplane;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.*;

/*
自定义窗体的步骤
1.写一个类，继承JFRAME                2.写一个构造方法，初始化窗体的属性
，构造方法的作用：做月饼的模具，给对象定型
做游戏窗台，，做游戏面板，，做游戏内容玩法，，人物模型



*/
public class gameframe extends JFrame {
		int g;

		public gameframe() throws Exception {
			super();
			setTitle("全面飞机大战");// properties in constructor is inherent for all objects in this class
			
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
	//stack stores normal fields,, new出来的在 heap里，给对象取名字的原因：：方便在 heap里找到他
			// name in the stack
			gamepanel gp1=new gamepanel(gf1);
			hero h20=new hero ();
			
			// main method page,execution methods page
			gf1.add(gp1);
			
			gp1.action();
			
			gf1.setVisible(true);//这个影响到了 面板颜色，为什么？
			
			// forbid changes to size of gaming board
			
		}
}
