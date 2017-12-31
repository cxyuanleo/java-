package Vector类;

import java.util.Vector;

public class VectorMethodDemo {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("a"); //自动装箱成字符串对象
	v.add("b");
	v.add("c");
	System.out.println(v);
	
	v.add(0,"will");  //底层是数组进行插入  性能低
	System.out.println(v);

	v.remove("b");// 删除
	v.set(1,"wlii");//替换
	v.get(2);//获取指定位置的元素
}
}
