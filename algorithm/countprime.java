package algorithm;

public class countprime {
	int g,count,k,m,m2,b5=0;
	boolean[]iscomposite;
	
	// 2�㷨����
	/*�� ��ĿҪ��    ��С�� ������Ȼ�� n�� ����������
��mid==n-1/2��С�� mid���������� Ϊ�ϸ����� qp��
������������ qpn������ �ϸ�����������е����� < qpn^2���� ����   С��qpn�� ����������   �ϸ���������� ֮�͵ļ��ϵ�Ԫ�ء�
���ӣ�Mid==25��   23*2 ,23*3������λ�õ� Boolean isprime[] Ԫ�� �Ѿ���   2*23 �� 3*23�������ʱ����ֵ��
	
	������2 �� n^1/2�������������� k������KΪ��㷢�� ��̬����Ѱ�ң���  ����k^2 С�� n�ģ�
	��k���������� �����Ϊ ����
	
	
	*/
	public int countPrimes(int num) {//prime==����==���������෴���Ǻ���,��2��ʼ
	if(num<=2){
        return 0;

    }
	if(num==2){
		return 1;
		
	}
        
      m2=(int) Math.sqrt(num);
      iscomposite=new boolean[num];
		
        for (int i = 2; i <= m2; i+=2) {//utilize sets,
			if (ip2(i)) {//determine if this is a prime,������������ͳ�ƺ������� �絽������������������һ����̬����
				g=i;k=i*g;// i���������� i+1һ����ż��������
				while (k<num) {//1�Ǻ�����0���Ǻ���
					if (iscomposite[k]==false ) {
						
						iscomposite[k]=true;
						count++;// ����ʹ��λ�������Ի��򣬣�����ĳ�����̽��д洢
					}//��μ��ĳ������ ��û�д洢�� ĳ��ֵ          
					     g++; k=i*g;     //���⻹û����ã������ؽ����ô����ã����Ż������д�����ǲ��Ե�,���Եġ�					g++;
				}//while
			}//if
			if(i==2)i--;
		}//for

		return num-2-count;
	}
	
	
	
	
	public boolean ip2(int ip) {// determine if this input is prime,4
		for (g=3; g <Math.sqrt(ip/2); g+=2) {// ++2,sqrt���ж�һ�����ǲ������������� ����2������ѡ��Ķ�������
			
			if (0==ip%g) {
				return false;
			}//����������û����0 �ģ��Ǻ���������0��
			if(g==2)g--;
		}//for		
		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int prime(int num[]) {//prime==����==���������෴���Ǻ���,��2��ʼ
		// TODO Auto-generated method stub// ȫ������
		
		for (int i = 0; i < num.length/2; i++) {

			if (ip1(num[i])) {//determine if this is a prime,������������ͳ�ƺ������� �絽������������������һ����̬����
				while (num[i]*g<=num[num.length-1]) {//1�Ǻ�����0���Ǻ���
					if (num[num[i]*g-2]!=1) {
						num[num[i]*g-2]=1;
						count++;
		        	}             
					//���⻹û����ã������ؽ����ô����ã����Ż������д�����ǲ��Ե�,���Եġ�

				  }

			}//if

		}//for
		
		return num.length-2;
	}

	
	
	
	public boolean ip1(int ip) {// determine if this input is prime,4
		// TODO Auto-generated method stub
		for (g=2; g <=ip/2; g++) {

			if (0==ip%g) {
				return false;
			}//����������û����0 �ģ��Ǻ���������0��
		}//for

		//		fc1(ip);
		return true;
	}
	
	
	//
	//�㷨��������һ��������n����n>2��һ����������
		// TODO Auto-generated method stub
//		public int countPrimes(int n) {
//	        boolean[] notPrimes = new boolean[n];
//	        int count = 0;
//	        for (int i = 2; i < n; i++) {
//	            //����Ǻ����Ͳ���Ҫͳ��
//	            if (notPrimes[i])
//	                continue;
//	            count++;
//	            //����һ��˵������������ֱ��������2����3�����������Ϊ�Ǹ�������
//	            for (int j = i; j < n; j += i)
//	                notPrimes[j] = true;
//	        }
//	        return count;
//	    }
//		 private boolean isPrimes(int i) {
//    int sqrt = (int) Math.sqrt(i);
//    //һ��������Զ�������ܱ�ż������������������j+=2
//    for (int j = 3; j <= sqrt; j += 2) {//  sqrt�ܹؼ�
//        if (i % j == 0)
//            return false;
//    }
//    return true;
//}

//
//	}
//	
	


	
}
