package bigplane;

import java.awt.image.BufferedImage;
import java.util.Random;
//�Ѿ�����ͬ�ض����������������������ǵĹ�ͬ�� ����һ������

// produce modele enemy plane,,randomly generate them ,make them move,number increase as time grows
// build lots of enemy plane

public class ep extends flyobject {//��Ϊ������һ�� ����
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
		w=80;//==�л�ͼƬ�Ŀ��
		h=80;//==�л�ͼƬ�ĸ߶�
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
