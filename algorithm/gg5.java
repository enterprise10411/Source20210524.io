package algorithm;

class Solution {
	/*�㷨1����forѭ���� haystack���������ַ���������û�з���n1�ģ�
	 * ���� ���ַ�Ϊ������Χ����һ����̬����
	
	����������õ��ǵڶ����㷨
	�����㷨2��������� �Ż�
	
	*/
	public int strStr(String haystack, String needle) {
		if (needle.length()==0) {
			return 0;
		}
		if (haystack.length()==0) {
			return -1;
		}

		for (int i = 0; i <haystack.length()-needle.length()-1; i++) {
			if(haystack.charAt(i)==needle.charAt(0)) {
				
				try {	
					if (needle.equals(haystack.substring(i,i+ needle.length()))) {
					return i;//[i,i+ needle.length())
				}

				} catch (Exception e) {
					return -1;
					// TODO: handle exception
				}

				
				
			}
		}
	
		return -1;


	}
	
	
	 public int strStr2(String haystack, String needle) {
	        if (needle.length() == 0)
	            return 0;
	        int i = 0;
	        int j = 0;
	        /**
	         * ����next��ʾpatternָ�����±�ǰ������ͬ���ַ���������������֯�������ã����ܲ���̫����⣬�Ҿٸ����Ӱ�
	         * ������ABCABA������next[0]��-1������ǹ̶��ģ���Ϊ��һ��Aǰ����û���ַ��ģ�next[1]��0����ΪB��ǰ���һ��A��û��
	         * �ظ��ģ�������0,ͬ��next[2]Ҳ��,next[3]Ҳ��0,��next[4]��1����Ϊnext[4]��ָ����ǵڶ���B���ڶ���Bǰ����һ��A��
	         * ��һ��A��ͬ��������1,next[5]��2����Ϊnext[5]��ָ��������һ��������Ϊǰ��ģ��Աȳɹ������ң�Ҳ�Աȳɹ��������ǣ���
	         * Ҳ���ǣ��������ַ���ƥ��ɹ�,�پٸ����ӣ�����WABCABA��������˵�һ��Ϊ-1�������Ķ���Ϊ0����Ϊֻ�е�һ��ƥ��ɹ�֮��
	         * ����ƥ�����ģ���Ȼ�����AB��ǰ���ABƥ��ɹ������Ǻ���AB��ǰ����C��ǰ��AB��ǰ��һ��W��ƥ�䣬���Ժ����ƥ�䶼��0.
	         * Ҫ��סֻ��ָ���ַ�ǰ����ַ��͵�һ���ַ�ƥ��ɹ���ʱ���������ƥ�䣬����������Զ�����Ⱥ͵�һ��ƥ�䡣
	         */
	        int[] next = new int[needle.length()];
	        getNext(needle, next);
	        while (i < haystack.length() && j < needle.length()) {
	            /**
	             * ����j����-1��ʱ��Ҳֻ��������next���鸳ֵ��ʱ��Ż���֣�����ֻ��������next[0]��ʱ��Ż����-1��
	             ����ʱ����û�еģ���һ��Ҫ���ǣ�����������next�����ʱ��ͻ��õ������������������⣬���j������-1��
	             �����±�i��j��ָ����ַ���ȣ���ôi��j�ֱ�������һλ�����Ƚϣ�����ܺ���⣬��ô���j==-1��ʱ�򣬾ͱ�ʾ
	             �ͱ�ʾǰ��û��ƥ��ɹ��ģ�ͬʱi������һλ��j��Ϊ0��j==-1��ʱ��j++Ϊ0�����ٴ�0��ʼ�Ƚϡ�
	             */
	            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
	                i++;
	                j++;
	            } else {
	                /**
	                 * i = i - j + 1;
	                 j = 0;
	                 ���ص�ָ����λ�ã����Ƿ��ص�ƥ��ʧ�ܵ���һ��λ�ã����ﶼ����⣬�ص���������next��
	                 ����ֻҪj����0����next[j]��ֵ��֮��j�ͻ����-1����Ϊnext[0]����-1
	                 */
	                j = next[j]; // j�ص�ָ��λ��
	            }
	            if (j == needle.length())
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
	         * ƥ���ʱ���ǵ�ǰ�ַ���ǰһ����ǰ���ƥ�䣬�������һ���ǲ�����ƥ��ģ����Կ�strStr������ע�ͣ�
	         */
	        while (i < len - 1) {
	            if (j == -1 || p.charAt(i) == p.charAt(j)) {
	                /**
	                 * ���j������-1��ָ�����ַ���ȣ���ôi��jҪ������һλ�����ܺ���⣬���jΪ-1��ʱ��i��������λ��j��Ϊ0
	                 * ���¿�ʼƥ�䡣next[i]��ƥ��ɹ�������
	                 */
	                i++;
	                j++;
	                next[i] = j;
	            } else
	            /**
	             * �ؼ������ﲻ����⣬Ϊʲôƥ��ʧ��Ҫ��next[j]����j��Ҫ��ס�����next[j]��ָƥ��ɹ����������п���Ϊ0��Ҳ�п�����������.����
	             * �ַ���ABCABXYABCABATDM,��Ӧ��next����Ϊ{-1	0	0	0	1	2	0	0	1	2	3	4	5	1	0	0	}
	             */
	                j = next[j];
	        }
	    }


}