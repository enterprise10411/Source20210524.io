package algorithm;

import java.util.Stack;

public class reversestring {

	//
	/*
	 * �㷨һ�� �����ֵ����ұߵ����� ��Ӧ string ֵ������ֵΪn��ȷ���Գ��� m== 0+n/2----����0---m���������� ����Щ�� ��
	 * ����m�Գ� ��������λ�õ�������
	 * 
	 */
//	int y;
//	 char g;
//	String x1;
//	// reduce space complexity
//
//	public int reverse(int x) {
//		// reduce time: �����ظ����裬����ѭ������������ ÿһ��ѭ��������,����API���еķ������жϼ���
//	// �� ��ѭ�������� ���ŵ��������������ظ�ʹ��
//		
//		try {
//
//			
//			if (x > 0) {
//				x1 = x + "";// Сת�����̺��� ������ļ�����
//				
//				y=x1.length() - 1;
//				  
//					handle21();				
////				System.out.println("?");
//				y=Integer.valueOf(x1);
//			}
//
//			else {
//				x1 = -x + "";
//				
//				y=x1.length() - 1;
//			   
//				handle21();			
////				System.out.println("?");
//				y=-Integer.valueOf(x1);
//			}
//			
//		
//
//
//			System.out.println("retrun is y?");
//			return y;
//
//		}
//
//		catch (Exception e) {
////			System.out.println("error!");
//			return 0;
//			// TODO: handle exception
//		}
//
//	}
//	
//	
//	
//	// algorithm 2.1:
//	
//	private String handle21() {
//		char []t=x1.toCharArray();
//		char k='0';
//	
//		for (int i = 0; i <= y/2; i++) {//��ֻ���Ǹ�����
//			// +"",��һ��ɾһ��������g
//			 g=t[i];
//			t[i]=t[y-i];
//			t[y-i]=g;
////			System.out.println("replace finished?  i:"+t[i]+"  y-i::"+t[y-i]);
////			myString = new StringBuilder(x1);
////			    myString.setCharAt(i, x1.charAt(y-i));
////			    myString.setCharAt(y-i, g);
////			    x1=myString.toString();
////			 System.out.println("�ַ��������滻��û��ִ�а���");
//			 
//			if (t[i]!='0') {
////				encountern=true;
//				k='1';
//			}
//			    if (t[i]=='0'&&k=='0') {
//			    	t[i]=' ' ;
////			    	 System.out.println("�����ų�0��û��ִ�а���");
//				}
//		}
//		y=0;
//		x1=String.valueOf(t);
//		System.out.println(x1);
//		x1=x1.replace(" ", "");// essential steps
//		System.out.println(x1);
//
//		return x1;
//	}
//	
//	
//	
	
	
	
	
	// algorithm 2.0: int--string--characer--------sort,�Գ�Ԫ�ص���-----back to string--int 
	

//	public int reverse(int x) {
//		// reduce time: �����ظ����裬����ѭ������������ ÿһ��ѭ��������,����API���еķ������жϼ���
//		// �� ��ѭ�������� ���ŵ��������������ظ�ʹ��
//
//		try {
//
//
//			if (x > 0) {
//				x1 = x + "";// Сת�����̺��� ������ļ�����
//				y=x1.length() - 1;
//				handle1();			
//				y=Integer.parseInt(x1);
//			}
//
//			else {
//				x1 = -x + "";
//				y=x1.length() - 1;
//
//				handle1();		
//				y=-Integer.parseInt(x1);
//			}
//
//
//
//			//			g=Integer.parseInt(x2);
//			// for ѭ���� ��ӵ�ǰ
//			return (0 - Math.pow(2, 31) <= y&& y <= Math.pow(2, 31) - 1)
//					? y
//							: 0;
//
//		}
//
//		catch (Exception e) {
//			return 0;
//			// TODO: handle exception
//		}
//
//	}
//	private String handle1() {
//		for (int i = 0; i <= y/2; i++) {//��ֻ���Ǹ�����
//			char g= x1.charAt(i);// +"",��һ��ɾһ��������g
//
//			myString = new StringBuilder(x1);
//			myString.setCharAt(i, x1.charAt(y-i));
//			myString.setCharAt(y-i, g);
//			x1=myString.toString();
//			if (x1.charAt(y)=='0') {
//				x1.replaceFirst("0", "");
//			}
//		}
//		y=0;
//
//		return x1;
//	}

	
	//t using regex when you dont need to has potential for unintended side effects

		/*
		 * �㷨������ ������ ����������t1,t2,t3,t4,���� �� t1*10^max+t2*10^max-1��������
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 **/
		
	
	
	
	
	int n1=0,t1,sum=0;
//	 char g;
//	String x1;
	// reduce space complexity

	public int reverse(int x) {
		// reduce time: �����ظ����裬����ѭ������������ ÿһ��ѭ��������,����API���еķ������жϼ���
	// �� ��ѭ�������� ���ŵ��������������ظ�ʹ��
		if (x<=-Math.pow(2, 31)||x>=Math.pow(2, 31)-1) {
			return 0;
		}
		
		
		try {

			
			if (x > 0) {
//				x1 = x + "";// Сת�����̺��� ������ļ�����
//				
//				y=x1.length() - 1;
//				  
//					handle21();				
////				System.out.println("?");
//				y=Integer.valueOf(x1);
				t1=x;
				// encapsulation
				while (t1>0) {

					n1=t1%10;// n1��¼����
					System.out.println(" ���� 10*sum+10*n1:"+10*sum+10*n1);

					x=sum;
					sum=10*sum+10*n1;//�������,���������Ի���
					if (   !(x==(sum-10*n1)/10)  ) {
						return 0;
					}
					System.out.println(" sum:"+sum );
					t1=t1/10;// t1��¼���������³���
					System.out.println("t1: "+t1);// ��һ�γ���==0����û�� ��һ���

				}

				return sum/10;




			}

			else {

				t1=-x;

				// encapsulation
				while (t1>0) {

					n1=t1%10;// n1��¼����
					System.out.println(" ���� 10*sum+10*n1:"+10*sum+10*n1);

					x=sum;
					sum=10*sum+10*n1;//�������,���������Ի���
					if (   !(x==(sum-10*n1)/10)  ) {
						return 0;
					}
					System.out.println(" sum:"+sum );
					t1=t1/10;// t1��¼���������³���
					System.out.println("t1: "+t1);// ��һ�γ���==0����û�� ��һ���

				}

				return -sum/10;





				
				
			}
			
		


//			System.out.println("retrun is y?");
			

		}

		catch (Exception e) {
//			System.out.println("error!");
			return 0;
			// TODO: handle exception
		}

	}
	
	
	
	
	public static void main(String[] args) {
		reversestring rs = new reversestring();
		System.out.println("���ս������"+rs.reverse(153423));
//		System.out.println("���� replacefirst ����,����ǣ�"+"01".replaceFirst("0", ""));
//		System.out.println(964632430*10);// erroneous calculation
		
		// 1---49,2--50
		;
	}
	/*


public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            //������������ֱ�ӷ���0,ֱ����·����û�����ƴ������
            if ((newRes - t) / 10 != res)
                return 0;
            res = newRes;
            x = x / 10;
        }
        return res;
    }


	
	*/
	
}

	










	/*�㷨���������ʼ���Ǹ��������޴�������  
	 *  API���� ��int  ת��Ϊ string x1------���� x1�е�Ԫ�� ����ȡ��������x2��-----��X2ת��Ϊ int
	
	
	public int reverse(int x) {

		// reduce time: �����ظ����裬����ѭ������������ ÿһ��ѭ��������,���API���еķ���
		try {

			if (x > 0) {
				x1 = x + "";// Сת�����̺��� ������ļ�����
				for (int i = (x1.length() - 1); i >= 0; i--) {

					x2 += x1.charAt(i);// +"",��һ��ɾһ��������g
				}
//				x2+=x1.substring(x1.length()-1, 0);//�ܿ���������Ϳ�����

			}

			else {
				x1 = -x + "-";
				for (int i = x1.length() - 1; i >= 0; i--) {

					x2 += x1.charAt(i);// +""
				}

			}

//			g=Integer.parseInt(x2);

			// for ѭ���� ��ӵ�ǰ
			return (0 - Math.pow(2, 31) <= Integer.parseInt(x2) && Integer.parseInt(x2) <= Math.pow(2, 31) - 1)
					? Integer.parseInt(x2)
					: 0;

		}

		catch (Exception e) {
			return 0;
			// TODO: handle exception
		}

	}
	
	*/
