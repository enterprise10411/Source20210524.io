package bigplane;


public class fire extends flyobject{

		int dir;//0,���Ͻǣ�1 ��ֱ����      2.���Ͻ�
	
	
	
		public fire(int hx,int hy) {
			// TODO Auto-generated constructor stub
		img=app.getIma("/img/fire00.png");
		
		w=10;
		h=40;
		x=hx;
		y=hy;
		
		
		}
		
		public void move() {
			// TODO Auto-generated method stub
			y-=200;
//			if (dir==0) {
//				x-=50;//б�ʶ������ˣ����� 00 34�
//				y-=50;
//			} else if(dir==1) {
//				y-=50;
//			}
//			
//			else {
//				x+=50;
//				y-=50;
//			}
//		
		
		}

}
