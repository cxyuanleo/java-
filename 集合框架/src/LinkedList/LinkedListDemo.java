package LinkedList;

import java.util.LinkedList;

//LinkedList��ʵ�ֵ�����к�˫����еĽӿ�
public class LinkedListDemo {
    public static void main(String[] args) {
    	LinkedList list = new LinkedList();
    	list.addLast("b");//��β������bԪ��
    	list.addLast("c");
    	list.addLast("d");
    	
    	list.addFirst("a");//��ͷ������aԪ��
    	System.out.println(list);
    	
    	Object ele = list.get(0); //���ó�ʹ��������Ԫ��  ������Ϊ�ײ�̳���List��
    	System.out.println(ele);
	}
}
