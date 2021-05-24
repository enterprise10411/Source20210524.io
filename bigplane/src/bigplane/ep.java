package bigplane;

import java.awt.image.BufferedImage;
import java.util.Random;
//把具有相同特定的类抽离出来，，利用他们的共同点 打造一个父类

// produce modele enemy plane,,randomly generate them ,make them move,number increase as time grows
// build lots of enemy plane

public class ep extends flyobject {//人为地制造一个 父类
	BufferedImage img;
	int sp;
	int hp;
	int type;
	public ep() {
		super();
		Random rd=new Random();
		
		int index=rd.nextInt(2);
		img=app.getIma("/img/enemy"+index+".jpg");// pick random images
		type=index;
		
		
		y=rd.nextInt(10);;
		w=80;//==敌机图片的宽度
		h=80;//==敌机图片的高度
		x=rd.nextInt(510);//?
		hp=3;
		
		sp=30-index;	
		
		
	}
	
	

	public void epMove() {
		// TODO Auto-generated method stub
		y+=sp;
	}
//	
//	public boolean shootBy(fire f) {
//		// TODO Auto-generated method stub
//		boolean hit=x<=f.x+f.w&&x>=f.x-f.w  && y<=f.y+f.h  &&y>=f.y-f.h;
//		return hit;
//	}
//	
	
	
	
	public boolean  shootBy(fire f) {
		// TODO Auto-generated method stub
		boolean hit=x<=f.x+f.w  &&x>=f.x-w  && y<=f.y+f.h  ;// f.h.f.w,,w,,h
		return hit;
	}
	
	public boolean hitBy(hero f) {
		
		boolean hit=x<=f.x+f.w  &&x>=f.x-w  && y<=f.y+f.h  ;// f.h.f.w,,w,,h
		return hit;
		
	}
	
}
