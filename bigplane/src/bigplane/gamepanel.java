package bigplane;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
public class gamepanel extends JPanel {
	
	BufferedImage bg;// �� ��ȡͼƬ�ķ�����װ��  ��һ�����ĳ����������
	// main operation page
	hero h1=new hero ();// now we have a heroplane object,this stuff is default to play
	ep e1=new ep();


	ArrayList<ep>eps=new ArrayList();//��ͣ���ɫ�ƶ�������
	ArrayList<fire>fss=new ArrayList();//��ͣ���ɫ�ƶ�������
	int findex=0;
	int scores,power=1;
	
	boolean gameover;
	
	public gamepanel(gameframe frame1t) {
		//		setBackground(Color.orange);
		// unable to put panel n jframe
		try {
			bg=app.getIma("/img/CP(6@~B5PP%W~Z7]]XEP~7X.jpg");
			//			bg2=app.getIma("/img/pri2.jpg");// adding is not enough,you need to paint i
			//			JLabel picLabel2 = new JLabel(new ImageIcon(h1.img),JLabel.NORTH);
			//			picLabel2.setOpaque(true);            
			//			add(picLabel2);
			//			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("panel ������");

			e.printStackTrace();
		}// ��ķ���



		//mouseadapter
		MouseAdapter g1=new MouseAdapter() {// with mouseadapter and specific tool mouseMoved,
			// move of mouse could be traced through changes of its locations
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseMoved(e);

				int mx= e.getX();//
				int my=e.getY();//


				//				hero.moveMouse();
				h1.movetoMouse(mx, my);

				repaint();

			}//mouseMoved
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(gameover) {
					hero hh=new hero();// set games button for reset
					gameover=false;
					scores=0;
					Random rd=new Random();
					int index=rd.nextInt(5)+1;
					bg=app.getIma("/img/enemy"+index+".jpg");
					
					repaint();
				}
			}

			// lambra expressions?  mouseMoved();,clicked,pressed,entered,,mouseExited
		};
		frame1t.addMouseListener(g1);
		frame1t.addMouseMotionListener(g1);





		KeyAdapter kd=new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				int keycode=e.getKeyCode();

				System.out.println("���̼�����������"+keycode);
				if (keycode==KeyEvent.VK_UP) {
					h1.moveUp();
					System.out.println();
				}
				else if (keycode==KeyEvent.VK_DOWN) {
					h1.moveDown();
				} 
				else if (keycode==KeyEvent.VK_LEFT) {
					h1.moveLeft();
				} 
				else if (keycode==KeyEvent.VK_RIGHT) {
					h1.moveRight();
				}


				repaint();
			}

		};//after construcotr

		frame1t.addKeyListener(kd);


		;}


	/*ʹ�ü�����������
	 * 1.����������������adapter��
	 * 2.ȷ�������ļ����¼�
	 * 3.����������ӵ���������



	 */

		
	
	
	
	
	
	
	
	
	
	

	public void action() {
		// create and initialize a thread that controls movements of objects in the gaming scenes
		new Thread(){// remember to add ;

			public void run() {
				// TODO Auto-generated method stub
				
				
				super.run();
				
				
				while (true) {
					/*	���߳̿���һ���ظ�ִ�еĳ���
					 * �л�����---�л��ƶ�--����---�ӵ��ƶ�--����Ϳɫ
						
					*/	
					if (!gameover) {
						repaint();
						epEnter();
						epMove();
						
						
						Shoot();
						fireMove();
						shootEp();
						hitBy();
						//wron stopsg,you have to execute this program after
					}
			
				
					/*	
�ӵ���û���ел��أ��л���û��

���� �ӵ���С��  ͼƬ�е��ӵ���С�� ���� ���ĵл���С��ͼ�еĵл���С��

�ƶ���� ����� 
	
							
							
					
						*/	
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}//while
			}//run

			private void hitBy() {
				// TODO Auto-generated method stub
				
			}

		}.start();;//thread}
	}// control the speed of adding enemy plane


	
	
	
	
	
	
	
	
	
	
	protected void epEnter() {
		// TODO Auto-generated method stub
		ep ee=new ep();// randomly create plane
		eps.add(ee);// add plane to military base
		
		
	}//epenter
	
	
	
	
	
	
	
	protected void epMove() {
		// TODO Auto-generated method stub
		for (int i = 0; i <eps.size(); i++) {
			ep e=eps.get(i);
			e.epMove();
			
		}
	}
	

		
	/*Ӣ�ۻ�����----�ӵ�����---�ӵ�ǰ��---�ӵ����ел�----�л����ӵ���ͬ����
	
	
	
	
	
	*/
	
	protected void Shoot() {
		// TODO Auto-generated method stub
		findex++;
		
		if(findex>=0) {
		fire fire=new fire(h1.x+10, h1.y+180);
		fire fire2=new fire(h1.x+25, h1.y+180);
		fire fire3=new fire(h1.x+40, h1.y+180);
		fss.add(fire);
		fss.add(fire2);
		fss.add(fire3);
		findex=0;
		
		}
	}
	
	
	
	protected  void fireMove() {
		// TODO Auto-generated method stub
		for (int i = 0; i < fss.size(); i++) {
			fire f=fss.get(i);
			f.move();
		
			
		}

	}
	
	

	
	
	
	
	
	protected void shootEp() {
		// TODO Auto-generated method stub
		for (int j = 0; j < fss.size(); j++) {
			fire f=fss.get(j);
			bang(f);
			
		}
		
		
		
	}
	
	
	protected void bang(fire f) {
		// TODO Auto-generated method stub
		for (int i = 0; i <eps.size(); i++) {
			ep e2=eps.get(i);

			if(e2.shootBy(f)) {//����
				e2.hp--;
				if (e2.hp<=0) {
					
					if (e2.type==1 &&power<3) {
						power++;
					}
					eps.remove(e2);
					fss.remove(f);
					scores+=1;
				}
			}

		}
	}

	
	protected void hit() {
		// TODO Auto-generated method stub
		for (int i = 0; i <eps.size(); i++) {
			ep e3=eps.get(i);
			
			if (e3.hitBy(h1)) {//lives value
				eps.remove(e3);
				h1.hp--;
				scores+=10;
			}
			
			if (h1.hp<=0) {
				gameover=true;
			}
			
		}

	}


	


	
	
	@override
	public void paint(Graphics g) {
		super.paint(g);


		//draw panel background
		g.drawImage(bg, 0, 0, 512, 668, null);//backgournd panel
		
		//draw hero plane
		g.drawImage(h1.img, h1.x, h1.y, 50, 66, null);//   0,0��ζ�ߺ�Ӣ�ۻ���λ��һ��, 50/2,66/2
		
		//draw enemy plane
		for (int i = 0; i < eps.size(); i++) {
			ep eg=eps.get(i);// enemy plane
			g.drawImage(eg.img, eg.x, eg.y, 80, 80,null);
		}
		
		
		// draw bullets
		for (int i2 = 0; i2 <fss.size(); i2++) {
			fire fs2=fss.get(i2);//bullet
			g.drawImage(fs2.img,fs2.x, fs2.y, 10, 40,null);//ͼƬ��ʼ������ Ӣ�ۻ���ʼ������ y��������
		}

		
		
		//draw scoreboard
		g.setColor(Color.magenta);
		g.setFont(new Font("����",Font.ITALIC,20));//type,,posture//layout and size
		g.drawString("scores: "+scores, 5, 15);
		
		
		//draw hp value
		for (int i = 0; i < h1.hp; i++) {
			g.drawImage(h1.img, 350+i*35, 5,30, 30, null);
		}
		
		
		
		if(gameover||scores>=50) {
			System.out.println("terminated");
			gameover=true;
		g.setColor(Color.cyan);
		g.setFont(new Font("����",Font.BOLD,35));
		g.drawString("gameover!!! rookie,ë�������ս���������������",20, 250);
		
		}
		
		


	}



}
