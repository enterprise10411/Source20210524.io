package algorithm;

public class gg1 {
	public static void main(String[] args) {
		
		
		
		
		
		
	}
	
	public void dsa(int []nums,String[]names) {
		
		System.out.println(nums[1]);// irrelavant to nums.size,awalys the same regarlss of it
		
		for (int i = 0; i < nums.length; i++) {//o(n)
			System.out.println(nums[i]);
			//running time propotionsal to nums.size
		}
		
		
		
		for (String string : names) {// iterator  o(m),, o(n)+o(m)
			for ( String string2 : names) {
				for (String string3 : names) {
					System.out.println(string);
				}
			}
			
			
		}
	}
}
