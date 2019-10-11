package bat.ke.qq.com.dao;

import bat.ke.qq.com.anno.Dao;
import bat.ke.qq.com.bean.Fox;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */

public interface IFoxDao {
	public void query();
	public void query(String name);
	public void query(String name, String sex);
	public void query(Fox fox);
}
