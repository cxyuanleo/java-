package 栈Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack s1 = new Stack();
	s1.push("c");//底层是数组 会记录添加的先后顺序
	s1.push("b");//存元素要使用push（）   不要使用add   add是他父类vector方法 会破坏封装
	s1.push("a");
	System.out.println(s1);
	System.out.println(s1.peek());//取栈顶的元素
	s1.pop();//删除栈顶
	System.out.println(s1.pop());
	//------------------------------------------------
	System.out.println("-------------------------------");
	
	//官方建议使用ArrayDeque  效果是一样的 但是这个栈顶是c    stack栈顶是a   就顺序不一样
	ArrayDeque s2 = new ArrayDeque();
	s2.push("c");//底层是数组 会记录添加的先后顺序
	s2.push("b");//存元素要使用push（）   不要使用add   add是他父类vector方法 会破坏封装
	s2.push("a");
	System.out.println(s2);
	System.out.println(s2.peek());//取栈顶的元素
	s2.pop();//删除栈顶
	System.out.println(s2.pop());
	
}
}
