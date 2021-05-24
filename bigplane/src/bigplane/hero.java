package bigplane;

import java.awt.image.BufferedImage;

public class hero extends flyobject {
	BufferedImage img;
	int x,y,w,h;
	
	public hero()  {
		// TODO Auto-generated constructor stub
		try {
			img=app.getIma("/img/pri2.jpg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 找到 阿宝，，王天维，方与阳的模具
		
		//hero is added to the panel as a BufferedImage object
		
		//determine original locations  x,,y,hero plane
		x=200;
		y=500;


		w=img.getWidth();
		h=img.getHeight();

	}


	public void movetoMouse(int mx,int my) {// let heroplane moves with
		// TODO Auto-generated method stub
		
		//plane moves as mouse moves
		x=mx-25;
		y=my-33;


	}
	
		public void moveDown() {
			// TODO Auto-generated method stub

		}
		public void moveLeft() {
			// TODO Auto-generated method stub
			
		}
		public void moveRight() {
			// TODO Auto-generated method stub
			
		}
		public void moveUp() {
			// TODO Auto-generated method stub
			
		}
	
	
	
}
