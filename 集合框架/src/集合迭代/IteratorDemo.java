package ���ϵ���;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//���ϵ��� ��������

public class IteratorDemo {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	
	
	//��ʽ1��forѭ��  �����Ͽ��� �����鷳
	for(int index = 0;index<list.size();index++) {
		Object ele = list.get(index);//ȡ��ָ������λ�õ�Ԫ��
		System.out.println(ele);
	}
	
	//��ʽ2��for-each ��ǿforѭ��
	for (Object ele : list) { //�ײ��õľ��Ƿ�ʽ3�ĵ�����
		System.out.println(ele);
	}
	//��ʽ3��ʹ�õ����� Iterator����
	Iterator it =  list.iterator();//���ذ��ʵ�˳�����б��Ԫ���Ͻ��е����ĵ�����
//	if(it.hasNext()) { //�������һ��Ԫ�� û����һ��Ԫ��ʱ��ִ��
//	System.out.println(it.next());//��ȡ��һ��Ԫ��  ������ָ���һ��ָ���һ��Ԫ��֮ǰ ���ƶ�ָ��
//	}
    while(it.hasNext()) {
    System.out.println(it);
    }
	
	
	//��ʽ4��ʹ��forѭ��������������
    for(Iterator it2 = list.iterator(); it2.hasNext();){
    	System.out.println(it2);
    }
    
}
}
