package algorithm;

import java.util.Stack;

public class reversestring {

	//
	/*
	 * 算法一： 设数字的最右边的数的 对应 string 值的索引值为n，确定对称数 m== 0+n/2----遍历0---m的所有数， 将这些数 与
	 * 关于m对称 的索引数位置的数调换
	 * 
	 */
//	int y;
//	 char g;
//	String x1;
//	// reduce space complexity
//
//	public int reverse(int x) {
//		// reduce time: 减少重复步骤，减少循环数量，增加 每一次循环做的事,减少API库中的方法，判断减少
//	// 能 边循环边做的 不放到后面做，变量重复使用
//		
//		try {
//
//			
//			if (x > 0) {
//				x1 = x + "";// 小转型中蕴含了 超级大的计算量
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
//		for (int i = 0; i <= y/2; i++) {//他只能是个整数
//			// +"",加一个删一个，不用g
//			 g=t[i];
//			t[i]=t[y-i];
//			t[y-i]=g;
////			System.out.println("replace finished?  i:"+t[i]+"  y-i::"+t[y-i]);
////			myString = new StringBuilder(x1);
////			    myString.setCharAt(i, x1.charAt(y-i));
////			    myString.setCharAt(y-i, g);
////			    x1=myString.toString();
////			 System.out.println("字符串数组替换有没有执行啊？");
//			 
//			if (t[i]!='0') {
////				encountern=true;
//				k='1';
//			}
//			    if (t[i]=='0'&&k=='0') {
//			    	t[i]=' ' ;
////			    	 System.out.println("检验排除0有没有执行啊？");
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
	
	
	
	
	// algorithm 2.0: int--string--characer--------sort,对称元素调换-----back to string--int 
	

//	public int reverse(int x) {
//		// reduce time: 减少重复步骤，减少循环数量，增加 每一次循环做的事,减少API库中的方法，判断减少
//		// 能 边循环边做的 不放到后面做，变量重复使用
//
//		try {
//
//
//			if (x > 0) {
//				x1 = x + "";// 小转型中蕴含了 超级大的计算量
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
//			// for 循环从 后加到前
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
//		for (int i = 0; i <= y/2; i++) {//他只能是个整数
//			char g= x1.charAt(i);// +"",加一个删一个，不用g
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
		 * 算法二：用 除数法 依次求余数t1,t2,t3,t4,…… 求 t1*10^max+t2*10^max-1…………
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
		// reduce time: 减少重复步骤，减少循环数量，增加 每一次循环做的事,减少API库中的方法，判断减少
	// 能 边循环边做的 不放到后面做，变量重复使用
		if (x<=-Math.pow(2, 31)||x>=Math.pow(2, 31)-1) {
			return 0;
		}
		
		
		try {

			
			if (x > 0) {
//				x1 = x + "";// 小转型中蕴含了 超级大的计算量
//				
//				y=x1.length() - 1;
//				  
//					handle21();				
////				System.out.println("?");
//				y=Integer.valueOf(x1);
				t1=x;
				// encapsulation
				while (t1>0) {

					n1=t1%10;// n1记录余数
					System.out.println(" 试验 10*sum+10*n1:"+10*sum+10*n1);

					x=sum;
					sum=10*sum+10*n1;//不断求和,这两步可以化简
					if (   !(x==(sum-10*n1)/10)  ) {
						return 0;
					}
					System.out.println(" sum:"+sum );
					t1=t1/10;// t1记录除数，更新除数
					System.out.println("t1: "+t1);// 这一次除数==0，就没有 下一轮喽

				}

				return sum/10;




			}

			else {

				t1=-x;

				// encapsulation
				while (t1>0) {

					n1=t1%10;// n1记录余数
					System.out.println(" 试验 10*sum+10*n1:"+10*sum+10*n1);

					x=sum;
					sum=10*sum+10*n1;//不断求和,这两步可以化简
					if (   !(x==(sum-10*n1)/10)  ) {
						return 0;
					}
					System.out.println(" sum:"+sum );
					t1=t1/10;// t1记录除数，更新除数
					System.out.println("t1: "+t1);// 这一次除数==0，就没有 下一轮喽

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
		System.out.println("最终结果：："+rs.reverse(153423));
//		System.out.println("检验 replacefirst 方法,结果是："+"01".replaceFirst("0", ""));
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
            //如果数字溢出，直接返回0,直接跑路，并没有妥善处理溢出
            if ((newRes - t) / 10 != res)
                return 0;
            res = newRes;
            x = x / 10;
        }
        return res;
    }


	
	*/
	
}

	










	/*算法三：用我最开始的那个方法，愚蠢方法。  
	 *  API方法 将int  转换为 string x1------倒序将 x1中的元素 依次取出，放入x2中-----将X2转换为 int
	
	
	public int reverse(int x) {

		// reduce time: 减少重复步骤，减少循环数量，增加 每一次循环做的事,检测API库中的方法
		try {

			if (x > 0) {
				x1 = x + "";// 小转型中蕴含了 超级大的计算量
				for (int i = (x1.length() - 1); i >= 0; i--) {

					x2 += x1.charAt(i);// +"",加一个删一个，不用g
				}
//				x2+=x1.substring(x1.length()-1, 0);//避开，闭区间和开区间

			}

			else {
				x1 = -x + "-";
				for (int i = x1.length() - 1; i >= 0; i--) {

					x2 += x1.charAt(i);// +""
				}

			}

//			g=Integer.parseInt(x2);

			// for 循环从 后加到前
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
