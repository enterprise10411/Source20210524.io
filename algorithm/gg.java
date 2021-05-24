package algorithm;
public class gg{
public int strStr(String haystack, String needle) {
    if (needle.length() == 0)
        return 0;
    int i = 0;
    int j = 0;
    /**
     * 

因为前面的Ａ对比成功，并且Ｂ也对比成功，所以是２，
     * 也就是ＡＢ两个字符串匹配成功,再举个例子，比如WABCABA，数组除了第一个为-1，其他的都是为0，因为只有第一个匹配成功之后
     * 才能匹配后面的，虽然后面的AB和前面的AB匹配成功，但是后面AB的前面是C和前面AB的前面一个W不匹配，所以后面的匹配都是0.
     * 要记住只有指定字符前面的字符和第一个字符匹配成功的时候才能往后匹配，否则后面的永远都是先和第一个匹配。
     */
    int[] next = new int[needle.length()];
    getNext(needle, next);// 将needdle的相关信息 放在 next数组里，next的长度的意义是啥？？
	/*next的每个元素的设定含义是啥？ next[m]==n，意味着：p.charAt(m-1) == p.charAt(n-1)
	 * 若n>0，则同时意味着     substring[[ needle[m-n],needle[m-1 ]]==substring[  needle[0],needle[n-1] ]
	 * 
	 * 
	 * ,特别地， next[m]=n=0,意味着 needle[0]--needle[m-2]没有与needle[m-1]相同的元素
	 * 该方法能否使next数组里的每个元素的存储信息与其设定含义一致
	槽点
	    
	         /*
                为什么这种匹配方式是正确的？？
		
		为什么这种匹配方式是更高效的？
	    
	    */
while (i < haystack.length() && j < needle.length()) {
        /**
         * 这里j等于-1的时候也只有在下面next数组赋值的时候才会出现，并且只有在数组next[0]的时候才会等于-1，
         其他时候是没有的，这一点要谨记，待会下面求next数组的时候就会用到。这里可以这样来理解，如果j不等于-1，
         并且下标i和j所指向的字符相等，那么i和j分别往后移一位继续比较，这个很好理解，那么如果j==-1的时候，就表示
         就表示前面没有匹配成功的，同时i往后移一位，j置为0（j==-1的时候，j++为0），再从0开始比较。
     
	// 经过一段时间的练习后，我宣布：我已经称霸了羽毛球界，无人能敌。
	 * 在我 像你们一样拳打世界冠军，脚踹某中学黎主任 称霸太阳系之前，我希望能完成一个小目标：称霸地球
		*/
       


	   if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
            i++;
            j++;
        } else {
     /*
                为什么这种匹配方式是正确的？？
		
		为什么这种匹配方式是更高效的？
			 */
        	
        	System.out.println(" j:"+j+"  next[j]: "+next[j]);
            j = next[j]; // j回到指定位置，，next[j]:needle数组从0 到 j-1的 重复的needle[j-1]的数量，e.g，i==5,haystack.charAt(5) == needle.charAt(4) 匹配失败
			//next[4]==2，， happy="WOTAKKNM",,,node="OAKKA"
			//证明： 若haystack.charAt(5) == needle.charAt(2)，则haystack.charAt(4) == needle.charAt(1)，haystack.charAt(3) == needle.charAt(0)
        }
        if (j == needle.length())// needle.charAt[0] 与needle.charAt[ needle.length()-1]的所有字符都匹配
            return i - j;
    }
    return -1;
}


















private void getNext(String p, int next[]) {
	int len = p.length();
	int i = 0;
	int j = -1;
	next[0] = -1;//这个默认的，
	/**
	 * 
	 */
	while (i < len - 1) {//"ABCABAAAA"
		if (j == -1 || p.charAt(i) == p.charAt(j)) {
			/**	前面一个等于后面一个
			 * 如果j不等于-1，指定的字符相等，那么i和j要往后移一位，这点很好理解，如果j为-1的时候，i往后移移位，j置为0
			 * 重新开始匹配。next[i]是匹配成功的数量
			 */
			i++;
			j++;
			next[i] = j;// next[5]=2
//			System.out.println("i  :+"+i+p.charAt(i)+"  j  :"+p.charAt(j));
			//next[5]==2 is in the loop where p.charAt(4) == p.charAt(1);
		} else {
			/**
			 * 关键是这里不好理解，为什么匹配失败要让next[j]等于j，要记住这里的next[j]是指匹配成功的数量，有可能为0，也有可能是其他数.比如
			 * 字符串ABCABXYABCABATDM,对应的next数组为{-1	0	0	0	1	2	0	0	1	2	3	4	5	1	0	0	}
			 */
			j = next[j];
		}//ifelse,循环总有办法终止，i < len - 1，使 i+1的循环次数总是有限的，任意和总存在。next[j]<=j
	}//while
}// getNext
//strStr

		public static void main(String[] args) {
			gg t=new gg();// next[i]左右 的值的绝对值的差值<=1
			int[]next2=new int["ABCABCAAAAABCDDDDDABCDABCAD".length()];
//			System.out.println(t.strStr("WOAKKKKA", "OAKKA"));
			//understand getNext
			System.out.println("----------------------");
			System.out.println("----------------------");
			t.getNext("ABCABCAAAAABCDDDDDABCDABCAD", next2)//NEEDLE[I],hais needle[i-1]的
			;// main 方法到底是咋回事
			for (int i = 0; i < next2.length; i++) {
				System.out.println(i+"  "+next2[i]+"  "+"ABCABCAAAAABCDDDDDABCDABCAD".charAt(i));
				//next[m]的值 只与 前 m-1个字符的排列有关，与needle[m]无关
			}
			System.out.println();
			System.out.println();
		}
}