package algorithm;

public class countprime {
	int g,count,k,m,m2,b5=0;
	boolean[]iscomposite;
	
	// 2算法二：
	/*设 题目要我    求小于 所有自然数 n的 所有质数？
设mid==n-1/2，小于 mid的所有质数 为合格质数 qp，
对于其中任意 qpn，它的 合格乘数合数集中的所有 < qpn^2的数 都是   小于qpn的 所有质数的   合格乘数合数集 之和的集合的元素。
例子，Mid==25，   23*2 ,23*3的索引位置的 Boolean isprime[] 元素 已经在   2*23 与 3*23运算检验时被赋值。
	
	遍历从2 到 n^1/2的数，碰到质数 k，则以K为起点发动 动态搜索寻找，将  大于k^2 小于 n的，
	是k的整数倍的 数标记为 素数
	
	
	*/
	public int countPrimes(int num) {//prime==质数==素数，，相反的是合数,从2开始
	if(num<=2){
        return 0;

    }
	if(num==2){
		return 1;
		
	}
        
      m2=(int) Math.sqrt(num);
      iscomposite=new boolean[num];
		
        for (int i = 2; i <= m2; i+=2) {//utilize sets,
			if (ip2(i)) {//determine if this is a prime,建立合数集，统计合数个数 喷到了质数，对质数进行一番动态搜索
				g=i;k=i*g;// i是质数，则 i+1一定是偶数，合数
				while (k<num) {//1是合数，0不是合数
					if (iscomposite[k]==false ) {
						
						iscomposite[k]=true;
						count++;// 建议使用位运算予以化简，，运用某个过程进行存储
					}//如何检测某个变量 有没有存储过 某个值          
					     g++; k=i*g;     //问题还没定义好，，返回结果还么定义好，边优化代码边写代码是不对的,可以的。					g++;
				}//while
			}//if
			if(i==2)i--;
		}//for

		return num-2-count;
	}
	
	
	
	
	public boolean ip2(int ip) {// determine if this input is prime,4
		for (g=3; g <Math.sqrt(ip/2); g+=2) {// ++2,sqrt，判断一个数是不是质数，不用 除以2，供你选择的都是奇数
			
			if (0==ip%g) {
				return false;
			}//是质数，则没有是0 的；是合数则有是0的
			if(g==2)g--;
		}//for		
		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int prime(int num[]) {//prime==质数==素数，，相反的是合数,从2开始
		// TODO Auto-generated method stub// 全是素数
		
		for (int i = 0; i < num.length/2; i++) {

			if (ip1(num[i])) {//determine if this is a prime,建立合数集，统计合数个数 喷到了质数，对质数进行一番动态搜索
				while (num[i]*g<=num[num.length-1]) {//1是合数，0不是合数
					if (num[num[i]*g-2]!=1) {
						num[num[i]*g-2]=1;
						count++;
		        	}             
					//问题还没定义好，，返回结果还么定义好，边优化代码边写代码是不对的,可以的。

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
			}//是质数，则没有是0 的；是合数则有是0的
		}//for

		//		fc1(ip);
		return true;
	}
	
	
	//
	//算法三：任意一个素数的n倍（n>2）一定不是素数
		// TODO Auto-generated method stub
//		public int countPrimes(int n) {
//	        boolean[] notPrimes = new boolean[n];
//	        int count = 0;
//	        for (int i = 2; i < n; i++) {
//	            //如果是合数就不需要统计
//	            if (notPrimes[i])
//	                continue;
//	            count++;
//	            //到这一步说明不是素数，直接让他的2倍，3倍……都标记为非负数即可
//	            for (int j = i; j < n; j += i)
//	                notPrimes[j] = true;
//	        }
//	        return count;
//	    }
//		 private boolean isPrimes(int i) {
//    int sqrt = (int) Math.sqrt(i);
//    //一个素数永远都不可能被偶数整除，所以这里是j+=2
//    for (int j = 3; j <= sqrt; j += 2) {//  sqrt很关键
//        if (i % j == 0)
//            return false;
//    }
//    return true;
//}

//
//	}
//	
	


	
}
