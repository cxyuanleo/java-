package LinkedList;

import java.util.LinkedList;

//LinkedList类实现单向队列和双向队列的接口
public class LinkedListDemo {
    public static void main(String[] args) {
    	LinkedList list = new LinkedList();
    	list.addLast("b");//在尾部插入b元素
    	list.addLast("c");
    	list.addLast("d");
    	
    	list.addFirst("a");//在头部插入a元素
    	System.out.println(list);
    	
    	Object ele = list.get(0); //不擅长使用索引查元素  但是因为底层继承了List类
    	System.out.println(ele);
	}
}
