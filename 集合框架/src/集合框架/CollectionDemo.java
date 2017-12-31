package 集合框架;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		method_6();
	}
	/*
	 * 集合转为数组 Object[] toArraay
	 */
	public static void method_6() {
		Collection coll=new ArrayList();
		coll.add("abc");
		coll.add(123);
		Object[] obj = coll.toArray();
		for(int x=0;x<obj.length;x++) {
			System.out.println(obj[x]);
		}
	}
	/*
	 * boolean remove(Object o)
	 * 移除集合中储存的对象
	 */
	public static void method_1() {
		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		boolean b = coll.remove("abc1");
		System.out.println(b);
		System.out.println(coll);
	}
	/*
	 * 判断集合中有没有元素
	 * boolean isEmpty（）
	 * 返回集合的长度 
	 * int size=coll.size();
	 */
	
	/*
	 * boolean add(Object e) 将元素添加到集合中
	 */
	public static void method() {
		//接口指向自己的实现类  多态使用
		Collection coll= new ArrayList();
		
		//调用方法add 存储到集合中
		coll.add(123);//向集合中存对象  用add方法
		coll.add(false);
		coll.add(3.6);
		/*
		 * 输出的是集合对象 指向的是ArrayList对象
		 * 看到的是集合中存储的全部内容
		 * ArrayList重写toString（）
		 * 虽然看到了集合中的元素 但是不称为遍历 打出来看看 仅此而已
		 */
		System.out.println(coll);
	}
}
