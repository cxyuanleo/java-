package ջStack;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack s1 = new Stack();
	s1.push("c");//�ײ������� ���¼��ӵ��Ⱥ�˳��
	s1.push("b");//��Ԫ��Ҫʹ��push����   ��Ҫʹ��add   add��������vector���� ���ƻ���װ
	s1.push("a");
	System.out.println(s1);
	System.out.println(s1.peek());//ȡջ����Ԫ��
	s1.pop();//ɾ��ջ��
	System.out.println(s1.pop());
	//------------------------------------------------
	System.out.println("-------------------------------");
	
	//�ٷ�����ʹ��ArrayDeque  Ч����һ���� �������ջ����c    stackջ����a   ��˳��һ��
	ArrayDeque s2 = new ArrayDeque();
	s2.push("c");//�ײ������� ���¼��ӵ��Ⱥ�˳��
	s2.push("b");//��Ԫ��Ҫʹ��push����   ��Ҫʹ��add   add��������vector���� ���ƻ���װ
	s2.push("a");
	System.out.println(s2);
	System.out.println(s2.peek());//ȡջ����Ԫ��
	s2.pop();//ɾ��ջ��
	System.out.println(s2.pop());
	
}
}
