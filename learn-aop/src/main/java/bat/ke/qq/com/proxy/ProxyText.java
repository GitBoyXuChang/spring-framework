package bat.ke.qq.com.proxy;

import bat.ke.qq.com.bean.Fox;
import bat.ke.qq.com.mapper.UserMapper;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class ProxyText {

	public static void main(String[] args)  {

		byte[] b = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{UserMapper.class});

		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("$Proxy0.class");
			outputStream.write(b);
			outputStream.flush();
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
