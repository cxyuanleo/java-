package 集合迭代;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//集合迭代 遍历操作

public class IteratorDemo {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	
	
	//方式1：for循环  理论上可行 但是麻烦
	for(int index = 0;index<list.size();index++) {
		Object ele = list.get(index);//取出指定索引位置的元素
		System.out.println(ele);
	}
	
	//方式2：for-each 增强for循环
	for (Object ele : list) { //底层用的就是方式3的迭代器
		System.out.println(ele);
	}
	//方式3：使用迭代器 Iterator（）
	Iterator it =  list.iterator();//返回按适当顺序在列表的元素上进行迭代的迭代器
//	if(it.hasNext()) { //如果有下一个元素 没有下一个元素时不执行
//	System.out.println(it.next());//获取下一个元素  迭代器指针第一次指向第一个元素之前 并移动指针
//	}
    while(it.hasNext()) {
    System.out.println(it);
    }
	
	
	//方式4：使用for循环来操作迭代器
    for(Iterator it2 = list.iterator(); it2.hasNext();){
    	System.out.println(it2);
    }
    
}
}
