package bigplane;

import java.awt.image.*;
import java.io.IOException;

import javax.imageio.ImageIO;

/* tool for handing image: laundry,,create an image so that I dont have to create it
 * 每次
	读取指定位置上的图片,将需要重复使用的代码抽离出来，定义成工具方法
*/
public class app {
	
	public static BufferedImage getIma(String path) {
		try {
		BufferedImage g1=ImageIO.read(app.class.getResource(path));// image represetning class in java
		
	
		
		return g1;//找到了 图片，，就返回图片
			
		} catch (Exception e) {	//找不到，就会捕获 找不到图片的原因
			e.printStackTrace();
			System.out.println("哈？？？");
		// TODO: handle exception
		}
		return null;
	}// try catch同时存在时，，优先调用 throw
	
}
