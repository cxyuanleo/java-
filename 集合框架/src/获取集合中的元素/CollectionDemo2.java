package ��ȡ�����е�Ԫ��;
/*
 * ��λ�ȡ�����е�Ԫ��
 * 
 * Collection�ӿ�����һ������ 
 * Iterator iteraror() �����ǽӿڵ�ʵ�������
 * �������е��ӽӿں�ʵ���඼���еķ���
 * ����ֵ�ǽӿ����� �ӿ�������Iterator
 *  boolean hasNext�����жϼ�������û�б�ȡ������Ԫ�� ����� ����true
 *  Objict next������ȡ���� ��һ��Ԫ��
 *  ִ�нӿ��еķ���hasNext next�����϶�����ʵ������д�ķ���
 *  
 *  iteartor���������м��϶��е�һ������
 *  ���᷵��Iterator�ӿڵ�ʵ������� ʵ������Ǽ��ϵ�һ���ڲ���
 *  
 *  дArrayList���ϵĵ����� ���ڵ�����
 *  ���������ǻ�ȡ�����д洢�Ķ�����
 *  
 *  interface Iterator��
 *  boolean hasNext������
 *  Object remove������
 *  ��
 *  public class ArrayList implments Collection
 *  public Iterator iterator (){
 *  ����Iterator�ӿ�ʵ����Ķ���
 *  return new Itr
 *  }
 * �����ڲ���
 * private class Itr implements Iterator��
 * public boolean hasNext������
 *return false ��
 * public Object next������
 * return null��
 * �� 
 * ��
 * main������
 * Collection col = new��ArrayList��������
 *   */
import java.util.*;
public class CollectionDemo2 {
public static void main(String[] args) {
	Collection col = new ArrayList();
	Iterator it = col.iterator();//ArrayList�ڲ���Ķ���
	//����col���÷���iteartor��ȡ������Iterator�ӿ�ʵ�������
	System.out.println(it);
}
}
