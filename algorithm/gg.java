package algorithm;
public class gg{
public int strStr(String haystack, String needle) {
    if (needle.length() == 0)
        return 0;
    int i = 0;
    int j = 0;
    /**
     * 

��Ϊǰ��ģ��Աȳɹ������ң�Ҳ�Աȳɹ��������ǣ���
     * Ҳ���ǣ��������ַ���ƥ��ɹ�,�پٸ����ӣ�����WABCABA��������˵�һ��Ϊ-1�������Ķ���Ϊ0����Ϊֻ�е�һ��ƥ��ɹ�֮��
     * ����ƥ�����ģ���Ȼ�����AB��ǰ���ABƥ��ɹ������Ǻ���AB��ǰ����C��ǰ��AB��ǰ��һ��W��ƥ�䣬���Ժ����ƥ�䶼��0.
     * Ҫ��סֻ��ָ���ַ�ǰ����ַ��͵�һ���ַ�ƥ��ɹ���ʱ���������ƥ�䣬����������Զ�����Ⱥ͵�һ��ƥ�䡣
     */
    int[] next = new int[needle.length()];
    getNext(needle, next);// ��needdle�������Ϣ ���� next�����next�ĳ��ȵ�������ɶ����
	/*next��ÿ��Ԫ�ص��趨������ɶ�� next[m]==n����ζ�ţ�p.charAt(m-1) == p.charAt(n-1)
	 * ��n>0����ͬʱ��ζ��     substring[[ needle[m-n],needle[m-1 ]]==substring[  needle[0],needle[n-1] ]
	 * 
	 * 
	 * ,�ر�أ� next[m]=n=0,��ζ�� needle[0]--needle[m-2]û����needle[m-1]��ͬ��Ԫ��
	 * �÷����ܷ�ʹnext�������ÿ��Ԫ�صĴ洢��Ϣ�����趨����һ��
	�۵�
	    
	         /*
                Ϊʲô����ƥ�䷽ʽ����ȷ�ģ���
		
		Ϊʲô����ƥ�䷽ʽ�Ǹ���Ч�ģ�
	    
	    */
while (i < haystack.length() && j < needle.length()) {
        /**
         * ����j����-1��ʱ��Ҳֻ��������next���鸳ֵ��ʱ��Ż���֣�����ֻ��������next[0]��ʱ��Ż����-1��
         ����ʱ����û�еģ���һ��Ҫ���ǣ�����������next�����ʱ��ͻ��õ������������������⣬���j������-1��
         �����±�i��j��ָ����ַ���ȣ���ôi��j�ֱ�������һλ�����Ƚϣ�����ܺ���⣬��ô���j==-1��ʱ�򣬾ͱ�ʾ
         �ͱ�ʾǰ��û��ƥ��ɹ��ģ�ͬʱi������һλ��j��Ϊ0��j==-1��ʱ��j++Ϊ0�����ٴ�0��ʼ�Ƚϡ�
     
	// ����һ��ʱ�����ϰ�������������Ѿ��ư�����ë��磬�����ܵС�
	 * ���� ������һ��ȭ������ھ�������ĳ��ѧ������ �ư�̫��ϵ֮ǰ����ϣ�������һ��СĿ�꣺�ưԵ���
		*/
       


	   if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
            i++;
            j++;
        } else {
     /*
                Ϊʲô����ƥ�䷽ʽ����ȷ�ģ���
		
		Ϊʲô����ƥ�䷽ʽ�Ǹ���Ч�ģ�
			 */
        	
        	System.out.println(" j:"+j+"  next[j]: "+next[j]);
            j = next[j]; // j�ص�ָ��λ�ã���next[j]:needle�����0 �� j-1�� �ظ���needle[j-1]��������e.g��i==5,haystack.charAt(5) == needle.charAt(4) ƥ��ʧ��
			//next[4]==2���� happy="WOTAKKNM",,,node="OAKKA"
			//֤���� ��haystack.charAt(5) == needle.charAt(2)����haystack.charAt(4) == needle.charAt(1)��haystack.charAt(3) == needle.charAt(0)
        }
        if (j == needle.length())// needle.charAt[0] ��needle.charAt[ needle.length()-1]�������ַ���ƥ��
            return i - j;
    }
    return -1;
}


















private void getNext(String p, int next[]) {
	int len = p.length();
	int i = 0;
	int j = -1;
	next[0] = -1;//���Ĭ�ϵģ�
	/**
	 * 
	 */
	while (i < len - 1) {//"ABCABAAAA"
		if (j == -1 || p.charAt(i) == p.charAt(j)) {
			/**	ǰ��һ�����ں���һ��
			 * ���j������-1��ָ�����ַ���ȣ���ôi��jҪ������һλ�����ܺ���⣬���jΪ-1��ʱ��i��������λ��j��Ϊ0
			 * ���¿�ʼƥ�䡣next[i]��ƥ��ɹ�������
			 */
			i++;
			j++;
			next[i] = j;// next[5]=2
//			System.out.println("i  :+"+i+p.charAt(i)+"  j  :"+p.charAt(j));
			//next[5]==2 is in the loop where p.charAt(4) == p.charAt(1);
		} else {
			/**
			 * �ؼ������ﲻ����⣬Ϊʲôƥ��ʧ��Ҫ��next[j]����j��Ҫ��ס�����next[j]��ָƥ��ɹ����������п���Ϊ0��Ҳ�п�����������.����
			 * �ַ���ABCABXYABCABATDM,��Ӧ��next����Ϊ{-1	0	0	0	1	2	0	0	1	2	3	4	5	1	0	0	}
			 */
			j = next[j];
		}//ifelse,ѭ�����а취��ֹ��i < len - 1��ʹ i+1��ѭ�������������޵ģ�������ܴ��ڡ�next[j]<=j
	}//while
}// getNext
//strStr

		public static void main(String[] args) {
			gg t=new gg();// next[i]���� ��ֵ�ľ���ֵ�Ĳ�ֵ<=1
			int[]next2=new int["ABCABCAAAAABCDDDDDABCDABCAD".length()];
//			System.out.println(t.strStr("WOAKKKKA", "OAKKA"));
			//understand getNext
			System.out.println("----------------------");
			System.out.println("----------------------");
			t.getNext("ABCABCAAAAABCDDDDDABCDABCAD", next2)//NEEDLE[I],hais needle[i-1]��
			;// main ����������զ����
			for (int i = 0; i < next2.length; i++) {
				System.out.println(i+"  "+next2[i]+"  "+"ABCABCAAAAABCDDDDDABCDABCAD".charAt(i));
				//next[m]��ֵ ֻ�� ǰ m-1���ַ��������йأ���needle[m]�޹�
			}
			System.out.println();
			System.out.println();
		}
}