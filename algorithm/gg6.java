package algorithm;

public class gg6 {
	public static void main(String[] args) {
		int b=40;
		for (int i = 0; i <20; i++) {
			b=(b|i);
			System.out.println(i+"  "+(b&28));// 没存过的数和它相乘，，结果照样是大于0的
		}
	}
}
