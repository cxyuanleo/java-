package 获取集合中的元素;
/*
 * 如何获取集合中的元素
 * 
 * Collection接口中有一个方法 
 * Iterator iteraror() 返回是接口的实现类对象
 * 下面所有的子接口和实现类都具有的方法
 * 返回值是接口类型 接口名字是Iterator
 *  boolean hasNext（）判断集合中有没有被取出来的元素 如果有 返回true
 *  Objict next（）获取集合 下一个元素
 *  执行接口中的方法hasNext next（）肯定运行实现类重写的方法
 *  
 *  iteartor方法是所有集合都有的一个方法
 *  将会返回Iterator接口的实现类对象 实现类就是集合的一个内部类
 *  
 *  写ArrayList集合的迭代器 关于迭代器
 *  迭代器就是获取集合中存储的对象凡是
 *  
 *  interface Iterator｛
 *  boolean hasNext（）；
 *  Object remove（）；
 *  ｝
 *  public class ArrayList implments Collection
 *  public Iterator iterator (){
 *  返回Iterator接口实现类的对象
 *  return new Itr
 *  }
 * 定义内部类
 * private class Itr implements Iterator｛
 * public boolean hasNext（）｛
 *return false ｝
 * public Object next（）｛
 * return null｝
 * ｝ 
 * ｝
 * main（）｛
 * Collection col = new　ArrayList（）；｝
 *   */
import java.util.*;
public class CollectionDemo2 {
public static void main(String[] args) {
	Collection col = new ArrayList();
	Iterator it = col.iterator();//ArrayList内部类的对象
	//对象col调用方法iteartor获取到的是Iterator接口实现类对象
	System.out.println(it);
}
}
