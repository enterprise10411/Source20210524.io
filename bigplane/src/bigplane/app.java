package bigplane;

import java.awt.image.*;
import java.io.IOException;

import javax.imageio.ImageIO;

/* tool for handing image: laundry,,create an image so that I dont have to create it
 * ÿ��
	��ȡָ��λ���ϵ�ͼƬ,����Ҫ�ظ�ʹ�õĴ���������������ɹ��߷���
*/
public class app {
	
	public static BufferedImage getIma(String path) {
		try {
		BufferedImage g1=ImageIO.read(app.class.getResource(path));// image represetning class in java
		
	
		
		return g1;//�ҵ��� ͼƬ�����ͷ���ͼƬ
			
		} catch (Exception e) {	//�Ҳ������ͻᲶ�� �Ҳ���ͼƬ��ԭ��
			e.printStackTrace();
			System.out.println("��������");
		// TODO: handle exception
		}
		return null;
	}// try catchͬʱ����ʱ�������ȵ��� throw
	
}
