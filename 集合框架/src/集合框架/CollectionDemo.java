package ���Ͽ��;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		method_6();
	}
	/*
	 * ����תΪ���� Object[] toArraay
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
	 * �Ƴ������д���Ķ���
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
	 * �жϼ�������û��Ԫ��
	 * boolean isEmpty����
	 * ���ؼ��ϵĳ��� 
	 * int size=coll.size();
	 */
	
	/*
	 * boolean add(Object e) ��Ԫ����ӵ�������
	 */
	public static void method() {
		//�ӿ�ָ���Լ���ʵ����  ��̬ʹ��
		Collection coll= new ArrayList();
		
		//���÷���add �洢��������
		coll.add(123);//�򼯺��д����  ��add����
		coll.add(false);
		coll.add(3.6);
		/*
		 * ������Ǽ��϶��� ָ�����ArrayList����
		 * �������Ǽ����д洢��ȫ������
		 * ArrayList��дtoString����
		 * ��Ȼ�����˼����е�Ԫ�� ���ǲ���Ϊ���� ��������� ���˶���
		 */
		System.out.println(coll);
	}
}
